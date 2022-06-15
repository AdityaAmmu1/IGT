package Georgia;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;

public class Example {
	public static WebDriver driver;
  @Test
  public void f() throws InterruptedException, FindFailed {
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
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.edge.driver","C:\\BrowserDrivers\\msedgedriver.exe");
	  driver = new EdgeDriver();
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

  @AfterMethod
  public void afterMethod() {
	  //driver.close();
  }

}
