package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Code {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");  //specifing path for chrome driver
		WebDriver wd=new ChromeDriver(); //object creation of chrome driver
		wd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //navigating to given url
		wd.manage().window().maximize(); //open browser in full window
		     
		Thread.sleep(2000); //for wait
		wd.findElement(By.name("username")).sendKeys("Admin");  //sending Admin in username
		wd.findElement(By.name("password")).sendKeys("admin123"); // sending admin123 in password
		wd.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();  //clicking on "login" button                                          
         
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@class=\"oxd-userdropdown-name\"]")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@class=\"oxd-userdropdown-link\"]")).click();
	}

}
