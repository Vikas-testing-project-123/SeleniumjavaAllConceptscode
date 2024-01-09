package Testmaven.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmenttable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(
				driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table[@id='product']/tbody/tr")).size());
		
		System.out.println(driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table[@id='product']/tbody/tr[1]/th")).size());

		System.out.println(
				driver.findElement(By.xpath("//div[@class='left-align']/fieldset/table[@id='product']/tbody/tr[3]"))
						.getText());
	}

}
