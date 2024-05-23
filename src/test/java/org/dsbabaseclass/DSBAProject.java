package org.dsbabaseclass;

import java.awt.AWTException;
import java.security.Permissions;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.pojoo.DsbaLoginPage;
import org.pojoo.DsbaSettings;
import org.pojoo.MembersScreen;
import org.pojoo.NewMemberMemberTagsScreen;
import org.pojoo.NewMemberPersonalInformation;
import org.pojoo.NewMemberPrimaryAddressScreen;
import org.pojoo.NewMemberPublishedAddressScreen;
import org.pojoo.NewMemberSectionsScreen;
import org.pojoo.OtherStateBarScreen;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSBAProject extends DSBABaseClass {
	 public static DsbaLoginPage login;
	 MembersScreen memberscreen;
	 NewMemberPersonalInformation personalInformation;
	 NewMemberPrimaryAddressScreen primaryAddress;
	 NewMemberPublishedAddressScreen publishAddress;
	 NewMemberSectionsScreen sectionScreen;
	 NewMemberMemberTagsScreen memberTag;
	 OtherStateBarScreen otherState;
	 DsbaSettings settingsScreen;
	
	@Given("User should be in DSBA login page")
	public void user_should_be_in_DSBA_login_page() {
	    launchChromeBrowser();
	    launchUrl("http://dev.dsba.mavinapps.com/dsba");
	    pageMaximize();
	    waitOfFluent(120,2);
	    login = new DsbaLoginPage();
	    f.until(ExpectedConditions.elementToBeClickable(login.getEmailIDField()));
	}

	@When("User have to enter valid id, password and tap on login button")
	public void user_have_to_enter_valid_id_password_and_tap_on_login_button() {
		login.getEmailIDField().sendKeys("joyner.mavin@gmail.com");
	    login.getPasswordField().sendKeys("123456");
	    clickUsingJavaScript(login.getLoginButton());
	    }
// ADD NEW MEMBER
	
	@When("User have to tap on new member button")
	public void user_have_to_tap_on_new_member_button() throws InterruptedException {
	    memberscreen = new MembersScreen();
	    f.until(ExpectedConditions.elementToBeClickable(memberscreen.getNewMemberButton()));
	    memberscreen.getNewMemberButton().click();
	    unconditionalWait(2000);
	}

	@When("User have to select member type,member code,member id,title,first name,last name,Esquire,gender,dob,admit date and tap on next button")
	public void user_have_to_select_member_type_member_code_member_id_title_first_name_last_name_Esquire_gender_dob_admit_date_and_tap_on_next_button() throws InterruptedException {
		personalInformation = new NewMemberPersonalInformation();
//		clickUsingJavaScript(personalInformation.getMemberTypeDropdown());
		selectRandomValuesFromDropdown(personalInformation.getMemberTypeDropdown());
		unconditionalWait(2000);
		selectRandomValuesFromDropdown(personalInformation.getMemberCodeDropdown());
		unconditionalWait(2000);
//		selectBySeeingValue(personalInformation.getMemberTypeDropdown(),"1");
//		clickUsingJavaScript(personalInformation.getMemberCodeDropdown());
//		unconditionalWait(2000);
//		selectBySeeingValue(personalInformation.getMemberCodeDropdown(),"4");
//		unconditionalWait(2000);
		personalInformation.getMemberIDField().sendKeys(generateRandomNumber(5));
		unconditionalWait(2000);
//		clickUsingJavaScript(personalInformation.getTitleField());
//		unconditionalWait(2000);
//		selectBySeeingValue(personalInformation.getTitleField(),"Mr");
//		unconditionalWait(2000);
		personalInformation.getFirstNameField().sendKeys(generateRandomName(5));
		unconditionalWait(2000);
		personalInformation.getLastNameField().sendKeys(generateRandomName(5));
		unconditionalWait(2000);
//		clickUsingJavaScript(personalInformation.getEsquireField());
//		selectBySeeingValue(personalInformation.getEsquireField(),"Hon");
		selectRandomValuesFromDropdown(personalInformation.getEsquireField());
		unconditionalWait(2000);
		clickUsingJavaScript(personalInformation.getGenderDropDown());
		unconditionalWait(2000);
		selectRandomValuesFromDropdown(personalInformation.getGenderDropDown());
		unconditionalWait(2000);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		if (text.equals("Male")){
			selectBySeeingText(personalInformation.getTitleField(),"Mr");
		} else {
			selectBySeeingText(personalInformation.getTitleField(),"Miss");
}
//		selectBySeeingText(personalInformation.getGenderDropDown(),"Male");
		unconditionalWait(2000);
		clickUsingJavaScript(personalInformation.getDobCalenderIcon());
		unconditionalWait(1000);
		clickUsingJavaScript(personalInformation.getDropdownButtonToViewYearList());
		unconditionalWait(2000);
//		personalInformation.getDobField().sendKeys(generateRandomDOB(1,12));
//		unconditionalWait(1000);
//		personalInformation.getDobField().sendKeys(generateRandomDOB(1,25));
//		unconditionalWait(1000);
//		personalInformation.getDobField().sendKeys(generateRandomDOB(1980,2000));
//		unconditionalWait(1000);
//		String[] dateComponents = randomDOB.split("/");
//		String month = dateComponents[0];
//        String day = dateComponents[1];
//        String year = dateComponents[2];
//        WebElement dobYear = driver.findElement(By.xpath("//button[text()='"+year+"']"));
//        dobYear.click();
//        unconditionalWait(2000);
//        WebElement dobDate = driver.findElement(By.xpath("//button[text()='"+day+"']"));
//        dobDate.click();
		dsbaDOBYear("1990");
		unconditionalWait(2000);
		dsbaDOBDate("20");
		unconditionalWait(2000);
//		personalInformation.getAdmitDateField().sendKeys(generateRandomDOB(1,12));
//		unconditionalWait(1000);
//		personalInformation.getAdmitDateField().sendKeys(generateRandomDOB(1,25));
//		unconditionalWait(1000);
//		personalInformation.getAdmitDateField().sendKeys(generateRandomDOB(1980,2000));
		unconditionalWait(1000);
		clickUsingJavaScript(personalInformation.getAdmitDateCalenderIcon());
		unconditionalWait(2000);
		clickUsingJavaScript(personalInformation.getDropdownButtonToViewYearList());
		unconditionalWait(2000);
		dsbaDOBYear("2022");
		unconditionalWait(2000);
		dsbaDOBDate("21");
		unconditionalWait(2000);
		clickUsingJavaScript(personalInformation.getNextButton());
		unconditionalWait(2000);
		}

	@When("User have to enter firm name,address {int},address {int},country,states,zip code, phone number,fax number, email id and tap on next button")
	public void user_have_to_enter_firm_name_address_address_country_states_zip_code_phone_number_fax_number_email_id_and_tap_on_next_button(Integer int1, Integer int2) throws InterruptedException, AWTException {
	    primaryAddress = new NewMemberPrimaryAddressScreen();
	    primaryAddress.getFirmNameField().sendKeys(generateRandomName(10));
	    unconditionalWait(2000);
//	    clickUsingJavaScript(primaryAddress.getAddress1Field());
//	    deleteField();
	  //  unconditionalWait(2000);
	    primaryAddress.getAddress1Field().sendKeys(generateRandomNumber(3));
	    unconditionalWait(1000);
	    primaryAddress.getAddress2Field().sendKeys(generateRandomNumber(3));
	    unconditionalWait(1000);
	    primaryAddress.getCountryField().sendKeys("USA");
	    unconditionalWait(1000);
	    selectRandomValuesFromDropdown(primaryAddress.getStateDropdown());
//	    clickUsingJavaScript(primaryAddress.getStateDropdown());
//	    selectBySeeingText(primaryAddress.getStateDropdown(),"Delaware");
//	    unconditionalWait(2000);
	    primaryAddress.getZipcodeField().sendKeys(generateRandomNumber(5));
	    unconditionalWait(1000);
	    primaryAddress.getPhoneNumberField().sendKeys(generateRandomNumber(10));
	    unconditionalWait(1000);
	    primaryAddress.getFaxNumberField().sendKeys(generateRandomNumber(10));
	    unconditionalWait(1000);
	    clickUsingJavaScript(primaryAddress.getEmailIDField());
	    unconditionalWait(2000);
	    primaryAddress.getEmailIDField().sendKeys(generateRandomName(8)+"@gmail.com");
	    unconditionalWait(1000);
	    clickUsingJavaScript(primaryAddress.getNextButtonPrimaryAddress());
	    unconditionalWait(3000);
	}

	@When("User have to enter firm name,address {int}, address {int},country,states,zip code,phone number,fax number,email id,firm admin name,admin phone number,admin email id and tap on next button")
	public void user_have_to_enter_firm_name_address_address_country_states_zip_code_phone_number_fax_number_email_id_firm_admin_name_admin_phone_number_admin_email_id_and_tap_on_next_button(Integer int1, Integer int2) throws InterruptedException, AWTException {
	    publishAddress = new NewMemberPublishedAddressScreen();
	    clickUsingJavaScript(publishAddress.getCopyFromPrimaryAddress());
	    unconditionalWait(2000);
//	    publishAddress.getFirmAdminName().sendKeys(generateRandomName(5));
//	    unconditionalWait(1000);
//	    publishAddress.getAdminPhoneNumber().sendKeys(generateRandomNumber(10));
//	    unconditionalWait(1000);
//	    publishAddress.getAdminEmailID().sendKeys(generateRandomName(6)+"gmail.com");
//	    unconditionalWait(1000);
//	    primaryAddress.getFirmNameField().sendKeys("Justice firm");
//	    f.until(ExpectedConditions.visibilityOf(primaryAddress.getAddress1Field()));
//	    primaryAddress.getAddress1Field().sendKeys("22");
//	    f.until(ExpectedConditions.visibilityOf(primaryAddress.getAddress2Field()));
//	    primaryAddress.getAddress2Field().sendKeys("55");
//	    unconditionalWait(1000);
//	    primaryAddress.getCountryField().sendKeys("USA");
//	    unconditionalWait(1000);
//	    clickUsingJavaScript(primaryAddress.getStateDropdown());
//	    selectBySeeingValue(primaryAddress.getStateDropdown(),"Delaware");
//	    primaryAddress.getZipcodeField().sendKeys("43322");
//	    primaryAddress.getPhoneNumberField().sendKeys("7883345622");
//	    unconditionalWait(1000);
//	    primaryAddress.getFaxNumberField().sendKeys("5670023111");
//	    unconditionalWait(1000);
//	    primaryAddress.getEmailIDField().sendKeys("associates278a@gmail.com");
//	    unconditionalWait(1000);
//	    publishAddress.getFirmAdminName().sendKeys("Ben");
//	    unconditionalWait(1000);
//	    publishAddress.getAdminPhoneNumber().sendKeys("9885567333");
//	    unconditionalWait(1000);
//	    publishAddress.getAdminEmailID().sendKeys("ben234@yahoo.com");
//	    unconditionalWait(1000);
   clickUsingJavaScript(publishAddress.getNextButtonPublishedAddress());
	    
	}

	@When("User have to select options in sections and tap on next button")
	public void user_have_to_select_options_in_sections_and_tap_on_next_button() throws InterruptedException {
	    sectionScreen = new NewMemberSectionsScreen();
	    f.until(ExpectedConditions.visibilityOf(sectionScreen.getCommercialCheckbox()));
	    unconditionalWait(3000);
	    List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='checkbox']"));
	    unconditionalWait(1000);
	    int box = new Random().nextInt(checkboxes.size());
	    unconditionalWait(1000);
	    checkboxes.get(box).click();
	    
	    
	    
	    
	    //	    if (checkboxes.size() > 0) {
//            // Generate a random index
//            Random random = new Random();
//            int randomIndex = random.nextInt(checkboxes.size());
//
//            // Select the checkbox at the random index
//            WebElement randomCheckbox = checkboxes.get(randomIndex);
//            randomCheckbox.click();
//
//            // Wait for a moment to see the selected checkbox (you might want to handle this more robustly)
//            //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        }
//            clickUsingJavaScript(sectionScreen.getCommercialCheckbox());
//	    unconditionalWait(1000);
	    clickUsingJavaScript(sectionScreen.getNextButtonSectionsScreen());
	}


	@When("User have to select options in member tags and tap on next button")
	public void user_have_to_select_options_in_member_tags_and_tap_on_next_button() throws InterruptedException {
	    memberTag = new NewMemberMemberTagsScreen();
	    f.until(ExpectedConditions.visibilityOf(memberTag.getBarHistoryCommitteeCheckbox()));
	    List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='checkbox']"));
	    unconditionalWait(1000);
	    int box = new Random().nextInt(checkboxes.size());
	    unconditionalWait(1000);
	    checkboxes.get(box).click();
