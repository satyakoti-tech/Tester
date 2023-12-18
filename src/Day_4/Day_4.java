package Day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_4 {
	static WebDriver driver;
	public static void main(String[] args) {
		 driver =new ChromeDriver();
		launch();
		textbox();
		checkbox();
		radiobutton();
	}
	public static void launch() {
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
	}
	
	public static void textbox() {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Manual");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("user@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Gachibowli");
		
		String Exp_title="DEMOQA";
		String act_title=driver.getTitle();
		if(act_title.equals(Exp_title)) {
			System.out.println("Test is passed");
		}else {
			System.out.println("Test is failed");
		}
	}
	
	public static void checkbox() {
		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
		driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-uncheck']")).click();
		
		String Exp_title="You have selected :";
		String act_title=driver.findElement(By.xpath("//span[text()='You have selected :']")).getText();
		if(act_title.equals(Exp_title)) {
			System.out.println("Test is passed");
		}else {
			System.out.println("Test is failed");
		}
	}
	public static void radiobutton() {
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
		
		boolean button=driver.findElement(By.xpath("//label[@for='yesRadio']")).isEnabled();
		System.out.println(button);
	}
}
