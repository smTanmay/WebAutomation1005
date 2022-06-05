package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleFooterLinks {



	private By driver;

	@Given("I go to Google Home page")
	public void i_go_to_google_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe"); 
		
		
		 
		  WebDriver driver = new ChromeDriver(); 
		 // For ChromeBrowser 
		  driver.get("https://www.google.com");
		  
		  Thread.sleep(5000);
		  
	}

	@When("I click on the privacy link")
	public void i_click_on_the_privacy_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // For Chrome Browser
		driver.get("https://www.google.com");
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Privacy")).click();
		System.out.println("I clicked on the Privacy link ...");
		
		Thread.sleep(5000);
		
		
		
	}

	@Then("I see the privacy page")
	public void i_see_the_privacy_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // For Chrome Browser
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Privacy")).click();
		System.out.println("I clicked on the Privacy link ...");
		
		Thread.sleep(2000);
		
		
		
	
	    
	}	
	
	
	
	
	
	
	
	
	
	
}
