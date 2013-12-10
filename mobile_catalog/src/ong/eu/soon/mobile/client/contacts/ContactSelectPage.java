/*
    This file is part of Cyclos (www.cyclos.org).
    A project of the Social Trade Organisation (www.socialtrade.org).

    Cyclos is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    Cyclos is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Cyclos; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 */
package ong.eu.soon.mobile.client.contacts;

import java.util.Arrays;
import java.util.List;

import ong.eu.soon.mobile.client.Navigation;
import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.client.ui.Page;
import ong.eu.soon.mobile.client.ui.PageAnchor;
import ong.eu.soon.mobile.client.utils.PageAction;
import ong.eu.soon.mobile.client.utils.ParameterKey;


/**
 * A {@link Page} used to select a contact before make a payment.
 */
public class ContactSelectPage extends ContactsPage {
    
    @Override
    public String getHeading() {
        return messages.selectContactHeading();
    }

    /**
     * Go to make payment's page sending selected member contact id as parameter
     */
    @Override
    protected void navigateTo(Long memberId) {
        Parameters params = new Parameters();
        params.add(ParameterKey.ID, memberId);   
        Navigation.get().go(PageAnchor.FUND_TRANSFER, params);    
    }
    
    @Override
    public List<PageAction> getPageActions() {
        return Arrays.asList(getCancelAction());
    }
    
    /**
     * Returns cancel's page action
     */
    private PageAction getCancelAction() {
        return new PageAction() {
            @Override
            public void run() {
                Navigation.get().go(PageAnchor.SERVICES);
            }
            @Override
            public String getLabel() {
                return messages.cancel();
            }            
        };
    }
}
