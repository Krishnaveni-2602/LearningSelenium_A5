package learnlocators;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchvalues {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement text = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		 //text1 = text.getText();
		//System.out.println(text1);
 
		
		 //Tagname = text.getTagName();
		////System.out.println(Tagname);
		
		 @Nullable
		 //Attributename = text.getAttribute("class");
		 //System.out.println(Attributename);
		 
		 
		  //CssValue = text.getCssValue("font-style");
		 //System.out.println(CssValue);
		 
		 Dimension size = text.getSize();
		  int size1 = size.getWidth();
		  int size2 = size.getHeight();
		  System.out.println(size);
		  System.out.println(size1);
		  System.out.println(size2);
		  
		  Point location = text.getLocation();
		  int xvalue = location.getX();
		  int yvalue = location.getY();
		  System.out.println(location);
		  System.out.println(xvalue);
		  System.out.println(yvalue);
		  
		   //exptext= "Swag Labs";
		  //if(exptext.equals(text1))
		  {
		  
			  System.out.println("Text verified- pass");
		  }
	//else
	{
		  System.out.println("Text verified- fail");
		  }
		  
	}}
	
           
		
		
			
	
		  
		  
		  
		 
	



