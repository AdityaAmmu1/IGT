package Kentucky;

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

public class autoScript3{
	public static WebDriver driver;
	public static Iterator<String> iterator;
	public static Set<String> windowHandles;
	  @BeforeTest
  public void BeforeTest() throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (2)\\chromedriver.exe");
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
		
  }
  
  @AfterTest
  public void AfterTest() throws FindFailed
  {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,0)", "");
		WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"loggedInDiv\"]/div[1]/button/span[1]"));
		dropDown.click();
		Screen screen1 = new Screen();
		Pattern logout = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\lobby\\logout.png");
		screen1.wait(logout,40000);
		screen1.click(logout);	
		driver.close();
  }
  
  @Test(priority=1,invocationCount = 2)
  public void CelticCionsJackpot() throws InterruptedException, FindFailed{
	
   	Screen screen = new Screen();
   	Pattern celtic = new Pattern("https://gtechcorp.sharepoint.com/sites/RGSeInstant/Shared%20Documents/Forms/AllItems.aspx?csf=1&web=1&e=PIHKJ7&cid=a64b0bd7%2D9644%2D4403%2Da4e1%2D48846b4e8d01&FolderCTID=0x0120004D43CBD58EA1A440B309B4EF9FD08078&id=%2Fsites%2FRGSeInstant%2FShared%20Documents%2FSkill%20transfer%2FQA%2FSikuliImages%2FsekuliImages%2FKentucky%2FCelticCoinsJackpot&viewid=a9cbab4a%2De06c%2D4ee7%2Dbad6%2D87a3247a1c90\\celtic1.png");
   	screen.wait(celtic,40000);
   	screen.click(celtic);
   	
   	Pattern try2 = new Pattern("https://gtechcorp.sharepoint.com/sites/RGSeInstant/Shared%20Documents/Forms/AllItems.aspx?csf=1&web=1&e=PIHKJ7&cid=a64b0bd7%2D9644%2D4403%2Da4e1%2D48846b4e8d01&FolderCTID=0x0120004D43CBD58EA1A440B309B4EF9FD08078&id=%2Fsites%2FRGSeInstant%2FShared%20Documents%2FSkill%20transfer%2FQA%2FSikuliImages%2FsekuliImages%2FKentucky%2FCelticCoinsJackpot&viewid=a9cbab4a%2De06c%2D4ee7%2Dbad6%2D87a3247a1c90\\try2.png");
   	Thread.sleep(3000);
   	screen.click(try2);
   	
   	Pattern start3 = new Pattern("https://gtechcorp.sharepoint.com/sites/RGSeInstant/Shared%20Documents/Forms/AllItems.aspx?csf=1&web=1&e=PIHKJ7&cid=a64b0bd7%2D9644%2D4403%2Da4e1%2D48846b4e8d01&FolderCTID=0x0120004D43CBD58EA1A440B309B4EF9FD08078&id=%2Fsites%2FRGSeInstant%2FShared%20Documents%2FSkill%20transfer%2FQA%2FSikuliImages%2FsekuliImages%2FKentucky%2FCelticCoinsJackpot&viewid=a9cbab4a%2De06c%2D4ee7%2Dbad6%2D87a3247a1c90\\start3.png");
   	screen.wait(start3,40000);	
   	screen.click(start3);
   	
   	Pattern try4 = new Pattern("https://gtechcorp.sharepoint.com/sites/RGSeInstant/Shared%20Documents/Forms/AllItems.aspx?csf=1&web=1&e=PIHKJ7&cid=a64b0bd7%2D9644%2D4403%2Da4e1%2D48846b4e8d01&FolderCTID=0x0120004D43CBD58EA1A440B309B4EF9FD08078&id=%2Fsites%2FRGSeInstant%2FShared%20Documents%2FSkill%20transfer%2FQA%2FSikuliImages%2FsekuliImages%2FKentucky%2FCelticCoinsJackpot&viewid=a9cbab4a%2De06c%2D4ee7%2Dbad6%2D87a3247a1c90\\try4.png");
   	screen.wait(try4,40000);	
   	screen.click(try4);
   	
   	Pattern revealAll5 = new Pattern("https://gtechcorp.sharepoint.com/sites/RGSeInstant/Shared%20Documents/Forms/AllItems.aspx?csf=1&web=1&e=PIHKJ7&cid=a64b0bd7%2D9644%2D4403%2Da4e1%2D48846b4e8d01&FolderCTID=0x0120004D43CBD58EA1A440B309B4EF9FD08078&id=%2Fsites%2FRGSeInstant%2FShared%20Documents%2FSkill%20transfer%2FQA%2FSikuliImages%2FsekuliImages%2FKentucky%2FCelticCoinsJackpot&viewid=a9cbab4a%2De06c%2D4ee7%2Dbad6%2D87a3247a1c90\\revealAll5.png");
   	screen.wait(revealAll5,40000);	
   	screen.click(revealAll5);
   	
   	Pattern home7 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\Kentucky\\CelticCoinsJackpot\\home7.png");
   	screen.wait(home7,40000);
   	Thread.sleep(2000);
   	screen.click(home7);
 }
  
}
