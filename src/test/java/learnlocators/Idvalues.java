package learnlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idvalues {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
//Identify Webelement based on Id Attributes and its value
		WebElement unxfid=driver.findElement(By.id("user-name"));
		unxfid.sendKeys("Standrad-user");
		driver.close();
		
		

	}

}
