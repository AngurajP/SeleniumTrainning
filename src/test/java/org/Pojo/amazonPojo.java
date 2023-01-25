package org.Pojo;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonPojo extends BaseClass{
	
	public amazonPojo() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "nav-link-accountList")
	private WebElement Hello;
	
	@FindBy(name = "email")
	private WebElement EmailBox;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement conBtn;
	
	@FindBy(name = "password")
	private WebElement PasswrdBox;
	
	@FindBy(id = "signInSubmit")
	private WebElement signin;

	public WebElement getHello() {
		return Hello;
	}

	public WebElement getEmailBox() {
		return EmailBox;
	}

	public WebElement getConBtn() {
		return conBtn;
	}

	public WebElement getPasswrdBox() {
		return PasswrdBox;
	}

	public WebElement getSignin() {
		return signin;
	}
	
	

}
