package org.stepdefinition;
import io.cucumber.datatable.*;

import java.util.List;

import org.Pojo.amazonPojo;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AmazonRegister extends BaseClass{
	
	amazonPojo a;
	
	@Given("To launch chrome browser and maxmise the window")
	public void to_launch_chrome_browser_and_maxmise_the_window() {
		launchBrowser();
		windowMaximize();
	    
	}

	@When("To launch the url of amazon application")
	public void to_launch_the_url_of_amazon_application() {
		launchUrl("https://www.amazon.in/");
	    
	}

	@When("To click Hello sign in option")
	public void to_click_Hello_sign_in_option() {
		a = new amazonPojo();
		clickBtn(a.getHello());
	    
	}

	@When("To pass the email or mobno in email field")
	public void to_pass_the_email_or_mobno_in_email_field(DataTable d) throws InterruptedException {
		
		Thread.sleep(3000);
		List<String> l = d.asList();
		
		a = new amazonPojo();
		passText(l.get(1), a.getEmailBox());
		
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
		
		a = new amazonPojo();
		clickBtn(a.getConBtn());
	    
	}

	@When("To pass the password in password field")
	public void to_pass_the_password_in_password_field(DataTable d) {
		
		List<List<String>> l = d.asLists();
		
		a = new amazonPojo();
		passText(l.get(1).get(2), a.getPasswrdBox());
		
		
	    
	}

	@When("To click the Sign in button")
	public void to_click_the_Sign_in_button() {
		
		a = new amazonPojo();
		clickBtn(a.getSignin());
	   
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		//closeEntireBrowser();
	   
	}

}
