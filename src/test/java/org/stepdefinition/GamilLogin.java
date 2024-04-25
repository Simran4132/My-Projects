package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GamilLogin extends BaseClass {

	@When("User has launch the browser and maximize the window")
	public void user_has_launch_the_browser_and_maximize_the_window() {
		lanchBrowser();
		WindoMaximize();
	}

	@When("User has to hit the gamil url")
	public void user_has_to_hit_the_gamil_url() {
		launchUrl("https://www.gmail.com");

	}

	@When("User has to pass the data {string}in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		WebElement email = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		email.sendKeys(em);
	}

	@When("User has to click next button")
	public void user_has_to_click_next_button() {
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();

	}
	
	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	}

}
