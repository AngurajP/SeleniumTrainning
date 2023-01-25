package org.stepdefinition;

import org.Base.BaseClass;
import org.Pojo.BistoPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BistoLogin extends BaseClass{
	
	BistoPojo b;
	
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
	    
	}

	@When("To launch the url of bisto appliction")
	public void to_launch_the_url_of_bisto_appliction() {
		
		launchUrl("https://bistrobitesdc.com/");
	    
	}

	@When("To click the account button")
	public void to_click_the_account_button() {
		
		b = new BistoPojo();
		clickBtn(b.getAccount());
	    
	}

	@When("To click the phno text field")
	public void to_click_the_phno_text_field() throws InterruptedException {
		
		Thread.sleep(3000);
		
		b = new BistoPojo();
		clickBtn(b.getPhn());
	    
	}

	@When("The user has enter the value in phno text box")
	public void the_user_has_enter_the_value_in_phno_text_box() {
		
		b = new BistoPojo();
		passText("3463482764", b.getPhno());
	    
	}

	@When("To click the password text field")
	public void to_click_the_password_text_field() {
		
		b = new BistoPojo();
		clickBtn(b.getPass());
	    
	}

	@When("The user has enter the value in password text box")
	public void the_user_has_enter_the_value_in_password_text_box() {
		
		b = new BistoPojo();
		passText("fdgfdhfrr", b.getPaswrd());
	    
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		
		b = new BistoPojo();
		clickBtn(b.getLogin());
	    
	}

	@Then("To close the entire browser")
	public void to_close_the_entire_browser() {
		//closeEntireBrowser();
	    
	}

}
