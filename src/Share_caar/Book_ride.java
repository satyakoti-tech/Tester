package Share_caar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book_ride {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://products.ncryptedprojects.com/sharecaar/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("email")).sendKeys("seller.ncrypted@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.className("custom-control-label")).click();
		
		/*driver.switchTo().alert();
		driver.switchTo().alert().dismiss();*/
		driver.findElement(By.id("sbtLogin")).click();
		/*driver.switchTo().alert();
		driver.switchTo().alert().dismiss();*/
		driver.findElement(By.id("booking-section")).click();
		

	}

}
