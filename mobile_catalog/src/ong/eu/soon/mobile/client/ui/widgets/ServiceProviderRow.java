package ong.eu.soon.mobile.client.ui.widgets;

import ong.eu.soon.mobile.client.utils.StringHelper;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;

public class ServiceProviderRow extends Composite{
	private FlowPanel container;
    private FlowPanel rowContent;
    private FlowPanel leftContainer;
    private FlowPanel rightContainer;
    
    public ServiceProviderRow(){
    	 container = new FlowPanel();
         container.setStyleName("row");
         
         rowContent = new FlowPanel();
         rowContent.setStyleName("row-content");
         
         leftContainer = new FlowPanel();
         leftContainer.addStyleName("row-left-column");
         
         rightContainer = new FlowPanel();
         rightContainer.addStyleName("row-right-column");
         
         rowContent.add(leftContainer);
         rowContent.add(rightContainer);
         
         container.add(rowContent);        
         
         initWidget(container);
    }
    /**
     * Sets left container style
     */
    public void setLeftStyle(String style) {
        if(StringHelper.isNotEmpty(style)) {
            leftContainer.addStyleName(style);
        }
    }    

    /**
     * Sets right container style
     */
    public void setRightStyle(String style) {
        if(StringHelper.isNotEmpty(style)) {
            rightContainer.addStyleName(style);
        }
    }
    
    /**
     * Sets the row heading
     */
    public void setHeading(String heading) {
        setHeading(heading, null);
    }
    
    /**
     * Sets the row heading adding a custom style
     */
    public void setHeading(String heading, String style) {
        Label headingLabel = new Label(heading);
        headingLabel.addStyleName("row-heading");
        if(StringHelper.isNotEmpty(style)) {
            headingLabel.addStyleName(style);
        }
        leftContainer.add(headingLabel);
    }
    
    /**
     * Sets the row sub-heading    
     */
    public void setSub(String description) {
        setSub(description, null);
    }
    
    /**
     * Sets the row sub-heading adding a custom style    
     */
    public void setSub(String description, String style) {
        Label descriptionLabel = new Label(description);
        descriptionLabel.addStyleName("row-sub");
        if(StringHelper.isNotEmpty(style)) {
            descriptionLabel.addStyleName(style);
        }
        leftContainer.add(descriptionLabel);
    }
    
    /**
     * Sets the row value adding a custom style
     */
    public void setValue(String value, String style) {
        setValue(value, null, style);
    }
    
    /**
     * Sets the row value
     */
    public void setValue(String value, Boolean positive) {
        setValue(value, positive, null);
    }
    
    /**
     * Sets the row value adding a custom style
     */
    public void setValue(String value, Boolean positive, String style) {
        Label valueLabel = new Label(value);       
        if(positive != null) {
            valueLabel.addStyleName(positive ? "amount-positive" : "amount-negative");
        }
        if(StringHelper.isNotEmpty(style)) {
            valueLabel.addStyleName(style);
        }
        rightContainer.add(valueLabel);
    }
}
