package org.Waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllWaits {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Waits\\Driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         //Get the Url
         driver.get("https://www.instagram.com/");
         
         //Find The element for username
        // Thread.sleep(2000);
        // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // WebElement txtuser = driver.findElement(By.name("username"));
       //  txtuser.sendKeys("SasiKeshwaran");
         
       //Excliplit waits
        // WebDriverWait wait = new WebDriverWait(driver, 10);
      //   WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
       //  until.sendKeys("Sasikeshwaran");
         
         //FluentWaits
         Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
             WebElement until = wait.until(new Function<WebDriver, WebElement>() {

				public WebElement apply(WebDriver driver) {
					return driver.findElement(By.name("username"));
				}
			});
         until.sendKeys("Sasikeshwaran");;
	}

}
