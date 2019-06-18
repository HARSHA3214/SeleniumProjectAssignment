package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ChangePass;
import com.training.pom.RegisterPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ChangePassTest {
	private static Properties properties;
	private ChangePass changePass;
	private WebDriver driver;
	private String baseUrl;
	private ScreenShot screenShot;
	private String MyAccount;
	private String Login;
	private String userName;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		changePass = new ChangePass(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	@Test
	public void validChangePass() throws InterruptedException {
		Thread.sleep(5000);
		changePass.clickMyAccount(MyAccount);
		changePass.clickLogin(Login);
		changePass.sendUserName("harsha.regulavalasa@gmail.com");
		changePass.sendPassword("harsha123");
		changePass.clickLoginBtn();
		changePass.Changepass();
		changePass.currpass("harsha321");
		changePass.confirmpass("harsha543");
		changePass.clickcontinue();
		changePass.VerifyError();
		screenShot.captureScreenShot("Verifyerror");
	}
	

}
