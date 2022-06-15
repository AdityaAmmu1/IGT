package Poland;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;

public class plGames {
	public static WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void beforeMethod(String browser) throws InterruptedException, FindFailed {
		switch(browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			String addproxy = "http://hybrid-web.cluster-a.blackspider.com";
			Proxy proxy = new Proxy();
			proxy.setHttpProxy(addproxy);//http
			proxy.setSslProxy(addproxy);//secure socket layer
			chromeOptions.setCapability("proxy", proxy);
			driver = new ChromeDriver(chromeOptions);
			break;
			
		case "ie":
			  System.setProperty("webdriver.edge.driver","C:\\BrowserDrivers\\msedgedriver.exe");
			  EdgeOptions edgeOptions = new EdgeOptions();
			  String addproxy1 = " http://hybrid-web.cluster-a.blackspider.com";
			  Proxy proxy1 = new Proxy();
			  proxy1.setHttpProxy(addproxy1);//http
			  proxy1.setSslProxy(addproxy1);//secure socket layer
			  edgeOptions.setCapability("proxy", proxy1);
			  driver = new EdgeDriver(edgeOptions);
			break;
			
		case"firefox":
			System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		driver.manage().window().maximize();	
		   driver.get("https://staging.devlotto.pl/");
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[3]/div[2]/div[3]/div/button")).click();
//			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/div/div[2]/button")).click();
//			//entering uid
//			driver.findElement(By.xpath("//*[@id=\"username-dropdown-login\"]")).sendKeys("gierka001");
//			//entering password
//			driver.findElement(By.xpath("//*[@id=\"password-dropdown-login\"]")).sendKeys("Welcome1");
//			System.out.println("login button");
//			Screen screen1 = new Screen();
//			Pattern submit = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\submit.png");
//			  screen1.wait(submit,40000); 
//			  screen1.click(submit);
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[4]/div/div[1]/div/div/div[2]/div[2]/button")).click();
		
		}
	@Test()
	  public void Diamond() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\diamond\\image1.png");
			  screen.wait(diamond,40000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\diamond\\demo2.png");
			  screen.wait(demo,40000); 
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\diamond\\volume3.png");
			  screen.wait(volume,40000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\diamond\\ok4.png");
			  screen.wait(ok,40000);
			  screen.click(ok);
			  
			  Pattern demo1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\diamond\\demo5.png");
			  screen.wait(demo1,40000);
			  screen.click(demo1);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\diamond\\auto6,11.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern moneyplay = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\diamond\\moneyplay8.png");
			  screen.wait(moneyplay,4000);
			  screen.click(moneyplay);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\diamond\\home7.png");
			  screen.wait(home,40000);
			  screen.click(home);
	  }
	 @Test()
	  public void Egypt() throws FindFailed, InterruptedException {
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
		  Thread.sleep(5000);
		  
		  Screen screen = new Screen();
		  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Egypt\\image1.png");
		  screen.wait(diamond,40000);
		  screen.click(diamond);
		  
		  Thread.sleep(10000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,600)", "");
		  
		  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Egypt\\demo2.png");
		  screen.wait(demo,40000); 
		  screen.click(demo);
		  
		  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Egypt\\sound3.png");
		  screen.wait(volume,40000);
		  screen.click(volume);
		  
		  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Egypt\\ok4.png");
		  screen.wait(ok,40000);
		  screen.click(ok);
		  
		  Pattern demo1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Egypt\\demo5.png");
		  screen.wait(demo1,40000);
		  screen.click(demo1);
		  
		  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Egypt\\auto6.png");
		  screen.wait(auto,40000);
		  screen.click(auto);
		  Thread.sleep(3000);
		  
		  Pattern tryAgain = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Egypt\\demo7.png");
		  screen.wait(tryAgain,40000);
		  Thread.sleep(2000);
		  
		  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Egypt\\home8.png");
		  screen.wait(home,40000);
		  screen.click(home);
	}
	  @Test()
	  public void goldRush() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\goldRush\\image1.png");
			  screen.wait(diamond,40000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\goldRush\\demo2.png");
			  screen.wait(demo,40000); 
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\goldRush\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\goldRush\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern demo1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\goldRush\\demo5.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\goldRush\\auto6.png");
			  screen.wait(auto,5000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern tryAgain = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\goldRush\\demo7.png");
			  screen.wait(tryAgain,40000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\goldRush\\home8.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void Card5() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\5card\\image1.png");
			  screen.wait(diamond,5000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\5card\\demo2.png");
			  screen.wait(demo,40000); 
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\5card\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\5card\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern demo1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\5card\\demo5.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\5card\\auto6.png");
			  screen.wait(auto,5000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern tryAgain = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\5card\\demo7.png");
			  screen.wait(tryAgain,40000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\5card\\home8.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void ChristmasBalls() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Christmas balls\\image1.png");
			  screen.wait(diamond,5000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Christmas balls\\demo2.png");
			  screen.wait(demo,40000); 
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Christmas balls\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Christmas balls\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern demo1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Christmas balls\\demo5.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Christmas balls\\auto6.png");
			  screen.wait(auto,5000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern tryAgain = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Christmas balls\\demo7.png");
			  screen.wait(tryAgain,40000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Christmas balls\\home8.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  
	  @Test()
	  public void Cyferki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Cyferki\\image1.png");
			  screen.wait(diamond,5000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Cyferki\\demo2.png");
			  screen.wait(demo,5000); 
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Cyferki\\sound3.png");
			  screen.wait(volume,40000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Cyferki\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern demo1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Cyferki\\demo5.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Cyferki\\try6.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern start = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Cyferki\\start7.png");
			  screen.wait(start,40000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern tryAgain = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Cyferki\\try8.png");
			  screen.wait(tryAgain,40000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Cyferki\\home9.png");
			  screen.wait(home,40000);
			  screen.click(home);
	  }
	  
	  @Test()
	  public void Antyki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Antyki\\image1.png");
			  screen.wait(diamond,40000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Antyki\\demo2.png");
			  screen.wait(demo,5000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Antyki\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern demo1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Antyki\\demo4.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Antyki\\auto5.png");
			  screen.wait(auto,5000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern demo2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Antyki\\demo6.png");
			  screen.wait(demo2,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Antyki\\home7.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void triplePlatinum() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Duszki\\image1.png");
			  screen.wait(diamond,5000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Duszki\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Duszki\\sound3.png");
			  screen.wait(volume,40000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Duszki\\ok4.png");
			  screen.wait(ok,40000);
			  screen.click(ok);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Duszki\\demo5.png");
			  screen.wait(demo1,40000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Duszki\\auto6.png");
			  screen.wait(auto,40000);
			  Thread.sleep(3000);
			  screen.click();
			  
			  Pattern demo2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Duszki\\demo7.png");
			  screen.wait(demo2,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Duszki\\home8.png");
			  screen.wait(home,40000);
			  screen.click(home);
	  }
	  @Test()
	  public void Duszki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\TriplePlatinum\\image1.png");
			  screen.wait(diamond,5000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\TriplePlatinum\\demo2.png");
			  screen.wait(demo,5000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\TriplePlatinum\\sound3.png");
			  screen.wait(volume,40000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\TriplePlatinum\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\TriplePlatinum\\demo5.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\TriplePlatinum\\auto6.png");
			  screen.wait(auto,40000);
			  Thread.sleep(3000);
			  screen.click();
			  
			  Pattern demo2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\TriplePlatinum\\demo7.png");
			  screen.wait(demo2,5000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\TriplePlatinum\\home8.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void Garniec() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\GarniecZłota\\image1.png");
			  screen.wait(diamond,5000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\GarniecZłota\\demo2.png");
			  screen.wait(demo,5000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\GarniecZłota\\sound3.png");
			  screen.wait(volume,40000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern start = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\GarniecZłota\\start3.png");
			  screen.wait(start,5000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\GarniecZłota\\demo4.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\GarniecZłota\\auto6.png");
			  screen.wait(auto,5000);
			  Thread.sleep(3000);
			  screen.click();
			  
			  Pattern demo2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\GarniecZłota\\demo7.png");
			  screen.wait(demo2,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\GarniecZłota\\home8.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void btyskothi() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\btyskothi\\image1.png");
			  screen.wait(diamond,5000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\btyskothi\\demo2.png");
			  screen.wait(demo,5000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\btyskothi\\sound3.png");
			  screen.wait(volume,40000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern start = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\btyskothi\\ok4.png");
			  screen.wait(start,40000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\btyskothi\\demo5.png");
			  screen.wait(demo1,40000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern demo2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\btyskothi\\demo7.png");
			  screen.wait(demo2,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\btyskothi\\home8.png");
			  screen.wait(home,40000);
			  screen.click(home);
	  }
	  @Test()
	  public void gorki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\gorki\\image1.png");
			  screen.wait(diamond,5000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\gorki\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\gorki\\sound3.png");
			  screen.wait(volume,100000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern start = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\gorki\\ok4.png");
			  screen.wait(start,5000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\gorki\\demo5.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\gorki\\option6.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern demo2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\gorki\\option7.png");
			  screen.wait(demo2,40000);
			  screen.click(demo2);
			  Thread.sleep(3000);
			  
			  Pattern auto1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\gorki\\auto8.png");
			  screen.wait(auto1,40000);
			  screen.click(auto1);
			  Thread.sleep(3000);
			  
			  Pattern tryagain = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\gorki\\tryagain9.png");
			  screen.wait(tryagain,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\gorki\\home10.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void emotki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\emotki\\image1.png");
			  screen.wait(diamond,5000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\emotki\\demo2.png");
			  screen.wait(demo,5000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\emotki\\sound3.png");
			  screen.wait(volume,100000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern start = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\emotki\\ok4.png");
			  screen.wait(start,5000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\emotki\\demo5.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern auto1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\emotki\\auto6.png");
			  screen.wait(auto1,5000);
			  screen.click(auto1);
			  Thread.sleep(3000);
			  
			  Pattern tryagain = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\emotki\\tryagain7.png");
			  screen.wait(tryagain,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\emotki\\home8.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void redPepperHot() throws InterruptedException, FindFailed {
			Thread.sleep(2000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,300)", "");
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\hotPepperPayout\\image1.png");
			  screen.wait(diamond,5000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  //JavascriptExecutor js1 = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,200)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\hotPepperPayout\\demo2.png");
			  screen.wait(demo,5000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\hotPepperPayout\\sound3.png");
			  screen.wait(volume,40000);
			  screen.click(volume);
			  
			  Pattern start = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\hotPepperPayout\\ok4.png");
			  screen.wait(start,40000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern demo1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\hotPepperPayout\\demo5.png");
			  screen.wait(demo1,40000);
			  screen.click(demo1);
			  Thread.sleep(5000);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\hotPepperPayout\\auto6.png");
			  screen.wait(auto,5000);
			  screen.click(auto);
			  Thread.sleep(5000);
			  
			  Pattern demo2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\hotPepperPayout\\demo7.png");
			  screen.wait(demo2,40000);
			  Thread.sleep(3000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\hotPepperPayout\\home8.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
