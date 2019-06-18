package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ChangePass {
private WebDriver driver; 
	
	public ChangePass(WebDriver driver) {
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
	
	@FindBy(linkText="Change your password")
	private WebElement changepass;
	
	@FindBy(id="input-password")
	private WebElement inputpass;
	
	@FindBy(id="input-confirm")
	private WebElement inputconfirm;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement Continue;
	
	@FindBy(xpath="//div[@class='text-danger']")
	private WebElement ErrorMessage;
	
	
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
	
	public void Changepass()
	{
		this.changepass.click();
	}
	
	public void currpass(String Password1)
	{
		this.inputpass.sendKeys(Password1);
	}
	
	public void confirmpass(String confirmpass1)
	{
		this.inputconfirm.sendKeys(confirmpass1);
	}
	
	public void clickcontinue()
	{
		this.Continue.click();
	}
	
	public void VerifyError()
	{
		String ExpectedError= "Password confirmation does not match password!";
		String ErrorMessage = this.ErrorMessage.getText();
		Assert.assertEquals(ExpectedError, ErrorMessage);
		
	}

}
