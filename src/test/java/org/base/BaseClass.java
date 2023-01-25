package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
	

}
	public static void closeEntireBrowser() {
		driver.quit();
	}
	
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	
}
	public static String pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public static String passText(String txt,WebElement ele) {
		ele.sendKeys(txt);
		return txt;
		
	}
	
	public static void clickBtn(WebElement ele) {
		ele.click();
	}
}

	

