package Day_2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_elements {

	public static void main(String[] args) throws Exception {
		
		/*
		1) Launch browser
		2) open url
			https://adactinhotelapp.com/
		3) Provide username  - satyakoti
		4) Provide password  - Satyakoti@416
		5) Click on Login button*/
//1) Launch browser		
		WebDriver driver=new ChromeDriver();
		
//2) open url
		//https://adactinhotelapp.com/
		
		driver.get("https://adactinhotelapp.com/");
		Thread.sleep(5000);
		
//maximize screen
		driver.manage().window().maximize();
		
//3) Provide username  - satyakoti
		
		driver.findElement(By.id("username")).sendKeys("satyakoti");
		Thread.sleep(2000);
		
//4) Provide password  - Satyakoti@416
		
		driver.findElement(By.name("password")).sendKeys("Satyakoti@416");
		Thread.sleep(2000);
		driver.findElement(By.className("login_button")).click();
		Thread.sleep(3000);
		driver.close();
	}
}