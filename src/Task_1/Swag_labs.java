package Task_1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag_labs {
			static WebDriver driver;
			
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		launch();
		login();
		logout();
	}
	public static void launch() throws InterruptedException
	{
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
	}
	public static void login() throws InterruptedException
	{
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
	}
	public static void logout() throws InterruptedException {
		
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);
		
		driver.quit();
		//("//*[@id='contentGrid_980225']");   relative xpath
		//html/body/div[1]/div[1]/div[7]/div/div/div/div/div/div/div/img  absolute xpat
	}
}