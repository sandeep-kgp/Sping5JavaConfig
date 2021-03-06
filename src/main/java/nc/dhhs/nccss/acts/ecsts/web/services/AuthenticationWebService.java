package nc.dhhs.nccss.acts.ecsts.web.services;

import org.springframework.ws.WebServiceException;

import gov.nc.ncidng.ncidngwebservice.schemas.AuthenticateToNCIDv2Response;
import gov.nc.ncidng.ncidngwebservice.schemas.SearchUserByLoginIDResponse;

public interface AuthenticationWebService {
	/**
	 * @param loginName
	 * @param password
	 * @return
	 * @throws WebServiceException
	 */
	public AuthenticateToNCIDv2Response getNCIDAuthenticationReponse(String loginName, String password) throws WebServiceException;

	/**
	 * @param loginName
	 * @return
	 * @throws WebServiceException
	 */
	public SearchUserByLoginIDResponse searchUserByLoginID(String loginName) throws WebServiceException;

}
