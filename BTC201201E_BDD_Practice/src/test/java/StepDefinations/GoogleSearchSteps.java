package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {


	WebDriver driver=null;
	@Given("^browser is open$")
	public void browser_is_open() throws Throwable {
		System.out.println("Inside Step-browser is open");
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/shafi/eclipse-workspace/MyFirstJavaProject/BTC201201E_BDD_Practice/src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	}

	@And("^user is on google search page$")
	public void user_is_on_google_search_page() throws Throwable {
		System.out.println("Inside Step-user is on google search page");
		driver.navigate().to("https://www.google.com/");
    }

	@When("^user enters a text in search box$")
	public void user_enters_a_text_in_search_box() throws Throwable {
		System.out.println("Inside Step-user enter a text in search box");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		Thread.sleep(2000);
	}

	@And("^hits enter$")
	public void hits_enter() throws Throwable {
		System.out.println("Inside Step-hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("^user is navigated to search results$")
	public void user_is_navigated_to_search_results() throws Throwable {
		System.out.println("Inside Step-user is navigated to search results");
		driver.getPageSource().contains("Online Courses");
		
		driver.close();
		driver.quit();
	}

}
