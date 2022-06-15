package Poland;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class proxy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\BrowserDrivers\\geckodriver.exe");
		String addproxy = "http://hybrid-web.cluster-a.blackspider.com";
		Proxy proxy = new Proxy();
		//Adding the desired host and port for the http, ssl, and ftp Proxy Servers respectively
		proxy.setHttpProxy("<addproxy:8080>");
		proxy.setSslProxy("<addproxy:8080>");
		proxy.setSslProxy("<addproxy:8080>");
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("proxy", proxy);
		//Calling new Firefox profile for test
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://staging.devlotto.pl/");
	}

}
