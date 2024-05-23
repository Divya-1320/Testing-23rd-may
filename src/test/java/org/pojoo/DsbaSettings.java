package org.pojoo;

import org.dsbabaseclass.DSBABaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DsbaSettings extends DSBABaseClass {
	public DsbaSettings() {
		PageFactory.initElements(driver,this);
}
	
	
	@FindBy(xpath="//div[text()='Settings']")
	private WebElement settingsIcon;
	
	@FindBy(xpath="//span[text()='Add New User']")
	private WebElement addNewUserButton;
	
	@FindBy(xpath="//input[@id='FirstName']")
	private WebElement addUserFirstName;
	
	@FindBy(xpath="//input[@id='LastName']")
	private WebElement addUserLastName;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement addUserEmailAddress;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submitButtonInAddUserScreen;

	public WebElement getSettingsIcon() {
		return settingsIcon;
	}

	public WebElement getAddNewUserButton() {
		return addNewUserButton;
	}

	public WebElement getAddUserFirstName() {
		return addUserFirstName;
	}

	public WebElement getAddUserLastName() {
		return addUserLastName;
	}

	public WebElement getAddUserEmailAddress() {
		return addUserEmailAddress;
	}

	public WebElement getSubmitButtonInAddUserScreen() {
		return submitButtonInAddUserScreen;
	}
	
	
	
	
	
	
	
	

}
