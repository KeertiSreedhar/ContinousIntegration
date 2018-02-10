package newTest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNG {
	
  @Test
  public void Login() {
	  WebDriver driver;
		String URL= "http://www.facebook.com";

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\SeleniumEnvironment SetUP\\EXEs\\chromedriver.exe");

		driver = new ChromeDriver(); // instanciating the Chromedriver

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);

		driver.get(URL);
		String pageTitle= driver.getTitle();
		
		System.out.println("Page -" +pageTitle );
		
		

		driver.findElement(By.id("email")).sendKeys("Keerti");
		driver.findElement(By.id("pass")).sendKeys("xxxx");
		driver.findElement(By.id("u_0_2")).click();
		driver.close();
  }
}
