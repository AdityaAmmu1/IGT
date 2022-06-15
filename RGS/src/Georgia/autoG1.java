package Georgia;

import java.awt.AWTException;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class autoG1 {
	public static WebDriver driver;
	@BeforeTest
	public void beforeTest() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://gasc1playdigital.dev.igt.com/en-us/home.html");
		driver.manage().window().maximize();
		for(int i=0;i<2;i++) {
			WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
			newTab.get("https://gasc1playdigital.dev.igt.com/en-us/home.html");
		}

	}
	@org.testng.annotations.AfterTest
	public void AfterTest() {
		driver.close();
	}
	
	
	@Test(priority=2)
		public void JJB() throws InterruptedException, FindFailed {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
		
		driver.findElement(By.xpath("//*[@id=\"pd-main-nav\"]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"pd-main-nav\"]/div/ul/li[1]/ul/li[2]/ul/li[2]/a")).click();
		
		Screen screen = new Screen();
		Pattern ccj = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\JJB\\image1.png");
		Thread.sleep(10000);
		screen.hover(ccj);
		
		Pattern try2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\JJB\\try2.png");
		screen.wait(try2,40000);
		screen.click(try2);
		
		Pattern start3 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\JJB\\start3.png");
		screen.wait(start3,40000);
		screen.click(start3);
		
		Pattern try4 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\JJB\\try4.png");
		screen.wait(try4,40000);
		screen.click(try4);
		
		Pattern revealAll5 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\JJB\\revealAll5.png");
		screen.wait(revealAll5,40000);
		screen.click(revealAll5);
		
		Pattern try5 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\JJB\\try5.png");
		screen.wait(try5,40000);
		
		Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\JJB\\home6.png");
		screen.wait(home,40000);
		screen.click(home);
		
  }
	
	@Test(priority=1)
	  public void CCJ2() throws InterruptedException, FindFailed, AWTException {
			
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(0));
			
		driver.findElement(By.xpath("//*[@id=\"pd-main-nav\"]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"pd-main-nav\"]/div/ul/li[1]/ul/li[2]/ul/li[2]/a")).click();
		Screen screen = new Screen();
		Pattern ccj = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\CCJ\\image1.png");
		Thread.sleep(10000);
		screen.hover(ccj);
			
		Pattern try2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\CCJ\\try1.png");
		screen.wait(try2,40000);
		screen.click(try2);
			
		Pattern start3 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\CCJ\\start3.png");
		screen.wait(start3,40000);
		screen.click(start3);
		
//		Pattern sound1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\CCJ\\sound1.png");
//		screen.wait(sound1,40000);
//		screen.click(sound1);
//		
//		Pattern sound2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\CCJ\\sound2.png");
//		screen.wait(sound2,40000);
//		screen.click(sound2);
//		Pattern sound3 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\CCJ\\sound3.png");
//		screen.wait(sound3,40000);
//		screen.click(sound3);
//		
//		Pattern sound4 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\CCJ\\sound3.png");
//		screen.wait(sound4,40000);
//		screen.click(sound4);
			
		Pattern try4 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\CCJ\\try4.png");
		screen.wait(try4,40000);
		screen.click(try4);
			
		Pattern revealAll5 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\CCJ\\revealAll5.png");
		screen.wait(revealAll5,40000);
		screen.click(revealAll5);
			
		Pattern try5 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\CCJ\\try4.png");
		screen.wait(try5,40000);
			
		Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\CCJ\\home.png");
		screen.wait(home,40000);
		screen.click(home);
			
	  }
	@Test(priority=3)
	  public void MM() throws InterruptedException, FindFailed {
			ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(newTb.get(2));
			
			driver.findElement(By.xpath("//*[@id=\"pd-main-nav\"]/div/ul/li[1]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"pd-main-nav\"]/div/ul/li[1]/ul/li[2]/ul/li[2]/a")).click();
			
			Screen screen = new Screen();
			Pattern ccj = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\MM\\image1.png");
			Thread.sleep(10000);
			screen.hover(ccj);
			
			Pattern try2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\MM\\try2.png");
			screen.wait(try2,40000);
			screen.click(try2);
			
			Pattern start3 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\MM\\start3.png");
			screen.wait(start3,40000);
			screen.click(start3);
			
			Pattern try4 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\MM\\try4.png");
			screen.wait(try4,40000);
			screen.click(try4);
			
			Pattern revealAll5 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\MM\\revealAll5.png");
			screen.wait(revealAll5,40000);
			screen.click(revealAll5);
			
			Pattern try5 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\MM\\try5.png");
			screen.wait(try5,40000);
			
			Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\georgia\\MM\\home6.png");
			screen.wait(home,40000);
			screen.click(home);
			
	  }
}
