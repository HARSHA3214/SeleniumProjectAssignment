package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveCartPOM {
private WebDriver driver; 
	
	public RemoveCartPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[@data-toggle='tooltip'])[2]")
	private WebElement RemoveCart; 
	
	public void clickToRemoveFromCart() {
		this.RemoveCart.click();
	}
	

}
