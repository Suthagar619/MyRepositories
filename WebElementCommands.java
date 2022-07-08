package uio;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class WebElementCommands 
{
	

        @Test
		public void drt() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surya\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.w3schools.com");
			
			WebElement element =driver.findElement(By.xpath("//*[@id=\"search2\"]"));
			element.sendKeys("python");
			element.sendKeys(Keys.ENTER);
		}

	}


