package org.pojoo;

import org.dsbabaseclass.DSBABaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewMemberSectionsScreen extends DSBABaseClass{
	public NewMemberSectionsScreen() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='3']")
	private WebElement commercialCheckbox;
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement nextButtonSectionsScreen;
	
	@FindBy(xpath="//div[text()='Back']")
	private WebElement backButtonSectionsScreen;

	public WebElement getCommercialCheckbox() {
		return commercialCheckbox;
	}

	public WebElement getNextButtonSectionsScreen() {
		return nextButtonSectionsScreen;
	}

	public WebElement getBackButtonSectionsScreen() {
		return backButtonSectionsScreen;
	}
	@FindBy(xpath="//div[@class='sections-section']")
	private WebElement fullSectionOptions;
	
	public WebElement getFullSectionOptions() {
		return fullSectionOptions;
	}
	
	

}
