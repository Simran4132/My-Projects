package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flipkartlogin extends BaseClass {

	@Given("To launch the edge browser and maximize window")
	public void to_launch_the_edge_browser_and_maximize_window() {
		lanchBrowser();
		WindoMaximize();
	}

	@When("To launch the url in flipkart application")
	public void to_launch_the_url_in_flipkart_application() {
		launchUrl("https://www.flipkart.com/");
	}

	@When("To click login button")
	public void to_click_login_button() {
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[2]/div[2]/div/div/div/div/a")).click();
	}

	@When("To pass valid phone number in moblie number filed")
	public void to_pass_valid_phone_number_in_moblie_number_filed() {
		WebElement num = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input"));
		num.sendKeys("6548756321");
	}

	@When("To click requst button")
	public void to_click_requst_button() {
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button")).click();
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	}

}
