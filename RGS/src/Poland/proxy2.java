package Poland;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class proxy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\BrowserDrivers\\geckodriver.exe");
		String addproxy = "http://hybrid-web.cluster-a.blackspider.com";
		String PROXY = "addproxy:8080";

		org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();

		proxy.setHttpProxy(PROXY).setSslProxy(PROXY);

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(CapabilityType.PROXY, proxy); 

		@SuppressWarnings("deprecation")
		WebDriver driver = new FirefoxDriver(cap);
		driver.get("https://staging.devlotto.pl/");
	}

}
