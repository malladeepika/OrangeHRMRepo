
package testExecutionSuite;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import jdk.internal.org.jline.utils.Timeout;

public class Register extends ReusableCode {

	public  void registertest() throws InterruptedException, IOException
	{   
		
		xp("xp").click();
		xp("xn").sendKeys(obj.getProperty("uname"));
		xp("xemail").sendKeys(obj.getProperty("email"));
		xp("xsign").click();
		//after login
        xp("xradio").click();
		xp("xpwd").sendKeys(obj.getProperty("pwd"));
		xp("xday").click();
		xp("xmonth").click();
		xp("xyear").click();
		xp("xcheck").click();
		xp("xc").click();
		//Address information
		xp("aname").sendKeys(obj.getProperty("name"));
		xp("alast").sendKeys(obj.getProperty("last"));
		xp("cm").sendKeys(obj.getProperty("com"));
		xp("ad").sendKeys(obj.getProperty("address"));
		xp("ad2").sendKeys(obj.getProperty("address2"));
		xp("country").click();
		xp("st").sendKeys(obj.getProperty("state"));
		xp("ct").sendKeys(obj.getProperty("city"));
		xp("zp").sendKeys(obj.getProperty("zipcode"));
		xp("ph").sendKeys(obj.getProperty("phone"));
		xp("create").click();
		
		
		
		/*public class ConfirmationHelper {

		    private WebDriver driver;
		    private WebDriverWait wait;

		    public ConfirmationHelper(WebDriver driver) {
		        this.driver = driver;
		        this.wait = new WebDriverWait(driver, 10);
		    }

		    public String getConfirmationMessage(By locator) {
		        try {
		            WebElement msgConfirm = wait.until(
		                ExpectedConditions.visibilityOfElementLocated(locator)
		            );
		            return msgConfirm.getText();
		        } catch (Exception e) {
		            System.err.println("Failed to get confirmation message: " + e.getMessage());
		            return null;
		        }
		    
        }*/
		
		
		
		
		
		//screenshot("register");
		
	}
}