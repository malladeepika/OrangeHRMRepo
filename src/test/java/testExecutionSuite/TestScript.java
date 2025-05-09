package testExecutionSuite;


import java.io.IOException;


public class TestScript extends ReusableCode {

	public void login() throws IOException, InterruptedException {
		driver.get(obj.getProperty("URL"));
		screenshot("HomePage");
		timeout(2);
		xp("XUN").sendKeys(obj.getProperty("UN"));
		xp("XPWD").sendKeys(obj.getProperty("PWD"));
		screenshot("UsernamePassword");
		timeout(2);
		xp("XCLK").click();
		screenshot("AfterLogin");
		timeout(2);
	}
}
