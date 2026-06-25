package HandlingMultipleElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
		driver.get("file:///C:/Users/manik/Downloads/EmbededWebpage.html");
	WebElement countryname = driver.findElement(By.cssSelector("select[name='country2']"));
	Select selectobj = new Select(countryname);
	 boolean Status = selectobj.isMultiple();
	 
	// boolean ele 
	 if(Status) {
		 System.out.println("Is multiple select Dropdown");
	}else {
		System.out.println("Is single select Dropdown");
	
	//select by using Index
		selectobj.selectByIndex(4);
		Thread.sleep(3000);
		
		selectobj.selectByValue("ind");
		selectobj.selectByValue("aus");
		selectobj.selectByValue("cnd");
		Thread.sleep(3000);
		
		selectobj.selectByVisibleText("AUSTRALIA");
		Thread.sleep(3000);
		
	//get option
		 List<WebElement> selectoptions=selectobj.getAllSelectedOptions();
		 //for(	 
		 }
	}}