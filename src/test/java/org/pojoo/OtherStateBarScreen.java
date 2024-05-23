package org.pojoo;

import org.dsbabaseclass.DSBABaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtherStateBarScreen extends DSBABaseClass{
	
	public OtherStateBarScreen() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//select[@name='State1']")
	private WebElement state1Dropdown;
	
	@FindBy(xpath="(//button[@aria-label='Choose date'])[1]")
	private WebElement admitDateCalenderIcon1;
	
	@FindBy(xpath="//button[@aria-label='calendar view is open, switch to year view']")
	private WebElement calenderDropdownToListYear;
	
	@FindBy(xpath="//input[@id='OtherStatebarId1']")
	private WebElement otherStateBarID1;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath="//div[text()='Back']")
	private WebElement backButtonOtherStateBarScreen;
	
	@FindBy(xpath="//textarea[@placeholder='Comments']")
	private WebElement commentsTextArea;

	public WebElement getState1Dropdown() {
		return state1Dropdown;
	}

	public WebElement getAdmitDateCalenderIcon1() {
		return admitDateCalenderIcon1;
	}

	public WebElement getCalenderDropdownToListYear() {
		return calenderDropdownToListYear;
	}

	public WebElement getOtherStateBarID1() {
		return otherStateBarID1;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getBackButtonOtherStateBarScreen() {
		return backButtonOtherStateBarScreen;
	}

	public WebElement getCommentsTextArea() {
		return commentsTextArea;
	}
	
	
	
	

}
