package learnlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
	
WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demowebshop.tricentis.com/");
   
   WebElement register= driver.findElement(By.className("ico-register"));
   register.click();
   
   WebElement Gender = driver.findElement(By.className("gender"));
   Gender.click();
   
   WebElement Female=driver.findElement(By.id("gender-female"));
   Female.click();
   
   WebElement Firstname=driver.findElement(By.name("FirstName"));
   Firstname.sendKeys("krishna");
   
   WebElement LastName=driver.findElement(By.id("LastName"));
   LastName.sendKeys("veni");
   
   WebElement Email=driver.findElement(By.name("Email"));
   Email.sendKeys("krishnavenimurugan2602@gmail.com");
   
   WebElement Password=driver.findElement(By.xpath(("(//input[@type='password'])[1]")));
   Password.sendKeys("mkveni@123");
   
   WebElement ConfirmPassword=driver.findElement(By.id("ConfirmPassword"));
   ConfirmPassword.sendKeys("mkveni@123");
   
   WebElement Register=driver.findElement(By.xpath("//input[@value='Register']"));
   Register.click();
   driver.close();
	}

	
}


