package Kentucky;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class autoScript1 {
	public static WebDriver driver;
	  @BeforeTest
public void BeforeTest() throws InterruptedException, FindFailed, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://catplay.kylottery.com/en-us/playnow/instantplay.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//Open the Browser tool
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F12);
		robot.keyRelease(KeyEvent.VK_F12);
		Set<String> windows =driver.getWindowHandles();// get the handles for the new window
		int count=windows.size();
		System.out.println("Total window "+count);// count how many windows opened
		
		//select network tab
		Screen screen = new Screen();
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
	  }
	
  
  @AfterTest
  public void AfterTest()
  {
	  driver.close();
  }
  
  @Test(priority=2)
  public void quickPlay() throws InterruptedException, FindFailed{
	//Scroll down
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,1400)", "");
	  
   	Screen screen = new Screen();
   	Pattern quick1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\quickPlay\\quick1.png");
   	screen.wait(quick1,40000);
   	screen.click(quick1);
   	
   	Pattern try2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\quickPlay\\try2.png");
   	Thread.sleep(3000);
   	screen.click(try2);
   	
   	Pattern try3 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\quickPlay\\try3.png");
   	screen.wait(try3,40000);	
   	screen.click(try3);
   	
   	Pattern revealAll4 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\quickPlay\\revealAll4.png");
   	screen.wait(revealAll4,40000);	
   	screen.click(revealAll4);
   	
   	Pattern close5 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\quickPlay\\close5.png");
   	screen.wait(close5,40000);
   	
   	Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\quickPlay\\home6.png");
   	screen.wait(home,40000);
   	Thread.sleep(2000);
   	screen.click(home);
   	
  }
  
  @Test(priority=1)
  public void CelticCionsJackpot() throws InterruptedException, FindFailed{
	  
   	Screen screen = new Screen();
   	Pattern celtic = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\CelticCoinsJackpot\\celtic1.png");
   	screen.wait(celtic,40000);
   	screen.click(celtic);
   	
   	Pattern try2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\CelticCoinsJackpot\\try2.png");
   	Thread.sleep(3000);
   	screen.click(try2);
   	
   	Pattern start3 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\CelticCoinsJackpot\\start3.png");
   	screen.wait(start3,40000);	
   	screen.click(start3);
   	
   	Pattern try4 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\CelticCoinsJackpot\\try4.png");
   	screen.wait(try4,40000);	
   	screen.click(try4);
   	
   	Pattern revealAll5 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\CelticCoinsJackpot\\revealAll5.png");
   	screen.wait(revealAll5,40000);	
   	screen.click(revealAll5);
   	
   	Pattern home7 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\CelticCoinsJackpot\\home7.png");
   	screen.wait(home7,40000);
   	Thread.sleep(2000);
   	screen.click(home7);
   	
  }
  
}