//	    clickUsingJavaScript(memberTag.getBarHistoryCommitteeCheckbox());
//	    unconditionalWait(1000);
	    clickUsingJavaScript(memberTag.getNextButtonMemberTagsScreen());
	}

	@When("User have to select states,admit date,other statebar id and tap on save button")
	public void user_have_to_select_states_admit_date_other_statebar_id_and_tap_on_save_button() throws InterruptedException {
		otherState = new OtherStateBarScreen();
		selectRandomValuesFromDropdown(otherState.getState1Dropdown());
//		clickUsingJavaScript(otherState.getState1Dropdown());
//		unconditionalWait(1000);
//		selectBySeeingText(otherState.getState1Dropdown(),"Baker Island");
//		unconditionalWait(1000);
		clickUsingJavaScript(otherState.getAdmitDateCalenderIcon1());
		unconditionalWait(1000);
		clickUsingJavaScript(otherState.getCalenderDropdownToListYear());
		unconditionalWait(1000);
		dsbaDOBYear("2022");
		unconditionalWait(1000);
		dsbaDOBDate("22");
		unconditionalWait(1000);
		otherState.getOtherStateBarID1().sendKeys(generateRandomNumber(3));
		unconditionalWait(1000);
//	clickUsingJavaScript(otherState.getSaveButton());
	    
	}

	@Then("New member is created successfully")
	public void new_member_is_created_successfully() {
	   System.out.println("New member is added successfully");
	}
	
