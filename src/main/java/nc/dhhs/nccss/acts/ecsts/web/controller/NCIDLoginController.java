package nc.dhhs.nccss.acts.ecsts.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gov.nc.ncidng.ncidngwebservice.schemas.AuthenticateToNCIDv2Response;
import nc.dhhs.nccss.acts.ecsts.web.services.AuthenticationWebService;
import nc.dhhs.nccss.acts.ects.web.util.AppConstants;

@Controller
public class NCIDLoginController {
	
	@Autowired
	AuthenticationWebService authenticationWebService;

	@RequestMapping(value = "/login")
    public String login(HttpServletRequest request,Model model){
		/*AuthenticateToNCIDv2Response authenticateToNCIDv2Response = null;
		String loginName="sandeeptest";
		String password ="Saibaba1#";
		authenticateToNCIDv2Response=authenticationWebService.getNCIDAuthenticationReponse(loginName, password);
		String authenticationCode = authenticateToNCIDv2Response.getAuthenticateToNCIDv2Result().getMessageArray().getMessage()
				.get(0).getCode();
		String authDesc = authenticateToNCIDv2Response.getAuthenticateToNCIDv2Result().getMessageArray().getMessage().get(0)
				.getContent();
		System.out.println("***NCID authentication code = " + authenticationCode + ", authentication description = "
				+ authDesc);
		if (authenticationCode.equals(AppConstants.NCID_AUTH_SUCCESS)) {
			
		}
		
		*/
		return "Output";
	}
	
	/*@RequestMapping(value = "/loginsubmit")
    public String getNCIDAutentication(HttpServletRequest request,Model model){
		
		return "Output";
	}*/
}
