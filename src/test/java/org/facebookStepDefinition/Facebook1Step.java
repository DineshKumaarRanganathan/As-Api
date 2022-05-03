package org.facebookStepDefinition;

import java.util.List;

import org.bass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook1Step extends BaseClass{
	//WebDriver driver;
	WebDriver driver = BaseClass.setDrive();
	@Given("User was in faceboook login page.")
	public void user_was_in_faceboook_login_page() {
		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("User enters username  and password.")
	public void user_enters_username_and_password(io.cucumber.datatable.DataTable data) {
		List<String> li = data.asList();
		driver.findElement(By.id("email")).sendKeys(li.get(0));
		driver.findElement(By.id("pass")).sendKeys(li.get(1));
	
	
	}

	


}
