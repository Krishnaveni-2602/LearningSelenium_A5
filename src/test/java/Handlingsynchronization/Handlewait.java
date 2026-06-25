package Handlingsynchronization;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewait {

	public static void main(String[] args) {
	 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/");
		WebElement title = driver.findElement(By.xpath("h3[contains(text(),\'Welcome to ShoppersStack. Enjoy shopping with us'.)]"));
	
		WebElement loginbutton=driver.findElement(By.cssSelector("#id=loginBtn"));
		loginbutton.click();
		System.out.println("Execution done by veni");
		
		
	

	}

}
