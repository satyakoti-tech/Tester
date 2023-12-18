package Day_3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingxpath {


		public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
			driver.manage().window().maximize();
			List<WebElement> max = 	driver.findElements(By.xpath("//input[@maxlength=10]"));
			System.out.println("10		:	"+max.size());
			
			//using conditions and or not
			driver.findElement(By.xpath("//input[@maxlength=10 and @name='name']")).sendKeys("satya");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@maxlength=15 or @name='name']")).sendKeys("koti");
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//input[not(@maxlength=10)]")).sendKeys("narayana");
			Thread.sleep(3000);
			
			//xpath using text
			driver.findElement(By.xpath("//label[text()='email']/following-sibling::input")).sendKeys("satyakoti@gmail.com");
			Thread.sleep(3000);
			//driver.findelement(by.xpath("//label[text()='password']/preceding-sibling::input")).sendkeys("satyakoti@gmail.com");
			//Thread.sleep(3000);
			
	        // xpath using axes
			////Tagname[@attribute=’value’]/axes::tagname of current element
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("satyakoti@123");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//label[@for='psw-repeat']/following-sibling::input")).sendKeys("satyakoti@123");
		   Thread.sleep(3000);
		 //button[@type='submit']
		   driver.findElement(By.xpath("//button[@type='submit']")).sendKeys("satya@123");
		   Thread.sleep(3000);	

	}

}