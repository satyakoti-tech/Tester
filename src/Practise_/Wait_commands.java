package Practise_;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_commands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("populate-text"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("enable-button"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox"))).click();
		driver.quit();
	}

}
