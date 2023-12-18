package Task_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		List <WebElement> list = driver.findElements(By.tagName("a"));
		Thread.sleep(1000);
		int num = list.size();
		System.out.println("Number of links are "+num);
		driver.quit();
	}

}
