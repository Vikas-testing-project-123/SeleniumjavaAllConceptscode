package Testmaven.SeleniumProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Count of the Link in the Entire Page
		System.out.println("Links in the Page");
		System.out.println(driver.findElements(By.tagName("a")).size());

		// Count of links in the footer section of the page
		WebElement footer = driver.findElement(By.xpath(".//*[@id='gf-BIG']"));
		System.out.println("Links in the footer section");
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement col = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		System.out.println("Links in the 1st coloumn of the section");
		System.out.println(col.findElements(By.tagName("a")).size());
		// Click the links of footer
		// Click all the link of teh footer and get the title, There are two ways to get
		// the title first click on
		// 1st click on link it will redirect to the new page get the titile and click
		// back button on thre browser
		// 2nd click on ctrl+enter it will open the page in new tab then go in each page
		// and get the title
		for (int i = 1; i < col.findElements(By.tagName("a")).size(); i++) {

			String clickonlinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			col.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(5000);

		}
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
