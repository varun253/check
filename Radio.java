package assign;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Radio{
	
		public static void main(String[] args)
		{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ksclp\\Downloads\\radha\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://test.rubywatir.com/radios.php");
		WebElement radiobutton;
				driver.findElement(By.xpath("//input[@value='Not sure']")).click();
		driver.findElement(By.xpath("//input[@value='Nope']")).click();
	driver.get("http://test.rubywatir.com/checkboxes.php");
		
	//	List<WebElement>
	
		 List<WebElement> element =driver.findElements(By.xpath("//input[@name='sports']"));
		 driver.findElement(By.xpath("//input[@value='football']")).click();
		 driver.findElement(By.xpath("//input[@value='baseball']")).click();
		 driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
     
         for(int i=0;i<element.size();i++)
         {
       	  String optValue=element.get(i).getText();
       	  
       	  if(optValue.equalsIgnoreCase("Football")||optValue.equalsIgnoreCase("Baseball"))
       		  
       	  {
       		  System.out.println(optValue);
       		  element.get(i).click();
       	  }
         }
   
            System.out.println("checkbox -  ");							
		
		/*String baseURL="https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html";
		driver.get(baseURL);

		driver.findElement(By.xpath("//select[@class='form-control']")).click();
		Select day = new Select(driver.findElement(By.id("select-demo")));
		 day.selectByVisibleText("Monday");
		 System.out.println("print it out");*/
}
}
		
		
