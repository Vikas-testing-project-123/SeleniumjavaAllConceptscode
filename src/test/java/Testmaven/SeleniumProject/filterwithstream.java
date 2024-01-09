package Testmaven.SeleniumProject;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filterwithstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> vegiges = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement>filteredList = vegiges.stream().filter(veggie -> veggie.getText().
				contains("Rice")).collect(Collectors.toList());
		Assert.assertEquals(vegiges.size(), filteredList.size());
	}

}
