package LOGIN;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class create_user2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("JAI SHREE RAM");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sheeta");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("RAM");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Shree RAM");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9049314343");
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("sheet@123");
		
		

	}

}
