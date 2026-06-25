package learnlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearncssSelector {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
//identify webelement using cssSelector
	WebElement untxtfd = driver.findElement(By.cssSelector("input[id='user_name]"));
	WebElement pswdfld= driver.findElement(By.cssSelector("input[placeholder='password']"));
	WebElement loginbtn= driver.findElement(By.cssSelector("input[value='login']"));
	
	untxtfd.sendKeys("Standarad_user");
	pswdfld.sendKeys("secret_sauce");
	loginbtn.click();
	driver.close();
		System.out.println("execution done by veni");
		

	}

}
