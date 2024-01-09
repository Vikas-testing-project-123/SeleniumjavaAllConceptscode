// In this program we add all the dropdown methods used normaly

package Testmaven.SeleniumProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.testng.Assert;

public class E2Edropdowntest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub



		//System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("http://spicejet.com"); //URL in the browser
		
		driver.manage().window().maximize();

		//Select from and to location from dropdown
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='DEL']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

		
		//Select active date from the calender and check if the return date is disabled or not
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{

		System.out.println("its disabled");

		Assert.assertTrue(true);

		}

		else

		{

		Assert.assertTrue(false);

		}
		
		//Check box checked 

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		//Select 5 adults in passangers 
		driver.findElement(By.id("divpaxinfo")).click();

		   Thread.sleep(2000L);

		for(int i=1;i<5;i++)

		{

		driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//check if the 5 passangers are selected or not 
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//Static delect drop down to select currency
		
		WebElement StaticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(StaticDropdown);
		dropdown.selectByIndex(0);

		// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

		driver.findElement(By.cssSelector("input[value='Search']")).click();

		// driver.findElement(By.xpath("//input[@value='Search']")).click();

		// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();

	}

}
