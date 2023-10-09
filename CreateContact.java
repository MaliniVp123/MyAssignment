package Week4.Day4Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemosalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.linkText("Create Contact")).click();
	String title2 = driver.getTitle();
	System.out.println(title2);
	driver.findElement(By.id("firstNameField")).sendKeys("Malini");
	driver.findElement(By.id("lastNameField")).sendKeys("Venkatesan");
	driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Malini");
	driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Venkatesan");
	driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Automation");
	driver.findElement(By.id("createContactForm_description")).sendKeys("None");
	driver.findElement(By.id("createContactForm_description")).clear();
	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("malinivp12@gmail.com");
	WebElement dropDown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	Select dropDownBox=new Select(dropDown); 
	dropDownBox.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("None");
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	driver.findElement(By.xpath("//div[text()='View Contact']")).click();
	String title3 = driver.getTitle();
	System.out.println(title3);
}
}
