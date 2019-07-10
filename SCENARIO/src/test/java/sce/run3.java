package sce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class run3 {
	WebDriver driver;
	@Before
	public void f() {
		String path = "src/test/resources/IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", path);
		driver = new InternetExplorerDriver();
	}
	@Given("url to login {string}")
	public void url_to_login(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.get(string);
	}

	@When("cust enters the username {string}")
	public void cust_enters_the_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("cust enters the password {string}")
	public void cust_enters_the_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("cust clicks on the login button")
	public void cust_clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
     driver.findElement(By.name("Login")).click();	
	}

	@When("cust searches for {string}")
	public void cust_searches_for(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	driver.findElement(By.id("myInput")).sendKeys(string);
	}

	@When("cust clicks on search button")
	public void cust_clicks_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("cust adds the item to chart")
	public void cust_adds_the_item_to_chart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@When("cust clicks on chart symbol")
	public void cust_clicks_on_chart_symbol() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//a[contains(@href,'displayCart.htm')]")).click();
	}

	@When("cust clicks on checkout button")
	public void cust_clicks_on_checkout_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	}

	@When("cust clicks on procced to pay")
	public void cust_clicks_on_procced_to_pay() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("cust clicks on the bank to pay with")
	public void cust_clicks_on_the_bank_to_pay_with() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//label[contains(text(),'HDFC Bank')]")).click();
	}

	@When("cust clicks on the continue button")
	public void cust_clicks_on_the_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
	}
	
	@When("Acust enters the username {string}")
	public void Acust_enters_the_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	driver.findElement(By.name("username")).sendKeys(string);
	}

	@When("Acust enters the password {string}")
	public void Acust_enters_the_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@When("cust clicks on login button")
	public void cust_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	}

	@When("cust enters the transaction password {string}")
	public void cust_enters_the_transaction_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("transpwd")).sendKeys(string);
	}

	@When("cust clicks on enter button")
	public void cust_clicks_on_enter_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	}


}
