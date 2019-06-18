package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM {

private WebDriver driver; 
	
	public RegisterPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='My Account']")
	private WebElement MyAccount; 
	
	@FindBy(linkText="Register")
	private WebElement Register;
	
	@FindBy(id="input-firstname")
	private WebElement Firstname;
	
	@FindBy(id="input-lastname")
	private WebElement Lastname;
	
	@FindBy(id="input-email")
	private WebElement email;
	
	@FindBy(id="input-telephone")
	private WebElement telephone;
	
	@FindBy(id="input-address-1")
	private WebElement address1;
	
	@FindBy(id="input-city")
	private WebElement city;
	
	@FindBy(id="input-postcode")
	private WebElement postcode;
	
	@FindBy(id="input-zone")
	private WebElement state;
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(id="input-confirm")
	private WebElement confirmpass;
	
	@FindBy(name="agree")
	private WebElement agreecheck;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	@FindBy(linkText="Continue")
	private WebElement Continue;
	 
	
	public void clickMyAccount(String MyAccount)
	{
		this.MyAccount.click();
	}
	public void clickRegister(String Register)
	{
		this.Register.click();
	}
	
	
	public void sendFirstName(String Firstname) {
		this.Firstname.clear();
		this.Firstname.sendKeys(Firstname);
	}
	
	public void sendLastname(String Lastname) {
		this.Lastname.clear(); 
		this.Lastname.sendKeys(Lastname); 
	}
	
	public void sendEmail(String email)
	{
		this.email.clear();
		this.email.sendKeys(email);
	}
	public void sendTelephone(String Telephone)
	{
		this.telephone.clear();
		this.telephone.sendKeys(Telephone);
	}
	public void sendAddress1(String Address1)
	{
		this.address1.sendKeys(Address1);
	}
	public void sendCity(String City)
	{
		this.city.sendKeys(City);
	}
	public void sendPostcode(String Postcode)
	{
		this.postcode.sendKeys(Postcode);
	}
	public void sendState(String State)
	{
		this.state.sendKeys(State);
	}
	public void sendPassword(String Password)
	{
		this.password.sendKeys(Password);
	}
	public void sendConfirmpass(String Confirmpass)
	{
		this.confirmpass.sendKeys(Confirmpass);
	}
	public void clickAgree(String agreecheck)
	{
		this.agreecheck.click();
	}
	public void clickSubmit(String submit)
	{
		this.submit.click();
	}
	public void clickContinue(String Continue)
	{
		this.Continue.click();
	}
}

