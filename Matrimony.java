package weeek4.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Matrimony { 
	public static void main(String[] args) {
		        EdgeDriver driver = new EdgeDriver();
		        driver.get("https://www.tamilmatrimony.in/");
		        driver.manage().window().maximize();
		         
		        WebElement findElement = driver.findElement(By.id("REGISTERED_BY"));
		        Select dropdown = new Select(findElement);
		        dropdown.selectByValue("1");

		       
		    ;

		        driver.findElement(By.id("NAME")).sendKeys("Deepak");
		        driver.findElement(By.id("gendermale")).click();

		        
		        WebElement dobDayDropDown = driver.findElement(By.id("DOBDAY"));
		        Select selectDobDayDropDown = new Select(dobDayDropDown);
		        selectDobDayDropDown.selectByValue("14");

		        
		        WebElement dobMonthDropDown = driver.findElement(By.id("DOBMONTH"));
		        Select selectDobMonthDropDown = new Select(dobMonthDropDown);
		        selectDobMonthDropDown.selectByValue("3");


		        WebElement dobYearDropDown = driver.findElement(By.id("DOBYEAR"));
		        Select selectDobYearDropDown = new Select(dobYearDropDown);
		        selectDobYearDropDown.selectByValue("2001");

		        
		        WebElement religionDropDown = driver.findElement(By.id("RELIGION"));
		        Select selectReligionDropDown = new Select(religionDropDown);
		        selectReligionDropDown.selectByValue("1");

	
		        WebElement motherTongueDropDown = driver.findElement(By.id("MOTHERTONGUE"));
		        Select selectMotherTongueDropDown = new Select(motherTongueDropDown);
		        selectMotherTongueDropDown.selectByValue("47");

		        
		        WebElement countryDropDown = driver.findElement(By.id("COUNTRY"));
		        Select selectCountryDropDown = new Select(countryDropDown);
		        selectCountryDropDown.selectByVisibleText("India");

		        
		        WebElement m_CountryCodeDropDown = driver.findElement(By.id("M_COUNTRYCODE"));
		        Select selectM_CountryCodeDropDown = new Select(m_CountryCodeDropDown);
		        selectM_CountryCodeDropDown.selectByValue("98");



		        driver.findElement(By.id("MOBILENO")).sendKeys("987654321");
		        driver.findElement(By.id("EMAIL")).sendKeys("dpakp860@gmail.com");
		        driver.findElement(By.name("PASSWD1")).sendKeys("dpak@123");

		        //For closing the browser
//		        driver.quit();


		    }
		
		
	}


