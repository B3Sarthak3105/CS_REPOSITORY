package Stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test {
	public static WebDriver driver;
	
	@Given("^user open Testme App$")
	public void useropenTestmeApp()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\web Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();  
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
		
	}
	
	@When("^clicked on Signup$")
	public void clickedonSignup()
	{
	driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();	

	}
	
	@When("^enter User name as \"([^\"]*)\"$")
	public void enterUsernameas(String un)
	{
		driver.findElement(By.name("userName")).sendKeys(un);
		
	}
	
	@When("^enter First name as \"([^\"]*)\"$")
	public void enterFirstnameas(String fn)
	{
		driver.findElement(By.name("firstName")).sendKeys(fn);
		
	}
	
	@When("^enter Last name as \"([^\"]*)\"$")
	public void enterLastnameas(String ln)
	{
		driver.findElement(By.name("lastName")).sendKeys(ln);
		
	}
	
	@When("^enter Password as \"([^\"]*)\"$")
	public void enterPasswordas(String pwd)
	{
		driver.findElement(By.name("password")).sendKeys(pwd);
		
	}
	@When("^enter Confirm Password as \"([^\"]*)\"$")
	public void enterConfirmPasswordas(String cp)
	{
		driver.findElement(By.name("confirmPassword")).sendKeys(cp);
		
	}
	
	@When("^select Gender$")
	public void selectGenderas()
	{
		List<WebElement> allRadioButtons = driver.findElements(By.name("gender"));
		//System.out.println("Total Radio Buttons in grp gender->"+ allRadioButtons.size());
		allRadioButtons.get(0).click();
	}
	
	@When("^enter email as \"([^\"]*)\"$")
	public void enteremailas(String e)
	{
		driver.findElement(By.name("emailAddress")).sendKeys(e);
		
	}
	
	@When("^enter phone number as \"([^\"]*)\"$")
	public void enterphonenumberas(String pn)
	{
		driver.findElement(By.id("mobileNumber")).sendKeys(pn);
		
	}
	
	@When("^enter dob as \"([^\"]*)\"$")
	public void enterdobas(String d)
	{
		driver.findElement(By.name("dob")).sendKeys(d);
		
	}
	
	@When("^enter address as \"([^\"]*)\"$")
	public void enteraddressas(String a)
	{
		driver.findElement(By.name("address")).sendKeys(a);
		
	}
		
	
	@When("^select Security Question$")
	public void selectSecurityQuestion()
	{
		WebElement dropdown = driver.findElement(By.name("securityQuestion"));
		Select s = new Select(dropdown);
		s.selectByIndex(0);
		
	}
	
	@When("^enter answer as \"([^\"]*)\"$")
	public void enteranswer(String ans)
	{
		driver.findElement(By.name("answer")).sendKeys(ans);
		
	}
	
	@When("^click on Register$")
	public void clickonRegister()
	{
		driver.findElement(By.name("Submit")).click();
		 
		
	}
	
	@Then("^Registration should be succesfull$")
	public void Registrationshouldbesuccesfull()
	{
		System.out.println("REGISTRATION SUCCESFULL");
		 
	}
}