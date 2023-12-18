package Practise_;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handle_iterator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String>window = driver.getWindowHandles();
		List<String>ids = new ArrayList<String>(window);
		String parent = ids.get(0);
		String child = ids.get(1);
		System.out.println(parent);
		System.out.println(child);
		for(String id:ids)
		{
			String childurl = driver.switchTo().window(id).getCurrentUrl();
			System.out.println(childurl);
			driver.close();
		}
	}

}
