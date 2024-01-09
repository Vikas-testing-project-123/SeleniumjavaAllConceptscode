//Here we have the new funtionalities introduces in the selenium 4 version

//1. Switch window
//2. Screenshot
//3. get height and weidth

package Testmaven.SeleniumProject;

import java.io.File;

import java.io.IOException;

import java.util.Iterator;

import java.util.Set;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.WindowType;

import org.openqa.selenium.chrome.ChromeDriver;



public class selenium4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

//Switching Window

		driver.switchTo().newWindow(WindowType.WINDOW);

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String parentWindowId = it.next();

		String childWindow = it.next();

		driver.switchTo().window(childWindow);

		driver.get("https://rahulshettyacademy.com/");

		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))

				.get(1).getText();

		driver.switchTo().window(parentWindowId);

		WebElement name = driver.findElement(By.cssSelector("[name='name']"));

		name.sendKeys(courseName);

//Screenshot

		File file = name.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("logo.png"));

//driver.quit();

//GEt Height & Width

		System.out.println("Hegiht"+name.getRect().getDimension().getHeight());

		System.out.println("weidth"+name.getRect().getDimension().getWidth());

	}

}
