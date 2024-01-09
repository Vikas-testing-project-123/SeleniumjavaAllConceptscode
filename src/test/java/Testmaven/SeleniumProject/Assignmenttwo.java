package Testmaven.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmenttwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("div[class=form-group] input[name*='name']")).sendKeys("testonly");
		driver.findElement(By.cssSelector("input[name*='email']")).sendKeys("test@test.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Test@123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement StaticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(StaticDropdown);
		dropdown.selectByIndex(0);
		
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.cssSelector("input[type=\"date\"]")).sendKeys("22-10-2023");
		driver.findElement(By.cssSelector(".btn-success")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".alert")).getText());

	}

}
