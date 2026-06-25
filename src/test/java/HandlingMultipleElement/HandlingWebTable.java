package HandlingMultipleElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://vinothqaacademy.com/webtable/");
	WebElement vinoth_details = driver.findElement(By.xpath("//table[@id='myTable']//tr[3]//td[2]"));
	System.out.println(vinoth_details.getText());
	
	 List<WebElement> Alldetails = driver.findElements(By.xpath("//table[@id='myTable']//tr//td[2]"));
	 for(int i=0;i<Alldetails.size();i++) {
		 System.out.println(Alldetails.get(i).getText());
	 }

	}

}
