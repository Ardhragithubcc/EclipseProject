package basepkg;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Baseclass {
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		String src=driver.getPageSource();
		if(src.contains("login"))
		{
			System.out.println("pass");
			
		}	
		}
	@Test
	public void test()
	{
	String actualtitle=driver.getTitle();
	String exptitle="facebook";
	if(actualtitle.equals(exptitle))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
		
	}
	}
	@Test
	public void test1()
	{
		Actions act=new Actions(driver);
		WebElement Email=driver.findElement(By.id("email"));
		act.moveToElement(Email).perform();
	    driver.findElement(By.xpath("//*[@id=\"u_0_0_wp\"]")).click();
	}
	@Test
	public void radiobutton()
	{
		boolean radio=driver.findElement(By.xpath("//*[@id=\"u_2_4_FQ\"]")).isSelected();
		if(radio)

		{
			System.out.println("Selected");
			
		}
		else
		{
			System.out.println("not Selected");
		}
	}
	@AfterTest
	public void postCondition()
	{
		driver.quit();
	}

		

	}
		





