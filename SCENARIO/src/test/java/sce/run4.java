package sce;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class run4 {
WebDriver driver;
@Before
public void f() {
	String path = "src/test/resources/IEDriverServer.exe";
	System.setProperty("webdriver.ie.driver", path);
	driver = new InternetExplorerDriver();
	
}
@Given("URL is loaded {string}")
public void url_is_loaded(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.get(string);
}

@When("custm enters the username {string}")
public void custm_enters_the_username(String string) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	driver.findElement(By.id("userName")).sendKeys(string);
}

@When("custm enters the password {string}")
public void custm_enters_the_password(String string) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	driver.findElement(By.id("password")).sendKeys(string);
}

@When("custm clicks on login button")
public void custm_clicks_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By.name("Login")).click();
}

@When("custm searches  for {string}")
public void custm_searches_for(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By.id("myInput")).sendKeys(string);
}

@When("custm clicks on find button")
public void custm_clicks_on_find_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
}

@Then("custm checks for chart icon")
public void custm_checks_for_chart_icon() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	Assert.assertFalse(driver.findElement(By.xpath("//a[contains(@href,'displayCart.htm')]")).isDisplayed());
}



}
