package Testmaven.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmentfour {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.xpath("//div[@id = 'checkbox-example']/fieldset/label[2]")).click();
		WebElement Option = driver.findElement(By.xpath("//div[@id = 'checkbox-example']/fieldset/label[2]"));
		//Option.click();
		String val = Option.getText();
		//System.out.println(Option.getText());
		WebElement Option1 = driver.findElement(By.cssSelector("#dropdown-class-example"));
		Select drop = new Select(Option1);
		drop.selectByVisibleText(val);
		
		driver.findElement(By.cssSelector("#name")).sendKeys(val);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		Thread.sleep(5000);
		
		String Alerttext = driver.switchTo().alert().getText();
		if(Alerttext.contains(val)) {
			System.out.println("pass");
		}
		else {
			System.out.println("Fail");
		}
		driver.switchTo().alert().accept();
		

	}

}
