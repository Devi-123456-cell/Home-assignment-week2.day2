package week2.day2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.partialLinkText("CRM")).click();
    driver.findElement(By.linkText("Accounts")).click();
    driver.findElement(By.linkText("Create Account")).click();
    driver.findElement(By.id("accountName")).sendKeys("DEVISAI");
    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
    driver.findElement(By.id("numberEmployees")).sendKeys("10");
    
    WebElement industry = driver.findElement(By.name("industryEnumId"));
    Select select= new Select(industry);
    select.selectByIndex(3);
    
    WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
    Select select1=new Select(ownership);
    select1.selectByVisibleText("S-Corporation");
    
     // WebElement  employees =
     // Select select2= new Select(employees);
     //  select2.selectByValue("10");
    
      WebElement campign = driver.findElement(By.id("marketingCampaignId"));
      Select select3= new Select(campign);
        select3.selectByIndex(6);

    WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
    Select select4= new Select(state);
    select4.selectByValue("TX");
    
    driver.findElement(By.className("smallSubmit")).click();
    driver.close();
    
    		
    		
    		
    		
    		
    		
 
 
    
    
	

	}

}
