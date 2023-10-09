package Week4.Day4Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
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
    driver.findElement(By.linkText("Find Leads")).click();
    String title2 = driver.getTitle();
    System.out.println(title2);
    driver.findElement(By.xpath("//span[text()='Email']")).click();
    driver.findElement(By.name("emailAddress")).sendKeys("venkat@gmail.com");
    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
    driver.findElement(By.xpath("//a[text()='kavi']")).click();
    driver.findElement(By.linkText("Duplicate Lead")).click();
    String text = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
    System.out.println(text);
    driver.findElement(By.name("submitButton")).click();
    //driver.close();
}
}
