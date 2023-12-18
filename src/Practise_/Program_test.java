package Practise_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_test {

	public static void main(String[] args) throws Exception  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://adactinhotelapp.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("satyakoti");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Satyakoti@416");
		Thread.sleep(2000);
		driver.findElement(By.className("login")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
