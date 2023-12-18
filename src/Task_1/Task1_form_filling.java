package Task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_form_filling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		//driver.manage().window().maximize();
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("satya");
		//Thread.sleep(1000);
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("narayana koti");
		//Thread.sleep(1000);
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("9032143953");
		//Thread.sleep(1000);
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("INDIA");
		//Thread.sleep(1000);
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Hyderabad");
		//Thread.sleep(1000);
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("satyakoti697@gmail.com");
		driver.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
