package Poland;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class allGames {
	public static WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void beforeTest(String browser) throws InterruptedException{
		switch(browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			ChromeOptions chromeOptions = new ChromeOptions();
			String addproxy = "http://hybrid-web.cluster-a.blackspider.com";
			Proxy proxy = new Proxy();
			proxy.setHttpProxy(addproxy);//http
			proxy.setSslProxy(addproxy);//secure socket layer
			chromeOptions.setCapability("proxy", proxy);
			driver = new ChromeDriver(chromeOptions);
		case "ie":
			System.setProperty("webdriver.ie.driver", "C:\\BrowserDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\BrowserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;
		}
		  	driver.manage().window().maximize();	
		   driver.get("https://staging.devlotto.pl/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[3]/div[2]/div[3]/div/button")).click();
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/div/div[2]/button")).click();
			//entering uid
			driver.findElement(By.xpath("//*[@id=\"username-dropdown-login\"]")).sendKeys("wat003");
			//entering password
			driver.findElement(By.xpath("//*[@id=\"password-dropdown-login\"]")).sendKeys("Welcome1");
			System.out.println("login button");
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[3]/div[1]/div/div[2]/div[2]/div/div/div[1]/form/div[3]/div[1]/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[4]/div/div[1]/div/div/div[2]/div[2]/button")).click();
		}
		@org.testng.annotations.AfterMethod
		public void Aftermethod() {
			driver.quit();

		}
	
  @Test(priority=1)
  public void game1() throws FindFailed, InterruptedException {
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
	  
	  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\diamond\\auto6.png");
	  screen.wait(auto,40000);
	  screen.click(auto);
	  Thread.sleep(5000);
	  
	  Pattern tryAgain = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\diamond\\tryagain(6.5).png");
	  screen.wait(tryAgain,40000);
	  Thread.sleep(10000);
	  
	  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\diamond\\home7.png");
	  screen.wait(home,40000);
	  screen.click(home);
}
  @Test(priority=2)
  public void game2() throws FindFailed, InterruptedException {
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
	  
	  Pattern volume = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Egypt\\sound3");
	  screen.wait(volume,40000);
	  screen.click(volume);
	  
	  Pattern ok = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Egypt\\ok4");
	  screen.wait(ok,40000);
	  screen.click(ok);
	  
	  Pattern demo1 = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Egypt\\demo5");
	  screen.wait(demo1,40000);
	  screen.click(demo1);
	  
	  Pattern auto = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Egypt\\auto6");
	  screen.wait(auto,40000);
	  screen.click(auto);
	  Thread.sleep(5000);
	  
	  Pattern tryAgain = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Egypt\\demo7");
	  screen.wait(tryAgain,40000);
	  Thread.sleep(10000);
	  
	  Pattern home = new Pattern("C:\\Users\\pdf57170\\Desktop\\sekuliImages\\PolandGames\\Egypt\\home8");
	  screen.wait(home,40000);
	  screen.click(home);
}
  
  }

