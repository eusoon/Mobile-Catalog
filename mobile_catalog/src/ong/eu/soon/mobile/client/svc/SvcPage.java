package ong.eu.soon.mobile.client.svc;



import ong.eu.soon.ifx.element.RecSelect;
import ong.eu.soon.ifx.service.SvcInqRq;
import ong.eu.soon.mobile.client.IFX;
import ong.eu.soon.mobile.client.LoggedUser;
import ong.eu.soon.mobile.client.Navigation;
import ong.eu.soon.mobile.client.Notification;
import ong.eu.soon.mobile.client.Notification.NotificationLayout;
import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.client.model.Svc;
import ong.eu.soon.mobile.client.services.SvcService;
import ong.eu.soon.mobile.client.ui.Icon;
import ong.eu.soon.mobile.client.ui.Page;
import ong.eu.soon.mobile.client.ui.PageAnchor;
import ong.eu.soon.mobile.client.ui.widgets.SimpleDataList;
import ong.eu.soon.mobile.client.ui.widgets.SvcRow;
import ong.eu.soon.mobile.json.ifx.element.SvcRec;
import ong.eu.soon.mobile.json.ifx.service.SvcInqRs;




import com.google.gwt.cell.client.Cell.Context;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONNull;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Widget;

/**
 * A {@link Page} used to display contacts. 
 */
public class SvcPage extends Page {

    private SvcService svcService = GWT.create(SvcService.class);

    @Override
    public String getHeading() {
        return messages.svcHeading();
    }

    @Override
    public boolean hasCustomScroll() {     
        return true;
    }
    
    @Override
    public Widget initialize() {
        
        // List pages uses fixed notification layout
        Notification.get().setLayout(NotificationLayout.FIXED);
        
        SimpleDataList<Svc> dataList = new SimpleDataList<Svc>() {
            
            @Override
            protected Widget onRender(Context context, Svc data) {                
                
                // Value can be null
                if (data == null) {
                  return null;
                }
                
                // Create row widget
                SvcRow row = new SvcRow();
                row.setImage(Icon.SVC.image());
                row.setHeading(data.getSvcName());
//                row.setSub(data.getMember().getName());               
                
                return row;
            }

            @Override
            protected void onSearchData(final AsyncCallback<JsArray<Svc>> callback) {
                // Fetch contacts
            	final LoggedUser loggedUser=LoggedUser.get();
                Parameters params=new Parameters();
                SvcInqRq svcInqRq=new SvcInqRq();
                svcInqRq.setRqUID(IFX.getRqUID("SVC"));
                svcInqRq.setMsgRqHdr(IFX.getMsgRqHdr(loggedUser,"svcInq"));
           
				RecSelect[] recSelect=new RecSelect[1];
				String partyId="Maybank";
				recSelect[0].setString("$svcRec.svcEnvr.partykeys[partyId='"+ partyId+"']");
				svcInqRq.setRecSelect(recSelect);
				params.add("svcInqRq", svcInqRq);
				 AsyncCallback<SvcInqRs> callback1=new AsyncCallback<SvcInqRs> (){

					@Override
					public void onFailure(Throwable caught) {
						callback.onFailure(caught);
						
					}

					@Override
					public void onSuccess(SvcInqRs svcInqRs) {
						JSONArray arr = new JSONArray();
						JsArray<SvcRec> svcRecs=svcInqRs.getSvcRec();
						for (int i=0; i<svcRecs.length();i++)
						{
							SvcRec svcRec=svcRecs.get(i);
							JSONObject svc = new JSONObject();
							String svcId=svcRec.getSvcId().getString();
							svc.put("id", getAsJSONString(svcId));
							String svcName=svcRec.getSvcInfo().getSvcName().getString();
							svc.put("svcName", getAsJSONString(svcName));
						}
						JsArray<Svc> result1=arr.getJavaScriptObject().cast();
						callback.onSuccess(result1);
						
					}
					 
				 };
				 svcService.getServices(params,callback1);
            }
            private JSONValue getAsJSONString(String value) {
        		if (value == null) {
        			return JSONNull.getInstance();
        		}

        		return new JSONString(value);
        	}
            @Override
            protected void onRowSelected(Svc value) {   
                // Go to the selected page
                navigateTo(value);
            }          
        };

        return dataList;
    }
        
    /**
     * Navigates to the relevant page  according parameters     
     */
    protected void navigateTo(Svc svc) {
        if(svc.getSvcType().equalsIgnoreCase(PageAnchor.FUND_TRANSFER.name())){
        	Navigation.get().go(PageAnchor.FUND_TRANSFER); 
        }else if(svc.getSvcType().equalsIgnoreCase(PageAnchor.SWIFT_TRANSFER.name())){
        	Navigation.get().go(PageAnchor.SWIFT_TRANSFER);  
        }else if(svc.getSvcType().equalsIgnoreCase(PageAnchor.PAYMENTS.name())){
        	Navigation.get().go(PageAnchor.PAYMENTS);  
        }
    }
    
}
