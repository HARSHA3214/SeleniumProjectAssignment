package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RegisterPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RegisterTest {
	private WebDriver driver;
	private String baseUrl;
	private RegisterPOM registerPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private String MyAccount;
	private String Register;
	private String agreecheck;
	private String Continue;
	private String submit;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		registerPOM = new RegisterPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	//@BeforeMethod
	/*public void validLoginTest() throws InterruptedException {
		Thread.sleep(5000);
		registerPOM.sendFirstName("Harsha");
		registerPOM.sendLastname("Regulavalasa");
		registerPOM.sendEmail("abc@gmail.com");
		registerPOM.sendTelephone("123567989");
		registerPOM.sendAddress1("Chennai");
		registerPOM.sendCity("Chennai");
		registerPOM.sendPostcode("600089");
		registerPOM.sendState("TamilNadu");
		registerPOM.sendPassword("harsha123");
		registerPOM.sendConfirmpass("harsha123");
		screenShot.captureScreenShot("First");
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}*/
	@Test
	public void validLoginTest() throws InterruptedException {
		Thread.sleep(5000);
		registerPOM.clickMyAccount(MyAccount);
		registerPOM.clickRegister(Register);
		registerPOM.sendFirstName("Harsha");
		registerPOM.sendLastname("Regulavalasa");
		registerPOM.sendEmail("harsha.regulavalasa@gmail.com");
		registerPOM.sendTelephone("123567989");
		registerPOM.sendAddress1("Chennai");
		registerPOM.sendCity("Chennai");
		registerPOM.sendPostcode("600089");
		registerPOM.sendState("TamilNadu");
		registerPOM.sendPassword("harsha123");
		registerPOM.sendConfirmpass("harsha123");
		registerPOM.clickAgree(agreecheck);
		registerPOM.clickSubmit(submit);
		registerPOM.clickContinue(Continue);
		
		//screenShot.captureScreenShot("First");
	}

}
