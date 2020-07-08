package com.telecom.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddCustomerSteps {
	
	static WebDriver driver;
	
	@Given("User launches demo telecom application")
	public void user_launches_demo_telecom_application() {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\workspace\\May\\CucumberJuly\\driver\\Chrome83\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/telecom/");
		
		
	}

	@Given("User click on add customer button")
	public void user_click_on_add_customer_button() {
	  
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		
	}

	@When("User enters all the fields")
	public void user_enters_all_the_fields() {
	    
		driver.findElement(By.xpath("(//label[@for='done'])[1]")).click();
		
		driver.findElement(By.id("fname")).sendKeys("Karthi");
		driver.findElement(By.id("lname")).sendKeys("rajan");
		driver.findElement(By.id("email")).sendKeys("Karthi@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("Thanjavur");
		driver.findElement(By.id("telephoneno")).sendKeys("56778786443");
		
		
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
	    
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
	}

	@Then("User should be displayed id is generated")
	public void user_should_be_displayed_id_is_generated() {
	   
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		
	}

}
