package case2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cases2 {
	static{System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");}
	 WebDriver driver=new ChromeDriver();
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		//driver.findElement(By.id("details-button")).click();

		//driver.findElement(By.id("proceed-link")).click();

		//driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		//driver.findElement(By.linkText("SignIn")).click();

	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.findElement(By.id("details-button")).click();

		driver.findElement(By.id("proceed-link")).click();

		//driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		driver.findElement(By.linkText("SignIn")).click();
		WebElement username=driver.findElement(By.name("userName"));
		username.sendKeys(string);
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(string);
		WebElement button=driver.findElement(By.name("Login"));
		button.click();
		
	}

	@Then("user does succesful login")
	public void user_does_succesful_login() {
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
	}

}
