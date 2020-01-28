package stepDefinition;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class loginTest {
	public static WebDriver driver;
	PageObject po;
	@Given("Navigate to Home page")
	public void NavigatetoHomePage()throws Throwable
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\web Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		po = new PageObject(driver);
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();  
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	@When ("user enters username and password")
	public void UserEnterUsernamePAssword()throws Throwable
	{
		po.signin.click();
		po.username.sendKeys("lalitha");
		po.password.sendKeys("password123");
		po.login.click();
	}
	@Then("user logged in successfully")
	public void Userlogin()throws Throwable
	{
		System.out.println("User login succesfully");
	}
	
	@When ("Larry searches below products in the search box$")
	public void Larrysearchesbelowproductsinthesearchbox(DataTable dt)
	{
	List<String> products = dt.asList(String.class);
	for (String s:products)
	{
		driver.findElement(By.name("products")).sendKeys(s);
		driver.findElement(By.xpath("//*[@value='FIND DETAILS']")).click();
		driver.findElement(By.xpath("//*[@href='#']")).click();
		driver.findElement(By.xpath("//*[@href='fetchcat.htm']")).click();
	
		
	}
	}
	
	
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void entersunamepwd(String username, String password) 
	{

	po.signin.click();

	po.username.sendKeys(username);

	po.password.sendKeys(password);

	po.login.click();

	}

	
	
	
	@Then("Then product should be added in the cart if available$")
	public void Then_product_should_be_added_in_the_cart_if_available()
	{
		System.out.println("Succesfully added");
		
	}
}