// ADD NEW USER
	
	@When("User have to tap settings icon")
	public void user_have_to_tap_settings_icon() throws InterruptedException {
	    settingsScreen = new DsbaSettings();
	    f.until(ExpectedConditions.elementToBeClickable(settingsScreen.getSettingsIcon()));
	    clickUsingJavaScript(settingsScreen.getSettingsIcon());
	    unconditionalWait(1000);
	}
	@When("USer have to tap add new user button")
	public void user_have_to_tap_add_new_user_button() throws InterruptedException {
	    f.until(ExpectedConditions.elementToBeClickable(settingsScreen.getAddNewUserButton()));
	    clickUsingJavaScript(settingsScreen.getAddNewUserButton());
	    unconditionalWait(1000);
	}

	@When("User have to enter first name,last name ,email address and tap on submit button.")
	public void user_have_to_enter_first_name_last_name_email_address_and_tap_on_submit_button() throws InterruptedException {
	    f.until(ExpectedConditions.visibilityOf(settingsScreen.getAddUserFirstName()));
	    settingsScreen.getAddUserFirstName().sendKeys("Alice");
	    unconditionalWait(1000);
	    settingsScreen.getAddUserLastName().sendKeys("Ken");
	    unconditionalWait(1000);
	    settingsScreen.getAddUserEmailAddress().sendKeys("alice.ken@gmail.com");
	    unconditionalWait(1000);
	    clickUsingJavaScript(settingsScreen.getSubmitButtonInAddUserScreen());
	}

	@Then("User is added successfully")
	public void user_is_added_successfully() {
	    System.out.println("User is added successfully");
	}

	

}
