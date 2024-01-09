package Testmaven.SeleniumProject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mavenproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Chrome		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\17445\\eclipse-workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.udemy.com/");

//Firefox		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\17445\\eclipse-workspace\\drivers\\gecko.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.udemy.com/");

//Edge
		System.setProperty("webdriver.edge.driver", "C:\\Users\\17445\\eclipse-workspace\\drivers\\msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://www.udemy.com/");
		
		driver2.close();

	}

}
