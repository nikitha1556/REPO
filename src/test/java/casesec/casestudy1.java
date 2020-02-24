package casesec;




import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class casestudy1 {

WebDriver driver;

@Given("user enters into registration page")

public void access_the_URL() {

System.setProperty("webdriver.chrome.driver","src\\test\\resources\\chromedriver.exe");

driver=new ChromeDriver();

driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");

driver.findElement(By.id("details-button")).click();

driver.findElement(By.id("proceed-link")).click();

driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();


}


@When("user enters {string} , {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
public void enter(String un, String fn, String ln, String pwd, String cnfpwd, String gen, String email, String pn, String dob, String add, String ans) {

driver.findElement(By.name("userName")).sendKeys(un);

driver.findElement(By.name("firstName")).sendKeys(fn);

driver.findElement(By.name("lastName")).sendKeys(ln);

driver.findElement(By.name("password")).sendKeys(pwd);

driver.findElement(By.name("confirmPassword")).sendKeys(cnfpwd);

driver.findElement(By.xpath("//input[@value='Female']")).click();

driver.findElement(By.name("emailAddress")).sendKeys(email);

driver.findElement(By.name("mobileNumber")).sendKeys(pn);

driver.findElement(By.name("dob")).sendKeys(dob);

driver.findElement(By.name("address")).sendKeys(add);

driver.findElement(By.name("securityQuestion")).click();

driver.findElement(By.name("answer")).sendKeys(ans);

driver.findElement(By.name("Submit")).click();

}


@Then("user navigates to login page")

public void click_on_submit_button() {


}


}
