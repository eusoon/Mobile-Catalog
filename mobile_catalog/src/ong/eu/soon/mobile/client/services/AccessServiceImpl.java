/*
   This file is part of Cyclos.

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
package ong.eu.soon.mobile.client.services;

import ong.eu.soon.mobile.client.Configuration;
import ong.eu.soon.mobile.client.model.InitialData;
import ong.eu.soon.mobile.client.model.OTP;
import ong.eu.soon.mobile.client.model.Parameters;
import ong.eu.soon.mobile.client.utils.BaseAsyncCallback;
import ong.eu.soon.mobile.client.utils.RestRequest;

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.user.client.rpc.AsyncCallback;


/**
 * Implementation for {@link AccessService}.
 * 
 * @author luis
 */
public class AccessServiceImpl implements AccessService {
	@Override
	public void login(String username, String password,
			AsyncCallback<InitialData> callback, Parameters parameters) {
		RestRequest<InitialData> request = new RestRequest<InitialData>(
				RequestBuilder.POST, "access/initialData");
		request.setUsername(username);
		request.setPassword(password);
		request.setParameters(parameters);
		request.send(callback);
	}

	@Override
	public void newOTP(BaseAsyncCallback<OTP> callback) {
		RestRequest<OTP> request = new RestRequest<OTP>(RequestBuilder.GET,
				"access/newotp");
		request.sendAuthenticated(callback);

	}

	
	@Override
	public void getKerberosToken(Parameters params ,AsyncCallback<String> callback) {
		RestRequest<String> request = new RestRequest<String>(RequestBuilder.GET,
				"kerberos");
		request.setParameters(params);
		request.send(callback);
	}
}
