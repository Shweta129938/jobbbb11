package ssss;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class aa {
	@Test
	public void main(){
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.redbus.in/");
	}

}
