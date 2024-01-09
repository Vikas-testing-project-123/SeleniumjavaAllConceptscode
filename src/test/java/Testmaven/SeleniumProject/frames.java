package Testmaven.SeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		//driver.findElement(By.cssSelector("//a[contains(text(),'Frames')]")).click();
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
		driver.switchTo().defaultContent();
		driver.close();
		
	}

}
