package Testmaven.SeleniumProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(2000);
		Assert.assertTrue(true);
		
		System.out.println(driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).size());
		

	}

}
