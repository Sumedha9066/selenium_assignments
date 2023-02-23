package project;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class qa {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");  //specifing path for chrome driver
		WebDriver wd=new ChromeDriver(); //object creation of chrome driver
		Actions act=new Actions(wd);
		wd.navigate().to("https://demoqa.com/"); //navigating to given url
		wd.manage().window().maximize(); //open browser in full window
		Robot rc=new Robot();  //we are creating object of robot
		rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN); 
		
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@class=\"category-cards\"]/div[1]")).click();
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@class='element-list collapse show']/ul/li[1]")).click();
		
		Thread.sleep(2000);
		wd.findElement(By.id("userName")).sendKeys("sumedha");
		Thread.sleep(2000);
		wd.findElement(By.id("userEmail")).sendKeys("patilsumedha31@gmail.com");
		Thread.sleep(2000);
		wd.findElement(By.id("currentAddress")).sendKeys("hno.13-2-5");
		Thread.sleep(2000);
		rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		wd.findElement(By.id("permanentAddress")).sendKeys("hno.13-2-5");
		Thread.sleep(2000);
		wd.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		//rc.keyPress(MenuKeyEvent.VK_PAGE_UP);
		wd.findElement(By.xpath("//*[@class=\"element-list collapse show\"]/ul/li[3]")).click();
		Thread.sleep(4000);
		wd.findElement(By.xpath("//*[@class=\"custom-control-label\"][1]")).click();
		Thread.sleep(1000);
		//wd.findElement(By.id("impressiveRadio")).click();
		rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		//radio button
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@class=\"element-list collapse show\"]/ul/li[4]")).click();
		
		//web tables
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@class=\"action-buttons\"]/span[1]")).click();
		Thread.sleep(2000);
		wd.findElement(By.id("firstName")).clear();
		wd.findElement(By.id("firstName")).sendKeys("sumedha");
		Thread.sleep(2000);
		wd.findElement(By.id("lastName")).clear();
		wd.findElement(By.id("lastName")).sendKeys("p");
		Thread.sleep(2000);
		wd.findElement(By.id("userEmail")).clear();
		wd.findElement(By.id("userEmail")).sendKeys("abcd12@gmail.com");
		Thread.sleep(2000);
		wd.findElement(By.id("age")).clear();
		wd.findElement(By.id("age")).sendKeys("40");
		Thread.sleep(2000);
		wd.findElement(By.id("salary")).clear();
		wd.findElement(By.id("salary")).sendKeys("100");
		Thread.sleep(2000);
		wd.findElement(By.id("department")).clear();
		wd.findElement(By.id("department")).sendKeys("selenium");
		Thread.sleep(2000);
		wd.findElement(By.id("submit")).click();
		
		Thread.sleep(2000);
		rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		//links
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@class=\"element-list collapse show\"]/ul/li[5]")).click();
		Thread.sleep(8000);
		WebElement w =  wd.findElement(By.id("doubleClickBtn"));
		act.doubleClick(w);
		Thread.sleep(8000);
		WebElement x=wd.findElement(By.id("rightClickBtn"));
		act.contextClick(x);
		Thread.sleep(2000);
		rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		//wd.findElement(By.xpath("//*[@id=\"4wfO2\"]")).click();
		wd.findElement(By.xpath("//*[@class=\"element-list collapse show\"]/ul/li[6]")).click();
		Thread.sleep(2000);
		rc.keyPress(MenuKeyEvent.VK_PAGE_UP);
		Thread.sleep(2000);
		wd.findElement(By.id("simpleLink")).click();
		Thread.sleep(3000);
		rc.keyPress(MenuKeyEvent.VK_CONTROL);
		rc.keyPress(MenuKeyEvent.VK_TAB);
		rc.keyRelease(MenuKeyEvent.VK_CONTROL);
		rc.keyRelease(MenuKeyEvent.VK_TAB);
	
	}

}
