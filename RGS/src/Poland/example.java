package Poland;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class example {
	WebDriver driver;
  @BeforeTest
  public void f() throws FindFailed, InterruptedException {
	  System.setProperty("webdriver.edge.driver","C:\\BrowserDrivers\\msedgedriver.exe");
	  EdgeOptions edgeOptions = new EdgeOptions();
	  String addproxy1 = " http://hybrid-web.cluster-a.blackspider.com";
	  Proxy proxy1 = new Proxy();
	  proxy1.setHttpProxy(addproxy1);//http
	  proxy1.setSslProxy(addproxy1);//secure socket layer
	  edgeOptions.setCapability("proxy", proxy1);
	  driver = new EdgeDriver(edgeOptions);
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
}
