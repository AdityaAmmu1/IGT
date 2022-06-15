package Kentucky;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class autoScript2{
	public static WebDriver driver;
	public static Iterator<String> iterator;
	public static Set<String> windowHandles;
	  @BeforeTest
  public void BeforeTest() throws InterruptedException, FindFailed, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://catplay.kylottery.com/en-us/playnow/instantplay.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//Login to portal
		driver.findElement(By.id("portal-username")).sendKeys("sara.middleton@igt.com");
		driver.findElement(By.xpath("//*[@id=\"portal-password\"]")).sendKeys("Testing10");
		WebElement radio = driver.findElement(By.xpath("//*[@id=\"acceptTerms\"]"));
		radio.click();
		driver.findElement(By.xpath("//*[@id=\"portal-loginButton\"]")).click();
		Thread.sleep(10000);
		
		

		 // switch to game screen
		 WebElement down = driver.findElement(By.xpath("//*[@id=\"pd-main-nav\"]/ul/li[2]/a"));
		 down.click();
		 WebElement instantPlay = driver.findElement(By.xpath("//*[@id=\"pd-main-nav\"]/ul/li[2]/ul/li[1]/a"));
		 instantPlay.click();
		 Thread.sleep(5000);
		 
		//Open the Browser tool
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_F12);
			robot.keyRelease(KeyEvent.VK_F12);
			Set<String> windows =driver.getWindowHandles();// get the handles for the new window
			int count=windows.size();
			System.out.println("Total window "+count);// count how many windows opened
//			
//			Iterator<String> iterator = windows.iterator();
//			String parentwindow = iterator.next();
//			String childwindow = iterator.next();
//			driver.switchTo().window(childwindow);
			
			Screen screen = new Screen();
//			Pattern direct = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\lobby\\direct.png");
//		   	Thread.sleep(2000);
//		   	screen.click(direct);
//		   	
//			Pattern network = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\lobby\\network.png");
//		   	Thread.sleep(2000);
			if(screen.exists("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\lobby\\network.png")!= null){
				Pattern network = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\lobby\\network.png");
				Thread.sleep(2000);
				screen.click(network);
			}
			else
			{
				Pattern direct = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\lobby\\direct.png");
			   	Thread.sleep(2000);
			   	screen.click(direct);
			   	
				Pattern network = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\lobby\\network.png");
				Thread.sleep(2000);
				screen.click(network);
			}
		   	
		
		   	int count1 = windows.size();
		   	System.out.println("Total Window Count"+count1);
//		   	driver.switchTo().window(parentwindow);
		
  }
  
  @AfterTest
  public void AfterTest() throws FindFailed
  {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,0)", "");
		WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"topnavigation\"]/div/nav/button"));
		dropDown.click();
		Screen screen1 = new Screen();
		Pattern logout = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\lobby\\logout1.png");
		screen1.wait(logout,40000);
		screen1.click(logout);
		driver.close();
  }
  
  @Test(priority = 2)
  public void quickPlay() throws InterruptedException, FindFailed{
		  
	  JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1400)", "");
	  
	Screen screen = new Screen();
   	Pattern quick1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\quickPlay\\Login\\Lqucikplay1.png");
   	Thread.sleep(5000);
   	screen.click(quick1);
   	
   	Pattern playnow = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\quickPlay\\Login\\Lplaynow2.png");
   	Thread.sleep(10000);
   	screen.click(playnow);
   	
   	Pattern buy = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\quickPlay\\Login\\Lbuy1.png");
   	screen.wait(buy,40000);
   	screen.click(buy);
   	
   	Pattern revealAll4 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\quickPlay\\Login\\revealall2.png");
   	screen.wait(revealAll4,40000);
   	screen.click(revealAll4);
   	
   	Pattern close5 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\quickPlay\\Login\\LplayAgain3.png");
   	screen.wait(close5,40000);
   	//screen.click(close5,40000);
   	
   	Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\quickPlay\\Login\\Lhome4.png");
   	screen.wait(home,40000);
   	Thread.sleep(2000);
   	screen.click(home);
  }
  
  @Test(priority=1,invocationCount = 2)
  public void CelticCionsJackpot() throws InterruptedException, FindFailed{
	
   	Screen screen = new Screen();
   	Pattern celtic = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\CelticCoinsJackpot\\celtic1.png");
   	screen.wait(celtic,40000);
   	screen.click(celtic);
   	
   	Pattern playnow = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\CelticCoinsJackpot\\Lplaynow1.png");
   	Thread.sleep(3000);
   	screen.click(playnow);
   	
   	Pattern start3 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\CelticCoinsJackpot\\Lstart3.png");
   	screen.wait(start3,40000);
   	screen.click(start3);
   	
   	Pattern buy4 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\CelticCoinsJackpot\\Lbuy2.png");
   	screen.wait(buy4,40000);	
   	screen.click(buy4);
   	
   	Pattern try5 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\CelticCoinsJackpot\\Lreveal3.png");
   	screen.wait(try5,40000);	
   	screen.click(try5);
   	
   	Pattern home6 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\CelticCoinsJackpot\\Lhome.png");
   	screen.wait(home6,40000);
   	Thread.sleep(2000);
   	screen.click(home6);
 }
  
}