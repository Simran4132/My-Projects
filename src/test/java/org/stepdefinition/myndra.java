package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;

public class myndra extends BaseClass{

	@When("To launch url of myndra application")
	public void to_launch_url_of_myndra_application() {
		launchUrl("https://www.myntra.com/");
	}

	@When("To pass the text in searchbox")
	public void to_pass_the_text_in_searchbox() {
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input"));
		ele.sendKeys("nike shoes");
	}

}
