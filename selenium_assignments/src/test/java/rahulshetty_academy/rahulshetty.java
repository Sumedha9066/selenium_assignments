package rahulshetty_academy;

import org.testng.annotations.Test;

import io.appium.java_client.android.nativekey.KeyEvent;

import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class rahulshetty {
	WebDriver wd;
	Robot rc;
	WebDriverWait wait;
	JavascriptExecutor js;

	@BeforeTest
	public void beforeTest() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		rc = new Robot();
		wd.get("https://rahulshettyacademy.com/AutomationPractice/");
	    wait = new WebDriverWait(wd,30);
	    js = (JavascriptExecutor) wd;
		Thread.sleep(3000);
	}

	@Test(priority = 0)
	public void radio_buttons() throws InterruptedException {
		
			Thread.sleep(1000);
			wd.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[1]/input")).click();
			Thread.sleep(1000);
			wd.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input")).click();
			Thread.sleep(1000);
            wd.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[3]/input")).click();
		} 
	
    @Test(priority = 1)
    public void suggestion() throws InterruptedException {
    	
    	    Thread.sleep(1000);
    	    wd.findElement(By.id("autocomplete")).sendKeys("india");
    	    Thread.sleep(1000);
    	    //wd.findElement(By.xpath("//*[@id=\"ui-id-184\"]")).click();
    }
    @Test(priority = 2)
    public void dropdown () throws InterruptedException {
    	

  	  wd.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]/option[2]")).click();  //click on drop down box
  	  Thread.sleep(1500);
  	  wd.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]/option[3]")).click();  //Option 1 is selected from the drop down
  	  Thread.sleep(4000);
  	  wd.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]/option[4]")).click(); //Option 1 ---> Option 3
  	  Thread.sleep(3000);
    
     }
    
	@Test(priority = 3)
	public void check_box() throws InterruptedException {
		
		wd.findElement(By.id("checkBoxOption1")).click();
	    Thread.sleep(1000);
	    wd.findElement(By.id("checkBoxOption2")).click();
	    Thread.sleep(1000);
	    wd.findElement(By.id("checkBoxOption3")).click();

		}
    @Test(priority = 4)
    public void switch_window() throws InterruptedException {
    	
      	
    	  wd.findElement(By.id("openwindow")).click();     
    	  Thread.sleep(6000);
    	  String parent=wd.getWindowHandle();              
    	  Set<String> allWindow = wd.getWindowHandles();  
    		String lastWindow="";
    		
    		for(String handle:allWindow) {          
    			wd.switchTo().window(handle);
    			lastWindow=handle;                       
    		}
    		
    		wd.switchTo().window(lastWindow);             
    		Thread.sleep(1500);
    		wd.close();                                  
    		wd.switchTo().window(parent);                 
    		Thread.sleep(3000);
    }
    
    @Test(priority = 5)
    public void switch_tab() throws InterruptedException {
    	
    	wd.findElement(By.id("opentab")).click();
    	Thread.sleep(3000);
    	
    	rc.keyPress(MenuKeyEvent.VK_CONTROL);
    	rc.keyPress(MenuKeyEvent.VK_TAB);
    	rc.keyRelease(MenuKeyEvent.VK_CONTROL);
    	rc.keyRelease(MenuKeyEvent.VK_TAB);
    	Thread.sleep(1000);
    	
    	
    }
    @Test(priority = 6)
    public <alert> void switch_to_alert() throws InterruptedException {
    	wd.findElement(By.id("name")).sendKeys("rahul");
    	Thread.sleep(1000);
    	wd.findElement(By.id("alertbtn")).click();
    	Thread.sleep(1000);
    	Alert alt= wd.switchTo().alert();
    	alt.accept();
    	Thread.sleep(1000);
    	wd.findElement(By.id("confirmbtn")).click();
    	Thread.sleep(1000);
    	alt.dismiss();
    	Thread.sleep(1000);
    }
    @Test(priority =7 )
    public void element_display() throws InterruptedException {
    	rc.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
       	Thread.sleep(1000);
    	wd.findElement(By.id("hide-textbox")).click();
    	Thread.sleep(1000);
    	Thread.sleep(1000);
    	wd.findElement(By.id("show-textbox")).click();

    }
    
    @Test(priority = 8)
    public void table() throws InterruptedException {
    	js.executeScript("document.getElementsByClassName('tableFixHead')[0].scrollBy(0,document.body.scrollHeight)"); 
    	Thread.sleep(1000);
    }
    
    @Test(priority = 9)
    public void mouse_hover() throws InterruptedException {
    	 js.executeScript("window.scrollBy(0,1500)");
   	  Thread.sleep(3500);
   	  wd.switchTo().frame("courses-iframe");                             
   	  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");  
   	  Thread.sleep(3000);
     }
    	
    	
    
    
    

	@AfterTest
	public void afterTest() {
	}

}
