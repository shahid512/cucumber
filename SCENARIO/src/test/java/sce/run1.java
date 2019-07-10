package sce;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class run1 {
		@FindBy(how=How.ID,using="userName")
		static public WebElement username;
		
		@FindBy(how=How.ID,using="firstName")
		static public WebElement firstname;
		
		@FindBy(how=How.ID,using="lastName")
		static public WebElement lastname;
		
		@FindBy(how=How.ID,using="password")
		static public WebElement password;
		
		@FindBy(how=How.ID,using="pass_confirmation")
		static public WebElement confirmpassword;
		
		@FindBy(how=How.XPATH,using="/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[1]")
		static public WebElement male;
		
		@FindBy(how=How.ID,using="emailAddress")
		static public WebElement email;
		
		@FindBy(how=How.ID,using="mobileNumber")
		static public WebElement number;
		
		@FindBy(how=How.ID,using="dob")
		static public WebElement date;
		
		@FindBy(how=How.ID,using="address")
		static public WebElement Address;
		
		@FindBy(how=How.ID,using="securityQuestion")
		static public WebElement question;
		
		@FindBy(how=How.ID,using="answer")
		static public WebElement ans;
		
		@FindBy(how=How.NAME,using="Submit")
		static public WebElement register;
	}

