package org.pojoo;


import org.dsbabaseclass.DSBABaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewMemberMemberTagsScreen extends DSBABaseClass {
	
	public NewMemberMemberTagsScreen() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='13']")
	private WebElement barHistoryCommitteeCheckbox;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement nextButtonMemberTagsScreen;
	
	@FindBy(xpath="//div[text()='Back']")
	private WebElement backButtonMemberTagsScreen;

	public WebElement getBarHistoryCommitteeCheckbox() {
		return barHistoryCommitteeCheckbox;
	}

	public WebElement getNextButtonMemberTagsScreen() {
		return nextButtonMemberTagsScreen;
	}

	public WebElement getBackButtonMemberTagsScreen() {
		return backButtonMemberTagsScreen;
	}
	
	


}
