package org.pojoo;


import org.dsbabaseclass.DSBABaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewMemberPersonalInformation extends DSBABaseClass {
	public NewMemberPersonalInformation() {
		PageFactory.initElements(driver,this);
}
	
	@FindBy(xpath="//select[@id='MemberTypeId']")
	private WebElement memberTypeDropdown;
	
	public WebElement getMemberTypeDropdown() {
		return memberTypeDropdown;
	}

	public WebElement getMemberCodeDropdown() {
		return memberCodeDropdown;
	}

	public WebElement getMemberIDField() {
		return memberIDField;
	}

	public WebElement getTitleField() {
		return titleField;
	}

	public WebElement getFirstNameField() {
		return firstNameField;
	}

	public WebElement getLastNameField() {
		return lastNameField;
	}

	public WebElement getEsquireField() {
		return esquireField;
	}

	public WebElement getGenderDropDown() {
		return genderDropDown;
	}

	public WebElement getDobCalenderIcon() {
		return dobCalenderIcon;
	}

	public WebElement getDropdownButtonToViewYearList() {
		return dropdownButtonToViewYearList;
	}

	public WebElement getAdmitDateCalenderIcon() {
		return admitDateCalenderIcon;
	}

	@FindBy(xpath="//select[@id='MemberCodeId']")
	private WebElement memberCodeDropdown;
	
	@FindBy(xpath="//input[@id='BarId']")
	private WebElement memberIDField;
	
	@FindBy(xpath="//select[@name='Title']")
	private WebElement titleField;
	
	@FindBy(xpath="//input[@id='FirstName']")
	private WebElement firstNameField;
	
	@FindBy(xpath="//input[@id='LastName']")
	private WebElement lastNameField;
	
	@FindBy(xpath="//select[@name='Esquire']")
	private WebElement esquireField;
	
	@FindBy(xpath="//select[@name='Gender']")
	private WebElement genderDropDown;
	
	@FindBy(xpath="(//button[@aria-label='Choose date'])[1]")
	private WebElement dobCalenderIcon;
	
	@FindBy(xpath="//button[@aria-label='calendar view is open, switch to year view']")
	private WebElement dropdownButtonToViewYearList;
	
	@FindBy(xpath="(//button[@aria-label='Choose date'])[1]")
	private WebElement admitDateCalenderIcon;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement nextButtonPersonalInformation;

	public WebElement getNextButton() {
		return nextButtonPersonalInformation;
	}
	@FindBy(xpath="//button[@class='MuiPickersYear-yearButton css-a057sq']")
private WebElement dobYear;
	
	public WebElement getDobYear() {
		return dobYear;
	}
	
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiPickersDay-root MuiPickersDay-dayWithMargin css-18923fx']")
	private WebElement dobDate;
	
	public WebElement getDobDate() {
		return dobDate;
	}
	
	@FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[1]")
	private WebElement dobField;
	
	public WebElement getDobField() {
		return dobField;
	}
	
	@FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[2]")
	private WebElement admitDateField;
	
	public WebElement getAdmitDateField() {
		return admitDateField;
	}
	
	@FindBy(xpath="(//div[@class='input-field-div-wrapper-small'])[3]")
	private WebElement genderFieldDivClass;
	
	public WebElement getGenderFieldDivClass() {
		return genderFieldDivClass;
	}
	
	
	
	
}