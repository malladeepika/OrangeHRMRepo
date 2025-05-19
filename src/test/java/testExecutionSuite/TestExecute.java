package testExecutionSuite;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import basePack.BaseClass;

public class TestExecute extends BaseClass {
	@Test(priority=1)
	public void Register() throws IOException, InterruptedException {
		Register r = new Register();
		r.registertest();
	}  
}