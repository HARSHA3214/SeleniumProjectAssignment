package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCartPOM {
private WebDriver driver; 
	
	public AddCartPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='My Account']")
	private WebElement MyAccount; 
	
	@FindBy(linkText="Login")
	private WebElement Login;
	
	@FindBy(id="input-email")
	private WebElement loginemail; 
	
	@FindBy(id="input-password")
	private WebElement loginpassword;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginBtn; 
	
	@FindBy(linkText="Uniform Store")
	private WebElement Uniformstore;
	
	@FindBy(xpath="//img[@class='img-responsive'and @alt='banner1']")
	private WebElement ShopUniform;
	
	@FindBy(xpath="//img[@alt='SPORTS T-SHIRTS']")
	private WebElement ShopTshirt;
	
	@FindBy(id="button-cart")
	private WebElement AddCart;
	
	@FindBy(xpath= "//option[@value=1021]")
	private WebElement Chestsize;
	
	@FindBy(xpath= "//button[contains(@class,'btn-inverse')]")
	private WebElement ViewCart;
	
	@FindBy(xpath= "//a[contains(@href,'cart')]")
	private WebElement ViewCartsub;
	
	public void clickMyAccount(String MyAccount)
	{
		this.MyAccount.click();
	}
	public void clickLogin(String Login)
	{
		this.Login.click();
	}
	
	public void sendUserName(String userName) {
		this.loginemail.clear();
		this.loginemail.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.loginpassword.clear(); 
		this.loginpassword.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clickUniformstore() {
		this.Uniformstore.click(); 
	}
	
	public void clickShopUniform() {
		this.ShopUniform.click();
	}
	
	public void clickShopTShirt() {
		this.ShopTshirt.click();
	}
	
	public void SelectChestSize() {
		this.Chestsize.click();			
	}
	
	
	public void clickAddCart() {
		this.AddCart.click();
	}
	
	public void clickToViewCart() {
		this.ViewCart.click();
	}
	
	public void clickToViewCartSub() {
		this.ViewCartsub.click();
	}
	
}

