package org.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class amazonLogin extends BaseClass {

	@When("To launch url of amazon application")
	public void to_launch_url_of_amazon_application() {
		launchUrl("https://www.amazon.in/");
	}

	@When("To click the signin button")
	public void to_click_the_signin_button() {
		driver.findElement(By.id("nav-link-accountList")).click();
	}

	@When("To pass the valid phone number")
	public void to_pass_the_valid_phone_number(DataTable d) {
		List<String> l = d.asList();
		WebElement element = driver.findElement(By.id("ap_email"));
		passText(l.get(2), element);
	}
	@When("To click the contiue button")
	public void to_click_the_contiue_button() {
	   driver.findElement(By.xpath("//*[@id=\"continue\"]//*[@id=\"continue\"]")).click();
	}


	@Then("To close the all browser")
	public void to_close_the_all_browser() {
		closeEntireBrowser();
	}

}
