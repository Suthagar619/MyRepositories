package uio;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
public class WebDrivercommands 
{       @Test
		public  void main() {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Surya\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.wikipedia.org/");
			
			WebElement element =driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
			element.sendKeys("java");
			element.sendKeys(Keys.ENTER);	
						
		}

	}
	