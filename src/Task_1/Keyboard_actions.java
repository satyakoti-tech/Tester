package Task_1;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_actions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		//ac.keyDown(Keys.SHIFT);//to press shift key
		driver.findElement(By.xpath("//input[@id=\"userName\"]")).click();
		ac.sendKeys("satyakoti");//to Enter the Data
		//ac.keyUp(Keys.SHIFT);//TO RELEASE THE SHIFT KEY
		//select the data
		ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);	
		//to copy the data
		ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		//go to next field
		//ac.keyDown(Keys.TAB).keyUp(Keys.TAB);
		Action at = ac.sendKeys(Keys.TAB).build();
		at.perform();
		//to paste the data
		ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);

		ac.perform();
	}

}
