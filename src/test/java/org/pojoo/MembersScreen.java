package org.pojoo;

import org.dsbabaseclass.DSBABaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MembersScreen extends DSBABaseClass{
	public MembersScreen() {
PageFactory.initElements(driver,this);
}
@FindBy(xpath="//span[text()='New Member']")
private WebElement newMemberButton;

public WebElement getNewMemberButton() {
	return newMemberButton;
}
}
