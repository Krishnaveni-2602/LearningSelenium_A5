package LearningWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateWebelement {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://automationexercise.com/");
    WebElement  button= driver.findElement(By.xpath("//a[@href='/login']"));
    button.click();
    WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
    name.sendKeys("Krishnaveni");
    WebElement Email = driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]"));
    Email.sendKeys("krishnaveni@gmail.com");
    WebElement Button = driver.findElement(By.xpath(("(//button[@class='btn btn-default'])[2]")));
    Button.click();
    WebElement Title = driver.findElement(By.xpath("//input[@value='Mrs']"));
    Title.click();
    //Selected Validation
    boolean TitleSelected = Title.isSelected();  
    
    
    
    
    
    
   
    
    
    
    		}
	
}
