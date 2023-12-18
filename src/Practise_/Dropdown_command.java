package Practise_;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_command {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("satyakoti");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Satyakoti@416");
		driver.findElement(By.xpath("//*[@id='login']")).click();
		Select drpdwn = new Select(driver.findElement(By.xpath("//*[@id='location']")));
		drpdwn.selectByIndex(4);
		/*List<WebElement> alloption=drpdwn.getOptions();
		for(int i=0;i<alloption.size();i++) {
			String option=alloption.get(i).getText(); 
				System.out.println(option);
				}
				*/	
		Select htlname = new Select(driver.findElement(By.xpath("//*[@id=\'hotels\']")));
		htlname.selectByIndex(2);
		Select bombay = new Select(driver.findElement(By.xpath("//*[@id=\"room_type\"]")));
		bombay.selectByIndex(3);
		Select rmtype = new Select(driver.findElement(By.xpath("//*[@id=\'room_nos\']")));
		rmtype.selectByIndex(3);

		driver.quit();

	}

}
