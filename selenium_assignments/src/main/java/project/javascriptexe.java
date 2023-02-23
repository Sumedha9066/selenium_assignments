package project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class javascriptexe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");  //specifing path for chrome driver
		WebDriver wd=new ChromeDriver(); //object creation of chrome driver
		wd.navigate().to("https://demoqa.com/text-box"); //navigating to given url
		wd.manage().window().maximize(); //open browser in full window
				JavascriptExecutor js = (JavascriptExecutor) wd;
		
		Thread.sleep(3000);
		js.executeScript("document.getElementById('userName').vlaue='selenium'");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('userEmail').vlaue='demo1@gmail.com'");
		Thread.sleep(3000);
		js.executeAsyncScript("document.getElementById('currentAddress').vlaue='banglore'");
		Thread.sleep(3000);
		js.executeAsyncScript("document.getElementById('permanentAddress').vlaue='banglore_KARNATAKA'");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('submit').click()");
		Thread.sleep(3000);
		
	

	}

}
