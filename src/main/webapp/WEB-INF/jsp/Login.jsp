<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 
<link href="${pageContext.request.contextPath}/resources/css/style1.css" rel="stylesheet" type="text/css" />
<title>SSP Portal</title>
</head>
<body>
<form id="form1"  action="loginsubmit" method="post">
<img class="style1" id="Image1" style="width: 730px;" src="Images/Banner.jpg">
<div class="main">
            
    <br>
    <br>
    <br>
    <span class="style2" id="MainContent_Label1" >FPLS State Services Portal     </span>
    <br>
    <br>
    <br>
	  <table id="MainContent_sysLogin"  cellspacing="0" cellpadding="0">
	<tbody><tr>
		<td>
            <table style="border-collapse: collapse;" cellspacing="0" cellpadding="4">
                <tbody><tr>
                    <td>
                        <table cellpadding="0">
                            <tbody><tr>
                                <td align="left" valign="middle">
                                    <label id="MainContent_sysLogin_UserNameLabel" for="MainContent_sysLogin_UserName">NCID:    </label>
                                </td>
                                <td>
                                    <input name="ctl00$MainContent$sysLogin$UserName" id="MainContent_sysLogin_UserName" style="width: 150px; font-size: small;" type="text">
                                    <span title="User Name is required." class="failureNotification" id="MainContent_sysLogin_UserNameRequired" style="visibility: hidden;">*</span>
                                </td>
                            </tr>
                            <tr>
                                <td align="left" valign="middle">
                                    <label id="MainContent_sysLogin_PasswordLabel" for="MainContent_sysLogin_Password">Password:  </label>
                                </td>
                                <td>
                                    <input name="ctl00$MainContent$sysLogin$Password" id="MainContent_sysLogin_Password" style="width: 150px; font-size: small;" type="password">
                                    <span title="Password is required" class="failureNotification" id="MainContent_sysLogin_PasswordRequired" style="visibility: hidden;">*</span>
                                </td>
                            </tr>
                            <tr>
                                <td align="center" style="color: red;" colspan="2">
                                </td>
                            </tr>
                            </tr>
                            <tr>
                                <td align="right" colspan="2">
                                    <input name="ctl00$MainContent$sysLogin$LoginButton" id="MainContent_sysLogin_LoginButton" onclick='javascript:WebForm_DoPostBackWithOptions(new WebForm_PostBackOptions("ctl00$MainContent$sysLogin$LoginButton", "", true, "LoginUserValidationGroup", "", false, false))' type="submit" value="Login">
                                </td>
                            </tr>
                        </tbody></table>
                    </td>
                </tr>
            </tbody></table>
        </td>
	</tr>
</tbody></table>
</br>
</br>
<span class="style6" id="MainContent_Label3" style="width: 563px; color: rgb(0, 0, 102); font-size: x-large; font-weight: bold; display: inline-block; background-color: silver;">WARNING</span>

<span class="style7" id="MainContent_Label4" style="width: 563px; height: 50px; color: rgb(0, 0, 102); font-size: small; display: inline-block; background-color: silver;">To be used by authorized users on official business only<br> Data accessed may contain confidential Federal Tax Information</span>
<span class="style4"><br> </span>
</br>
</br>
</br>
</br>
</div>
<div class="style8">
        <strong>For NCID assistance, contact your NCID administrator, 
        <br>
        or to reset your NCID password visit, <a href="https://ncid.nc.gov" target="_blank">https://ncid.nc.gov </a></strong>
    </div>
</form>	
</body>
</html>