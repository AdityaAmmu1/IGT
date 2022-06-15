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

public class buyGames {
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
			proxy.setHttpProxy(addproxy);//https
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
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/div/div[2]/button")).click();
			//entering uid
			driver.findElement(By.xpath("//*[@id=\"username-dropdown-login\"]")).sendKeys("gierka001");
			//entering password
			driver.findElement(By.xpath("//*[@id=\"password-dropdown-login\"]")).sendKeys("Welcome1");
			System.out.println("login button");
			Screen screen1 = new Screen();
			Pattern submit = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\submit.png");
			  screen1.wait(submit,40000); 
			  screen1.click(submit);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[4]/div/div[1]/div/div/div[2]/div[2]/button")).click();
		
		}
	  @Test()
	  public void Diamond() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\diamond\\image1.png");
			  screen.wait(diamond,40000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,500)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\diamond\\demo2.png");
			  screen.wait(demo,5000); 
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\diamond\\volume3.png");
			  screen.wait(volume,40000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\diamond\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern switch8 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\diamond\\switch8.png");
			  screen.wait(switch8,5000);
			  screen.click(switch8);
			  
			  Pattern realPlay = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\diamond\\realPlay6.png");
			  screen.wait(realPlay,40000);
			  screen.click(realPlay);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\diamond\\auto7.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  Thread.sleep(10000);
			  
			  Pattern realPlay1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\diamond\\realPlay7.png");
			  screen.wait(realPlay1,40000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\diamond\\home8.png");
			  screen.wait(home,40000);
			  screen.click(home);
	  }
	  @Test()
	  public void Egypt() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\image1.png");
			  screen.wait(diamond,40000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok1);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\place7.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\auto8.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  Thread.sleep(3000);
			  
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\place9.png");
			  screen.wait(play2,5000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Egypt\\home10.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	
	 @Test()
	  public void goldRush() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\image1.png");
			  screen.wait(diamond,40000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\demo2.png");
			  screen.wait(demo,40000); 
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern demo1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\switch5.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(7000);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\place7.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  
			  Pattern auto3 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\auto8.png");
			  screen.wait(auto3,5000);
			  screen.click(auto3);
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\place9.png");
			  screen.wait(play2,5000);
			  Thread.sleep(15000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\goldRush\\home8.png");
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
			  screen.wait(diamond,40000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\5card\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\5card\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\5card\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern demo1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\5card\\switch5.png");
			  screen.wait(demo1,5000);
			  screen.click(demo1);
			  Thread.sleep(7000);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\5card\\ok4.png");
			  screen.wait(ok1,5000);
			  screen.click(ok1);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\5card\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\5card\\place7.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  
			  Pattern auto3 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\5card\\auto8.png");
			  screen.wait(auto3,5000);
			  screen.click(auto3);
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\5card\\place9.png");
			  screen.wait(play2,5000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\5card\\home10.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void ChristmasBalls() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\image1.png");
			  screen.wait(diamond,40000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\place7.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  Thread.sleep(3000);
			  
			  Pattern auto3 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\auto8.png");
			  screen.wait(auto3,5000);
			  screen.click(auto3);
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\place9.png");
			  screen.wait(play2,5000);
			  
			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Christmas balls\\home10.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  
	  @Test()
	  public void Cyferki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\image1.png");
			  screen.wait(diamond,40000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\ok4.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\ok4.png");
			  screen.wait(ok1,5000);
			  screen.click(ok1);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\place7.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  Thread.sleep(3000);
			  
			  Pattern play1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\place8.png");
			  screen.wait(play1,40000);
			  screen.click(play1);
			  Thread.sleep(3000);
			  
			  Pattern start = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\start9.png");
			  screen.wait(start,40000);
			  screen.click(start);
			  Thread.sleep(3000);
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\place10.png");
			  screen.wait(play2,5000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Cyferki\\home11.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void Antyki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Antyki\\image1.png");
			  screen.wait(diamond,40000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Antyki\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Antyki\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Antyki\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Antyki\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Antyki\\place8.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Antyki\\auto9.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  Thread.sleep(3000);
			  
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Antyki\\place10.png");
			  screen.wait(play2,5000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Antyki\\home11.png");
			  screen.wait(home,5000);
			  screen.click(home);
	  }
	  @Test()
	  public void triplePlatinum() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\image1.png");
			  screen.wait(diamond,40000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\ok4.png");
			  screen.wait(ok1,5000);
			  Thread.sleep(2000);
			  screen.click(ok1);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\play7.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\auto8.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  Thread.sleep(3000);
			  
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\play9.png");
			  screen.wait(play2,5000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\TriplePlatinum\\home10.png");
			  screen.wait(home,5000);
			  screen.click(home);
			  }
	  @Test()
	  public void Duszki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\image1.png");
			  screen.wait(diamond,40000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\ok4.png");
			  screen.wait(ok1,5000);
			  Thread.sleep(2000);
			  screen.click(ok1);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\place7.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\auto8.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  		  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\place9.png");
			  screen.wait(play2,5000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\Duszki\\home10.png");
			  screen.wait(home,5000);
			  screen.click(home);
			  }
	  @Test()
	  public void Garniec() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZłota\\image1.png");
			  screen.wait(diamond,40000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZłota\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZłota\\sound3.png");
			  screen.wait(volume,5000);
			  Thread.sleep(2000);
			  screen.click(volume);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZłota\\start4.png");
			  screen.wait(ok1,5000);
			  Thread.sleep(2000);
			  screen.click(ok1);
			  
			  Pattern setting = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZłota\\setting5.png");
			  screen.wait(setting,40000);
			  screen.click(setting);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZłota\\switch6.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZłota\\reduce7.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZłota\\place8.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  Thread.sleep(3000);
			  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZłota\\auto9.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  		  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZłota\\place10.png");
			  screen.wait(play2,5000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\GarniecZłota\\home11.png");
			  screen.wait(home,5000);
			  screen.click(home);
			  }
	  @Test()
	  public void btyskothi() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\image1.png");
			  screen.wait(diamond,40000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\sound3.png");
			  screen.wait(volume,5000);
			  screen.click(volume);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\ok4.png");
			  screen.wait(ok1,5000);
			  Thread.sleep(2000);
			  screen.click(ok1);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern ok2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\ok4.png");
			  screen.wait(ok2,5000);
			  screen.click(ok2);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\place7.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  Thread.sleep(3000);
			  		  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\place8.png");
			  screen.wait(play2,5000);
			  Thread.sleep(15000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\btyskothi\\home9.png");
			  screen.wait(home,5000);
			  screen.click(home);
			  }
	  @Test()
	  public void hotPepperPayout() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,200)", "");
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\image1.png");
			  screen.wait(diamond,40000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\sound3.png");
			  screen.wait(volume,5000);
			  screen.click(volume);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\ok4.png");
			  screen.wait(ok1,5000);
			  Thread.sleep(2000);
			  screen.click(ok1);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\place7.png");
			  screen.wait(play,40000);
			  screen.click(play);
			  Thread.sleep(3000);
			  		  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\auto8.png");
			  screen.wait(auto,5000);
			  screen.click(auto);
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\place9.png");
			  screen.wait(play2,5000);
			  Thread.sleep(15000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\hotPepperPayout\\home10.png");
			  screen.wait(home,5000);
			  screen.click(home);
			  }

	  @Test()
	  public void gorki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,200)", "");
			  Thread.sleep(2000);
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\image1.png");
			  screen.wait(diamond,40000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\sound3.png");
			  screen.wait(volume,5000);
			  screen.click(volume);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\ok4.png");
			  screen.wait(ok1,5000);
			  Thread.sleep(2000);
			  screen.click(ok1);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\place7.png");
			  screen.wait(play,5000);
			  screen.click(play);
			  
			  Pattern option = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\option8.png");
			  screen.wait(option,5000);
			  screen.click(option);
			  
			  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\ok9.png");
			  screen.wait(ok,5000);
			  screen.click(ok);
			  		  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\auto10.png");
			  screen.wait(auto,5000);
			  screen.click(auto);
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\place11.png");
			  screen.wait(play2,5000);
			  Thread.sleep(3000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\gorki\\home12.png");
			  screen.wait(home,5000);
			  screen.click(home);
			  }
	  @Test()
	  public void emotki() throws InterruptedException, FindFailed {
			Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			  Thread.sleep(5000);
			  
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  js.executeScript("window.scrollBy(0,200)", "");
			  Thread.sleep(2000);
			  
			  Screen screen = new Screen();
			  Pattern diamond = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\image1.png");
			  screen.wait(diamond,40000);
			  screen.click(diamond);
			  
			  Thread.sleep(10000);
			  js.executeScript("window.scrollBy(0,600)", "");
			  
			  Pattern demo = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\demo2.png");
			  screen.wait(demo,40000);
			  screen.click(demo);
			  
			  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\sound3.png");
			  screen.wait(volume,5000);
			  screen.click(volume);
			  
			  Pattern ok1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\ok4.png");
			  screen.wait(ok1,5000);
			  Thread.sleep(2000);
			  screen.click(ok1);
			  
			  Pattern switch1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\switch5.png");
			  screen.wait(switch1,5000);
			  screen.click(switch1);
			  Thread.sleep(3000);
			  
			  Pattern reduce = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\reduce6.png");
			  screen.wait(reduce,5000);
			  screen.click(reduce);
			  Thread.sleep(3000);
			  
			  Pattern play = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\place7.png");
			  screen.wait(play,5000);
			  screen.click(play);
			  		  
			  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\auto8.png");
			  screen.wait(auto,40000);
			  screen.click(auto);
			  
			  Pattern play2 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\place9.png");
			  screen.wait(play2,5000);
			  Thread.sleep(3000);

			  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\zbuyGmaes\\emotki\\home10.png");
			  screen.wait(home,5000);
			  screen.click(home);
			  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
