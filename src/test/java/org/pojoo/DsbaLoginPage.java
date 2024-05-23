package org.pojoo;

import org.dsbabaseclass.DSBABaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.internal.BaseClassFinder;

public class DsbaLoginPage extends DSBABaseClass {
	public DsbaLoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@placeholder='Enter your email']")
	private WebElement emailIDField;
	
	@FindBy(xpath="//input[@placeholder='Enter your password']")
	private WebElement passwordField;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginButton;

	public WebElement getEmailIDField() {
		return emailIDField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	

}
