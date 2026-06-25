package learnlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnxpath {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
//identify webelement using cssSelector
	WebElement logo = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
	String text= logo.getText();
	System.out.println("text");
	WebElement untxtfd = driver.findElement(By.xpath("//input[@name='user_name]"));
	WebElement pswdfld= driver.findElement(By.xpath("//input[contains(@id,='word']"));
	WebElement loginbtn= driver.findElement(By.xpath("//input[@value='login']"));
	
	untxtfd.sendKeys("Standarad_user");
	pswdfld.sendKeys("secret_sauce");
	loginbtn.click();
	driver.close();
		System.out.println("execution done by veni");
		
	}

}
