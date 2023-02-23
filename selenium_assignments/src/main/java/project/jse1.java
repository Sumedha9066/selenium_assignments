package project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jse1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");  //specifing path for chrome driver
		WebDriver wd=new ChromeDriver(); //object creation of chrome driver
	wd.get("https://demoqa.com/text-box");
	  JavascriptExecutor js=(JavascriptExecutor)wd; //java script executor taking place of web driver (replacing)
	  Thread.sleep(2000);
	  
	  js.executeScript("document.getElementById('userName').value='tushar'");
	  js.executeScript("document.getElementById('userEmail').value='Sample@mail.com'");
	  js.executeScript("document.getElementById('currentAddress').value='Maharashtra,India'");
	  js.executeScript("document.getElementById('permanentAddress').value='Maharashtra,India'");
	  js.executeScript("document.getElementById('submit').click()");
	  js.executeScript("window.scrollBy(0,600)");  //scrolling page down(0 for x axis and 600 for y axis)
	  
	  System.out.println(js.executeScript("return document.title")); //getting title
	  System.out.println(js.executeScript("return document.domain")); //getting url
	 
	  System.out.println(js.executeScript("return document.getElementById('submit').innerText")); //getting text from perticular location
	  Thread.sleep(5000);

}
}
