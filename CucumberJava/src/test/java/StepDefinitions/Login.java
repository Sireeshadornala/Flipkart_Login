package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver driver = null;
	
	@Given("Browser is open")
	public void user_is_on_login_page() {
	  
		System.out.println("Browser is open");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}
	
	@And("User is on login page")
	public void User_is_on_login_page() {
		
		driver.navigate().to("https://www.flipkart.com/");
	    
	}

	@When("User enters Username and Password")
	public void user_enters_username_and_password() {
	   
		driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("7095962320");
		driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Siri@1234");
		
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	    
	}

	@Then("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		
		driver.findElement(By.name("q")).sendKeys("Women Sarees");
		driver.findElement(By.xpath("//*[@class='_34RNph']")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Solid Fashion")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2U9uOA _3v1-ww _2Fj61M']")).click();
		
		
		driver.close();
	    
	}


}
