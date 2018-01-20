package appModule;
 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import pageObjects.LandingPage;
import utility.Constant;
import utility.Log;
import utility.Utility;

 
 public class LandingPage_Action {

	 @SuppressWarnings("unused")
	private static final TimeUnit SECONDS = null;

	public static void clickLoginlnk(WebDriver driver)throws Exception{    
    	 
		LandingPage.lnk_LogIn(driver).click();
        Log.info("Click action performed on Landing Page");        
        Utility.waitForUrlNotTobe(Constant.URL, 120);
     }

     
}