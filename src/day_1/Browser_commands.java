package day_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_commands {

	public static void main(String[] args) {
		System.setProperty("Webdriver.driver.Chrome","D:\\eclipse-workspace\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("my page title is "+title);
		String url = driver.getCurrentUrl();
		System.out.println("the url is "+url);
		driver.close();
	}

}
