package autom3.Selenium;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JPetStoreTest {

	@Test
	public void monPremierTestSelenium() {
		//renseigne l'emplacement dur driver
		System.setProperty("webdriver.gecko.driver", "/Users/xincheng/Documents/NavigateurDrivers/geckodriver");

		//instanciation de WebDriver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		//navigation
		driver.get("https://jpetstore.cfapps.io/");

		//Se connecter
		driver.findElement(By.xpath("//a[.='Enter the Store']")).click(); //enter the store
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click(); //click 'Sing In'
		driver.findElement(By.xpath("//input[@name='username']")).clear(); //find username, clear
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("j2ee"); //enter j2ee
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("j2ee");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		//assertTrue();
		
		//navigate dans le catalogue
		
	}



}
