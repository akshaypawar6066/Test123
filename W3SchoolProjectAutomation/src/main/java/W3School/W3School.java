package W3School;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School
{
   public static void main(String[] args) 
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\aksha\\Downloads\\Selenium\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
	     driver.get("https://www.w3schools.com/");
	     driver.manage().window().maximize();
         WebElement search=driver.findElement(By.xpath("//input[@id='search2']"));
         search.sendKeys("Java");
         WebElement searchbutton=driver.findElement(By.xpath("//button[@id='learntocode_searchbtn']"));
         searchbutton.click();
   
   }
}
