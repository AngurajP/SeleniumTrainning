package org.stepdefinition;

import org.Base.BaseClass;
import org.Pojo.BistoOnePojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class BistoOne extends BaseClass{
	
	BistoOnePojo a;
	
	@Given("To launch chrome browser and maximize the window")
	public void to_launch_chrome_browser_and_maximize_the_window() {
		
		launchBrowser();
		windowMaximize();
	    
	}

	@When("To launch url of application")
	public void to_launch_url_of_application() {
		launchUrl("https://bistrobitesdc.com/");
	    
	}

	@When("To click the menu button")
	public void to_click_the_menu_button() throws InterruptedException {
		
		Thread.sleep(3000);
		
		a = new BistoOnePojo();
		clickBtn(a.getMenu());
	   
	}

	@When("To click the dosa option")
	public void to_click_the_dosa_option() {
		a = new BistoOnePojo();
		clickBtn(a.getDosa());
	    
	}

	@When("To click the masala dosa")
	public void to_click_the_masala_dosa() {
	    a = new BistoOnePojo();
	    clickBtn(a.getMasaladosa());
		
	}

	@When("To click the add to cart application")
	public void to_click_the_add_to_cart_application() {
		
		String price = a.getCart().getText();
		System.out.println("Dosa price : "+price);
	    
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		//closeEntireBrowser();
	   
	}
	
	
}
