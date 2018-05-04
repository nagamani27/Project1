package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test1
{
	String txt;
WebDriver driver=null;
@Given("^The user is on Demoqa Website$")
public void the_user_is_on_Demoqa_Website() 
 {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RC\\eclipse-workspace\\cucumber\\lib\\chromedriver.exe"); 
	driver = new ChromeDriver();
	driver.get("http://demoqa.com/registration/");
	
	
 }

@When("^The user Check the status$")
public void the_user_Check_the_status() 
 {
	
	driver.findElement(By.xpath("//input[@value='married']")).click();
	
 }

@Then("^The user click the button$")
public void the_user_click_the_button() 
 {
	boolean Chk=driver.findElement(By.xpath("//input[@value='married']")).isSelected();
	Assert.assertTrue(Chk);
	
	driver.close();
	
 }

@When("^The user check hobby$")
public void the_user_check_hobby() 
 {
	driver.findElement(By.xpath("(//input[@value='dance'])")).click();
	driver.findElement(By.xpath("//input[@value='reading']")).click();
	driver.findElement(By.xpath("//input[@value='cricket ']")).click();

 }


@Then("^The user click check$")
public void the_user_click_check() 
 {
	boolean dance=driver.findElement(By.xpath("(//input[@value='dance'])")).isSelected();
	boolean reading=driver.findElement(By.xpath("//input[@value='reading']")).isSelected();
	boolean cricket=driver.findElement(By.xpath("//input[@value='cricket ']")).isSelected();
	Assert.assertTrue(cricket && dance && reading);
	
	driver.close();

 }


@When("^user clicks the dropdown menu$")
public void user_clicks_the_dropdown_menu() 
{   
	WebElement sel=driver.findElement(By.id("dropdown_7"));
	Select s=new Select(sel);
	 txt=s.getFirstSelectedOption().getText();
	
}

@Then("^user verifies whether the dropdown default value is same or not$")
public void user_verifies_whether_the_dropdown_default_value_is_same_or_not() 
{
	Assert.assertEquals("Afghanistan", txt);
	driver.close();
	
   
}

}
