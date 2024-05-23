package org.pojoo;


import org.dsbabaseclass.DSBABaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewMemberPrimaryAddressScreen extends DSBABaseClass{
	
	public NewMemberPrimaryAddressScreen() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='FirmName']")
	private WebElement firmNameField;
	
	@FindBy(xpath="//input[@id='Address1']")
	private WebElement address1Field;
	
	@FindBy(xpath="//input[@id='Address2']")
	private WebElement address2Field;
	
	@FindBy(xpath="//input[@id='County']")
	private WebElement countryField;
	
	@FindBy(xpath="//select[@name='State']")
	private WebElement stateDropdown;
	
	@FindBy(xpath="//input[@id='Zipcode']")
	private WebElement zipcodeField;
	
	@FindBy(xpath="//input[@id='PhoneNumber']")
	private WebElement phoneNumberField;
	
	@FindBy(xpath="//input[@id='FaxNumber']")
	private WebElement faxNumberField;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement emailIDField;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement nextButtonPrimaryAddress;
	
	@FindBy(xpath="//div[text()='Back']")
	private WebElement bakButtonInPrimaryAddress;

	public WebElement getFirmNameField() {
		return firmNameField;
	}

	public WebElement getAddress1Field() {
		return address1Field;
	}

	public WebElement getAddress2Field() {
		return address2Field;
	}

	public WebElement getCountryField() {
		return countryField;
	}

	public WebElement getStateDropdown() {
		return stateDropdown;
	}

	public WebElement getZipcodeField() {
		return zipcodeField;
	}

	public WebElement getPhoneNumberField() {
		return phoneNumberField;
	}

	public WebElement getFaxNumberField() {
		return faxNumberField;
	}

	public WebElement getEmailIDField() {
		return emailIDField;
	}

	public WebElement getNextButtonPrimaryAddress() {
		return nextButtonPrimaryAddress;
	}

	public WebElement getBakButtonInPrimaryAddress() {
		return bakButtonInPrimaryAddress;
	}
	
	

}
