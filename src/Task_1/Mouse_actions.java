package Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_actions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		WebElement doubleclk = driver.findElement(By.id("doubleClickBtn"));
		Actions act = new Actions(driver);
		act.doubleClick(doubleclk).perform();
		Thread.sleep(1000);
		WebElement rclk = driver.findElement(By.id("rightClickBtn"));
		//act.contextClick(rclk).perform();
		//act.contextClick(rclk).build().perform();
		Action ac = act.contextClick(rclk).build();
		ac.perform();
		Thread.sleep(1000);
		//driver.quit();
	}

}
