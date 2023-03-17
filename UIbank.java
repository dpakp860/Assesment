package weeek4.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class UIbank {
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://uibank.uipath.com/register-account'");
	driver.manage().window().maximize();
	driver.findElement(By.id("firstName")).sendKeys("Deepak");
    WebElement title = driver.findElement(By.id("title"));
    Select selectTitle = new Select(title);
    selectTitle.selectByValue("mr");


    driver.findElement(By.id("middleName")).sendKeys("Selena");

    driver.findElement(By.id("lastName")).sendKeys("Prabahakaran");

    WebElement gender = driver.findElement(By.name("gender"));
    Select selectGender = new Select(gender);
    selectGender.selectByValue("male");

    
    WebElement employmentStatus = driver.findElement(By.name("employmentStatus"));
    Select selectEmploymentStatus = new Select(employmentStatus);
    selectEmploymentStatus.selectByVisibleText("Unemployed");

    
    driver.findElement(By.name("username")).sendKeys("Deepak14");

    driver.findElement(By.name("email")).sendKeys("dpakp82@gmail.com");
 
    driver.findElement(By.id("password")).sendKeys("dpak123");
   
    driver.close();

}
}
