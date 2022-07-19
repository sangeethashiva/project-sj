package org.tst;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass {
	
	public static WebDriver driver;
	
	
	//chrome launch
	
	public static WebDriver chromeLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
	}
	
	//edge launch
	public static WebDriver edgeLaunch() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		return driver;
		
	}
	
//	//implicit wait
//	public static void implicit() {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//	}
	
	//url launch
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	//send keys
	public static void sendkeys(WebElement e,String data) {
		e.sendKeys(data);
	}
	
	//click
	public static void click(WebElement e) {
		e.click();
	}
	
	//quit
	public static void quit() {
		driver.quit();
	}
	//getcurrent url
	public static String getcurrenturl() {
		String url=driver.getCurrentUrl();
		return url;
	}
	
	//close
	public static void close() {
		driver.close();
	}
	
//	actions used
//	click
	public static void click() {
		Actions a=new Actions(driver);
		a.click().perform();
	}
	
	//context click
	public static void contextclick() {
		Actions a=new Actions(driver);
		a.contextClick().perform();
	}
	
	//doubleclick
	public static void doubleclick() {
		Actions a=new Actions(driver);
		a.doubleClick().perform();
	}
	
	//drag and drop
	public static void dragandDrop(WebElement source, WebElement target) {
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target);
	}
	
	//context click
	public static void contextclick(WebElement target) {
		Actions a=new Actions(driver);
		a.contextClick(target);
	}
	
	//move to element
	public static void movetoelement(WebElement target) {
		Actions a=new Actions(driver);
		a.moveToElement(target);
	}
	
	//sendkeys - char sequence
	public static void sendkeys(CharSequence keys) {
		Actions a=new Actions(driver);
		a.sendKeys(keys);
	}
	
	//sendkeys web e ,char seq....
	public static void sendkeys(WebElement target, CharSequence keys) {
		Actions a=new Actions(driver);
		a.sendKeys(target, keys);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
