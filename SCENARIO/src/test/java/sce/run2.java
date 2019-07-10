package sce;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class run2 {
	WebDriver driver;
	@Before
	public void init() {
		String path = "src/test/resources/IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", path);
		driver = new InternetExplorerDriver();
		
	}
	@Given("url{int} for login page {string}")
	public void url_for_login_page(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.get(string);
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@When("customer{int} enters the username {string}")
	public void customer_enters_the_username(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("customer{int} enter the  password {string}")
	public void customer_enter_the_password(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@Then("customer{int} clicks on login button")
	public void customer_clicks_on_login_button(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.name("Login")).click();
	}


}
