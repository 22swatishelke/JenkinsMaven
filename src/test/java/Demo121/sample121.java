package Demo121;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample121
{
	@Test
public void test1() throws InterruptedException
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://github.com/");
	Thread.sleep(3000);
	}
}
