package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateContact extends Base_Class {

	@Test
	public void createContact() throws InterruptedException {

		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Sharath");
		driver.findElement(By.id("lastNameField")).sendKeys("Chandran");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Mech");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Automation Testing in Test Leaf");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sharath@gmail.com");

		Thread.sleep(1500);
		WebElement State = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		Select Dropdown = new Select(State);
		Dropdown.selectByVisibleText("India");

		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Hi, I am from Testleaf.");
		driver.findElement(By.xpath("//input[contains(@name,'submit')]")).click();
		System.out.println(driver.getTitle());

	}

}
