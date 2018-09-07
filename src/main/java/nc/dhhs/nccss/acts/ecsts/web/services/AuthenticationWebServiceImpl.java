package nc.dhhs.nccss.acts.ecsts.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.WebServiceException;
import org.springframework.ws.client.core.WebServiceTemplate;

import gov.nc.ncidng.ncidngwebservice.schemas.AuthenticateToNCIDv2Request;
import gov.nc.ncidng.ncidngwebservice.schemas.AuthenticateToNCIDv2Response;
import gov.nc.ncidng.ncidngwebservice.schemas.SearchUserByLoginIDRequest;
import gov.nc.ncidng.ncidngwebservice.schemas.SearchUserByLoginIDResponse;

@Service
public class AuthenticationWebServiceImpl implements AuthenticationWebService {
	@Autowired
	private WebServiceTemplate	webServiceTemplate;

	public AuthenticateToNCIDv2Response getNCIDAuthenticationReponse(String loginName, String password)
			throws WebServiceException {
		webServiceTemplate.setDefaultUri("https://idpdncid.nc.gov/ncidwebservice/ncidws.wsdl");
		AuthenticateToNCIDv2Request authenticateToNCIDv2Request  = new AuthenticateToNCIDv2Request();
		authenticateToNCIDv2Request.setAppID("dhhs-ssp-appid");
		authenticateToNCIDv2Request.setAppPassword("#appssp#");
		authenticateToNCIDv2Request.setUserID(loginName);
		authenticateToNCIDv2Request.setUserPassword(password);
		AuthenticateToNCIDv2Response authResponse = (AuthenticateToNCIDv2Response) webServiceTemplate.marshalSendAndReceive(authenticateToNCIDv2Request);
		return (authResponse == null ? null : authResponse);
	}

	public SearchUserByLoginIDResponse searchUserByLoginID(String loginName) throws WebServiceException {
		SearchUserByLoginIDRequest sLogInIDRequest = new SearchUserByLoginIDRequest();
		sLogInIDRequest.setUserID(loginName);
		sLogInIDRequest.setAppID("dhhs-ssp-appid");
		sLogInIDRequest.setAppPassword("#appssp#");
		sLogInIDRequest.setSearchOp("OEM");

		SearchUserByLoginIDResponse slogInIDResponse = (SearchUserByLoginIDResponse) webServiceTemplate.marshalSendAndReceive(sLogInIDRequest);

		return slogInIDResponse;
		 
	}

}
