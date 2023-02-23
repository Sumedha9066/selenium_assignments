package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class code1 {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");  //specifing path for chrome driver
		WebDriver wd=new ChromeDriver(); //object creation of chrome driver
		wd.navigate().to("https://www.amazon.in/"); //navigating to given url
		wd.manage().window().maximize(); //open browser in full window
		
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@class=\"nav-a nav-a-2   nav-progressive-attribute\"]")).click();
		
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@class=\"a-input-text a-span12 auth-autofocus auth-required-field\"]")).click();
		
		Thread.sleep(1000);
		wd.findElement(By.id("ap_email")).sendKeys("patilsumedha31@gmail.com");
		
		Thread.sleep(1000);
		wd.findElement(By.id("continue")).click();
		
        Thread.sleep(1000);
		wd.findElement(By.id("ap_password")).sendKeys("amit@S9066");
		
		Thread.sleep(1000);
		wd.findElement(By.id("signInSubmit")).click();
		
		
	    Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]")).click();
		
		
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
		Thread.sleep(1000);
		wd.findElement(By.linkText("Amazon Pay")).click();
		
		Thread.sleep(3000);
		wd.findElement(By.xpath("//*[@class=\"icp-nav-flag icp-nav-flag-in icp-nav-flag-discoverability-t1\"]")).click();
		
		///html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[8] 
				
				//*[@id="nav-xshop"]/a[8]
		Thread.sleep(3000);
		wd.findElement(By.id("glow-ingress-line2")).click();
		
		Thread.sleep(3000);
		wd.findElement(By.className("a-button-input")).click();
		
		Thread.sleep(3000);
		wd.findElement(By.className("rsqc7f-0 ikGtgV")).click();
		
	
		
		
	}

}
