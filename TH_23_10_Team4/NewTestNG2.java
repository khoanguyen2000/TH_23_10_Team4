package TH_23_10_Team4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TH_23_10_Team4.TestListener.class)

public class NewTestNG2 {
	public static String baseUrl= "http://demo.guru99.com/test/newtours/index.php";
	public static String driverPart = ".\\driver\\chromedriver.exe";
	public static WebDriver driver;
	public static String expected = null;
	public static String actual = null;
	@BeforeTest
	public void lauchBrower() {
		System.out.println("launching Chrome brower");
		System.setProperty("webdriver.chorme.driver", driverPart);
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	@Test(priority = 0)
	public void VerifyRegister() {
	    WebElement w = driver.findElement(By.xpath("//*[@style= 'margin-left:20px;']/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
	    w.click();

	    List<WebElement> childElements = driver.findElements(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input"));
	    for(int i = 0; i<childElements.size();i++) {
	    	childElements.get(0).sendKeys("Khoa");
	        childElements.get(1).sendKeys("Nguyen");
	        childElements.get(2).sendKeys("9191019201");
	        childElements.get(3).sendKeys("Khoanguyen1900@gmail.com");

	        childElements.get(4).sendKeys("Pham Van Dong");
	        childElements.get(5).sendKeys("Thu Duc");
	        childElements.get(6).sendKeys("Phuong 10");
	        childElements.get(7).sendKeys("238920");

	        childElements.get(8).sendKeys("khoa123");
	        childElements.get(9).sendKeys("khoa321");
	        childElements.get(10).sendKeys("khoa321");
	        break;
	    }

	    WebElement submit = driver.findElement(By.xpath("//*[@name='submit']"));
	    submit.click();

	    System.out.print("Successfully");
	    }
	@Test(priority = 1)
	public void VerifyLogin() {
		WebElement login = driver.findElement(By.xpath("//*[@face='Arial, Helvetica, sans-serif']/a"));
        login.click();
        List<WebElement> childElements1 = driver.findElements(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']/input"));
        for(int i = 0; i<childElements1.size();i++) {
            childElements1.get(0).sendKeys("khoa123");
            childElements1.get(1).sendKeys("khoa321");
            break;
        }

        WebElement submitlogin = driver.findElement(By.xpath("//*[@name='submit']"));
        submitlogin.click();
	}
	
}