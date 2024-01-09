package Testmaven.SeleniumProject;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thirdassignmentwiindow {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		Set<String> windows = driver.getWindowHandles(); // [parentid,childid,subchildId]

		Iterator<String> it = windows.iterator();

		String parentId = it.next();

		String childId = it.next();
		
		driver.switchTo().window(childId);
		
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		driver.switchTo().window(parentId);
		
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		driver.quit();
	}

}
