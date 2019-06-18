package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.AddCartPOM;
import com.training.pom.ChangePass;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AddCartTest {
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	private WebDriver driver;
	private AddCartPOM AddCart;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
	private String MyAccount;
	private String Login;
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		AddCart = new AddCartPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	@Test
	public void validChangePass() throws InterruptedException {
		Thread.sleep(5000);
		AddCart.clickMyAccount(MyAccount);
		AddCart.clickLogin(Login);
		AddCart.sendUserName("harsha.regulavalasa@gmail.com");
		AddCart.sendPassword("harsha123");
		AddCart.clickLoginBtn();
		AddCart.clickUniformstore();
		AddCart.clickShopUniform();
		AddCart.clickShopTShirt();
		AddCart.SelectChestSize();
		AddCart.clickAddCart();
		AddCart.clickToViewCart();
		AddCart.clickToViewCartSub();
		screenShot.captureScreenShot("Addtocart1");

}
}
