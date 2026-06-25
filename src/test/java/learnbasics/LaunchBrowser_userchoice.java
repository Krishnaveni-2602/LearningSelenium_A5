package learnbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser_userchoice {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.close();
		System.out.println("excuted done by veni");
	}

}
