package Week4.Day4Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("username")).sendKeys("DemosalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Malini");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	driver.findElement(By.linkText("Malini")).click();
	driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).click();
	String title2 = driver.getTitle();
	System.out.println(title2);
	driver.findElement(By.className("subMenuButton")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).clear();
	driver.findElement(By.xpath("//input[@value='Testleaf']")).sendKeys("Accenture");
    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.name("submitButton")).click();
    driver.close();
}
}
