package myPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SmokeTest {

	@Test
	public void loginTest(){
		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Cool_before\\workspace\\Ant_JenkinsProject\\lib\\chromedriver.exe");
	
		
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,  TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Sign in']"))).click();
		Assert.assertEquals(driver.getTitle(), "Rediffmail");
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
		
		
		
		
	}
	
}
