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
package ong.eu.soon.rest.sec.web.controller;

import java.util.Collection;
import java.util.List;

import my.com.infopro.ibank.app.dto.KeyDto;
import my.com.infopro.ibank.app.ejb.SecretKeyServiceRemote;
import my.com.infopro.ibank.app.utility.ServiceLocator;
import my.com.infopro.ibank.exception.ServiceLocatorException;

import ong.eu.soon.rest.common.security.SpringSecurityUtil;
import ong.eu.soon.rest.sec.model.PrincipalType;
import ong.eu.soon.rest.sec.model.Privilege;
import ong.eu.soon.rest.sec.model.Role;
import ong.eu.soon.rest.sec.model.PrincipalType.Credentials;
import ong.eu.soon.rest.sec.model.PrincipalType.Principal;
import ong.eu.soon.rest.sec.model.dto.User;
import ong.eu.soon.rest.sec.persistence.service.ImageService;
import ong.eu.soon.rest.sec.web.common.UriMappingConstants;
import ong.eu.soon.webservices.model.ImageVO;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Sets;
/**
 * Controller which handles /general paths. This is the only REST service which runs without authentication.
 * 
 * @author luis
 */
@Controller
@RequestMapping(value = UriMappingConstants.REST)
public class GeneralRestController {
	public static enum CredentialTypeVO {
		LOGIN_PASSWORD, TRANSACTION_PASSWORD, PIN, CARD_SECURITY_CODE
	}

	public static class GeneralData {
		private String cyclosVersion;
		private String applicationName;
		private String welcomeMessage;
		private PrincipalTypeVO principalType;

		private CredentialTypeVO credentialType;
		private List<ImageVO> images;

		private String publicExponent;
		private String modulus;
		private Long keySerial;
		private String secretKey;

		private String authenticationMode;

		public String getApplicationName() {
			return applicationName;
		}

		public CredentialTypeVO getCredentialType() {
			return credentialType;
		}

		public String getApplicationVersion() {
			return cyclosVersion;
		}

		public List<ImageVO> getImages() {
			return images;
		}



		public PrincipalTypeVO getPrincipalType() {
			return principalType;
		}

		public String getWelcomeMessage() {
			return welcomeMessage;
		}

		public void setApplicationName(final String applicationName1) {
			applicationName = applicationName1;
		}

		public void setCredentialType(final CredentialTypeVO credentialType1) {
			credentialType = credentialType1;
		}

		public void setApplicationVersion(final String cyclosVersion1) {
			cyclosVersion = cyclosVersion1;
		}

		public void setImages(final List<ImageVO> images1) {
			images = images1;
		}


		public void setPrincipalType(final PrincipalTypeVO principalType1) {
			principalType = principalType1;
		}

		public void setWelcomeMessage(final String welcomeMessage1) {
			welcomeMessage = welcomeMessage1;
		}

		@Override
		public String toString() {
			return "GeneralData [cyclosVersion=" + cyclosVersion
					+ ", welcomeMessage=" + welcomeMessage
					+ ", applicationName=" + applicationName
					+ ", principalType=" + principalType
					+ ", credentialType=" + credentialType + ", images="
					+ images + "]";
		}

		public String getPublicExponent() {
			return publicExponent;
		}

		public void setPublicExponent(String publicExponent1) {
			publicExponent = publicExponent1;
		}

		public String getModulus() {
			return modulus;
		}

		public void setModulus(String modulus1) {
			modulus = modulus1;
		}

		public Long getKeySerial() {
			return keySerial;
		}

		public void setKeySerial(Long keySerial1) {
			keySerial = keySerial1;
		}

		public String getSecretKey() {
			return secretKey;
		}

		public void setSecretKey(String secretKey1) {
			secretKey = secretKey1;
		}

		public String getAuthenticationMode() {
			return authenticationMode;
		}

		public void setAuthenticationMode(String authenticationMode1) {
			authenticationMode = authenticationMode1;
		}


	}

	public static enum PrincipalTypeVO {
		USER, EMAIL, CARD, CUSTOM_FIELD
	}

	public static enum AuthenticationMode {
		BASIC, DIGEST, HMAC, SIGNATURE, KERBOROS
	}
	private ImageService imageService;

	/**
	 * Returns general metadata about the service
	 */
	@RequestMapping(value = "general", method = RequestMethod.GET)
	@ResponseBody
	public GeneralData getGeneralData() {

		final Authentication authenticationInSpring = SpringSecurityUtil
				.getCurrentAuthentication();

		final Function<GrantedAuthority, Privilege> springAuthorityToPrivilegeFunction = new Function<GrantedAuthority, Privilege>() {
			@Override
			public final Privilege apply(final GrantedAuthority springAuthority) {
				return new Privilege(springAuthority.getAuthority());
			}
		};
		final Collection<Privilege> privileges = Collections2.transform(
				authenticationInSpring.getAuthorities(),
				springAuthorityToPrivilegeFunction);
		final Role defaultRole = new Role("defaultRole",
				Sets.<Privilege> newHashSet(privileges));

		final User user = new User(
				authenticationInSpring.getName(),
				(String) authenticationInSpring.getCredentials(),
				Sets.<Role> newHashSet(defaultRole));

		PrincipalType principalType = new PrincipalType(Principal.USER);
		principalType.setUser(user);
		Credentials credentials = Credentials.DEFAULT;
		if (credentials == Credentials.DEFAULT) {
			credentials = Credentials.LOGIN_PASSWORD;
		}
		GeneralData data = new GeneralData();
		data.setWelcomeMessage("");
		data.setApplicationName("INFOPRO Mobile Payment");
		data.setApplicationVersion("1.0");
		data.setPrincipalType(PrincipalTypeVO.valueOf(principalType
				.getPrincipal().name()));
		data.setCredentialType(CredentialTypeVO.valueOf(credentials.name()));
		data.setAuthenticationMode(AuthenticationMode.BASIC.toString());
		try {

			SecretKeyServiceRemote secretKeyServiceRemote = (SecretKeyServiceRemote) ServiceLocator
					.getInstance().getLocalService(
							SecretKeyServiceRemote.JNDI_NAME);
			KeyDto rpk = secretKeyServiceRemote.getRandomPublicKey();
			data.setKeySerial(rpk.getKeySerial());
			data.setModulus(rpk.getModulus().trim());
			data.setPublicExponent(rpk.getPubExp().trim());

		} catch (ServiceLocatorException e1) {
			e1.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}


		/*
		 * List<ImageVO> imageVos = new ArrayList<ImageVO>(); List<SystemImage>
		 * images = imageService.listByNature(Nature.SYSTEM); for (SystemImage
		 * systemImage : images) { String simpleName =
		 * systemImage.getSimpleName(); if
		 * (simpleName.startsWith("mobileSplash")) { ImageVO vo =
		 * imageService.getImageVO(systemImage); vo.setCaption(simpleName);
		 * imageVos.add(vo); } } data.setImages(imageVos);
		 */

		return data;
	}


}
