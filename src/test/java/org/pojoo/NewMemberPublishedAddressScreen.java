package org.pojoo;


import org.dsbabaseclass.DSBABaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewMemberPublishedAddressScreen extends DSBABaseClass {
	
	public NewMemberPublishedAddressScreen() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[text()='Copy from Primary Address']")
	private WebElement copyFromPrimaryAddress;
	
	public WebElement getCopyFromPrimaryAddress() {
		return copyFromPrimaryAddress;
	}
	
	@FindBy(xpath="//input[@id='FirmAdminName']")
	private WebElement firmAdminName;
	
	@FindBy(xpath="//input[@id='AdminPhoneNumber']")
	private WebElement adminPhoneNumber;
	
	@FindBy(xpath="//input[@id='AdminEmailId']")
	private WebElement adminEmailID;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement nextButtonPublishedAddress;
	
	@FindBy(xpath="//div[text()='Back']")
	private WebElement bakButtonInPublishedAddress;

	public WebElement getFirmAdminName() {
		return firmAdminName;
	}

	public WebElement getAdminPhoneNumber() {
		return adminPhoneNumber;
	}

	public WebElement getAdminEmailID() {
		return adminEmailID;
	}

	public WebElement getNextButtonPublishedAddress() {
		return nextButtonPublishedAddress;
	}

	public WebElement getBakButtonInPublishedAddress() {
		return bakButtonInPublishedAddress;
	}
	
	

}
