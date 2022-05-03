package org.facebookStepDefinition;

import java.util.concurrent.TimeUnit;

import org.bass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook2Step extends BaseClass{
	WebDriver driver = BaseClass.setDrive();
	
	@When("User clicks login button")
	public void user_clicks_login_button() {
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	    driver.findElement(By.name("login")).click();
	}

	@Then("Facebook page opens")
	public void facebook_page_opens() {
	    System.out.println("completed");
	}
}
