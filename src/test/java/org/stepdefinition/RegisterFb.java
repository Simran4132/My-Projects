package org.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class RegisterFb extends BaseClass {
	
	SigninPojo s;

	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
		lanchBrowser();
		WindoMaximize();
	}

	@When("To launch url of fb application")
	public void to_launch_url_of_fb_application() {
		launchUrl("https://www.facebook.com/");
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button()  {	
		s=new SigninPojo();
		clickbtn(s.getCreateNewAcc());
		
		
	}

	@When("To pass firstname in firstname text box")
	public void to_pass_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		List<String> l = d.asList();
		s=new SigninPojo();
		passText(l.get(1),s.getFirstNameTxtBox());
		
	}

	@When("To pass secondname in secondname text box")
	public void to_pass_secondname_in_secondname_text_box() {
		s=new SigninPojo();
		passText("tonny",s.getSecondNameTxtBox());
	}

	@When("To pass moblie or email in emailtext box")
	public void to_pass_moblie_or_email_in_emailtext_box(io.cucumber.datatable.DataTable d) {
		s=new SigninPojo();
		List<List<String>> l = d.asLists();
		passText(l.get(0).get(1), s.getMoblieorEmailTextBox());
		
	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
		s=new SigninPojo();
		passText("absdjdkk",s.getNewPassword());

	}
	@Then("close the browser")
		public void closethebrowser() {
		closeEntireBrowser();

	}

}
