package com.qa.pages;

import com.qa.common.GetLocator;
import com.qa.common.Keywords;
public class LoginPage {
	
	   
	    private static  String pageName = "Login";
	    
	    public static void setUserName(String strUserName) {
	    	Keywords.setText(GetLocator.findElement(pageName,"textboxUsername") ,strUserName);
	    }
	      
	    public static void setPassword(String strPassword){
	    	Keywords.setText(GetLocator.findElement(pageName,"textboxPassword") ,strPassword);
	    }
		 
	    public static void clickLogin(){
	    	Keywords.click(GetLocator.findElement(pageName,"buttonLogin"));
	    	Keywords.waitForElementVisibility(GetLocator.findElement("FlightFinder","buttonContinue"), 30);
	     }
	    
        public static void loginToApp(String strUserName,String strPassword){
	        //Fill user name
	        setUserName(strUserName);
	        //Fill password
	        setPassword(strPassword);
	        //Click Login button
	        clickLogin();
	   } 
        
        public static String getPageTitle() {
			return Keywords.getPageTitle();
		}
        
        public static void signOut() {
        	Keywords.click(GetLocator.findElement(pageName,"buttonLogout"));
        	Keywords.waitForElementVisibility(GetLocator.findElement("Login","textboxUsername"), 30);
        }
                	
}  
        

	
