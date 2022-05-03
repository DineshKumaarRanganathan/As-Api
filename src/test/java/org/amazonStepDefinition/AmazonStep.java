package org.amazonStepDefinition;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonStep {
		WebDriver driver;
	@Given("User was in amazon website")
	public void user_was_in_amazon_website() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}

	@When("User enters product name {string} in search box")
	public void user_enters_product_name_in_search_box(String product_name) {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product_name + Keys.ENTER);
	
	}

	@Then("Search results related to that product")
	public void search_results_related_to_that_product() {
		System.out.println("end");
	}

}
