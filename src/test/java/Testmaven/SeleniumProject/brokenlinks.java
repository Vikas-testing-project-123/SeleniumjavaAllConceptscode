package Testmaven.SeleniumProject;


import static org.junit.Assert.assertArrayEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

//In this program we use selenium to get the url and get the links then we use url connection class of java method to
//get the url responses and check if the status code is coming 400
public class brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stubge
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List <WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		
		for(WebElement link : links) {
			String url = link.getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode = conn.getResponseCode();
			System.out.println(respcode);
//			if(respcode>400) {
//				System.out.println("The link with Text"+link.getText()+"is broken with cod"+respcode);
//				Assert.assertTrue(false);			}
			
			//Now as we use assert.assertArrayEquals(it is a hard assertion 
			//Assert.assertTrue(respcode<400,"The link with Text"+link.getText()+"is broken with cod\"+respcode");
			
			//for soft assertion
			a.assertTrue(respcode<400,"The link with Text"+link.getText()+"is broken with cod\"+respcode");
		}
		
		a.assertAll();
	}

}
