package myTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver; 
  @Test
  public void f() {
	  driver.get("http://localhost:8090/addressbook");

	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  driver.findElement(By.className("v-button")).click();
	  driver.findElement(By.id("gwt-uid-5")).sendKeys("Edureka");
	  driver.findElement(By.id("gwt-uid-7")).sendKeys("DevOps");
	  driver.findElement(By.id("gwt-uid-9")).sendKeys("9834562709");
	  driver.findElement(By.id("gwt-uid-11")).sendKeys("Devops@edureka.co");
	  driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/2015");
	  driver.findElement(By.className("v-button-primary")).click();
	  //Thread.sleep(5000);
	  //driver.quit();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chrome_driver\\chromedriver.exe");
	  ChromeOptions chromeOptions = new ChromeOptions();
	  // chromeOptions.addArguments("--headless");
	  driver = new ChromeDriver(chromeOptions);

  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }
  
}
