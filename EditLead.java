package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditLead extends Base_Class {

	@Test
	public void Edit_Lead() throws InterruptedException {

		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();

		WebElement findLeads = driver.findElement(By.linkText("Find Leads"));
		findLeads.click();

		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sharath");

		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);

		WebElement Firstname = driver
				.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]//a"));
		String Firstname1 = Firstname.getText();
		System.out.println("First Resulting name is: " + Firstname1);
		Firstname.click();
		WebElement title = driver.findElement(By.xpath("//div[text()='View Lead']"));
		String titleck = title.getText();
		System.out.println("The title is " + titleck);

		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Indium");

		WebElement updateck = driver.findElement(By.xpath("//input[@value='Update']"));
		updateck.click();

		WebElement textUpdateCheck = driver.findElement(By.id("viewLead_companyName_sp"));
		String textUpdateCk = textUpdateCheck.getText();
		System.out.println("The updated text was "+ textUpdateCk);

	}

}
