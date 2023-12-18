package Practise_;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		//second method-List/ArayList
		Set<String>windows=driver.getWindowHandles();
		List<String> ids=new ArrayList<String>(windows);
		String parent=ids.get(0);
		String child=ids.get(1);
		
		System.out.println("parent window id:"+parent);
		System.out.println("child window id:"+child);
		
		//switch from parent to child
		for(String id:windows) {
			String childurl=driver.switchTo().window(id).getCurrentUrl();
			System.out.println("child window url:"+childurl);
			
			if(childurl.equals("https://demoqa.com/sample")) {
				
				System.out.println(driver.getTitle());
				driver.close();
			}
		}


	}

}
