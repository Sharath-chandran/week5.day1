package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public ChromeDriver driver;

	@BeforeMethod
	public void precondition() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Demosalesmanager");
		System.out.println(userName);
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@AfterMethod
	public void postcondition() {
		driver.close();
	}

}
