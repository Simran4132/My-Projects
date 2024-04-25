package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPojo extends BaseClass {

	public SigninPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement CreateNewAcc;
	
	
	@FindBy(name="firstname")
	private WebElement firstNameTxtBox;
	
	@FindBy(name="lastname")
	private WebElement secondNameTxtBox;
	
	@FindBy(name="reg_email__")
	private WebElement moblieorEmailTextBox;
	
	@FindBy(name="reg_passwd__")
	private WebElement newPassword;

	public WebElement getCreateNewAcc() {
		return CreateNewAcc;
	}

	public WebElement getFirstNameTxtBox() {
		return firstNameTxtBox;
	}

	public WebElement getSecondNameTxtBox() {
		return secondNameTxtBox;
	}

	public WebElement getMoblieorEmailTextBox() {
		return moblieorEmailTextBox;
	}

	public WebElement getNewPassword() {
		return newPassword;
	}
	
	

	
	
}
