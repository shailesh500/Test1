package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import src.Constant;

public class Home{
	static WebDriver driver;

	@Given("User should be login sucessfully")
	public void logged_in() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

	@Then("Home page is displayed")
	public void enter_userName_and_Password() {
		System.out.println(driver.getTitle());
	}

	@When("User search any products {string}")
	public void search_for_Products(String products) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(products);
		Thread.sleep(3000);
	}

	@And("user is click on search icon")
	public void click_on_search_icon() {
		driver.findElement(By.xpath("//span[@id=\"nav-search-submit-text\"]")).click();

	}

	@Then("user should get the result")
	public void result() {
		System.out.println(driver.getTitle());
	}

}
