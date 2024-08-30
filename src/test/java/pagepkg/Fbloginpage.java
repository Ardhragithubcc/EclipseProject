package pagepkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {
	WebDriver driver;
@FindBy(name="login")
WebElement fblogin;
@FindBy(id="email")
WebElement fbemail;
@FindBy(id="pass")
WebElement fbpassword;

public Fbloginpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
public void clickloginbtn()
{
	fblogin.click();
}
public void setvalues(String UN,String PWD)
{
	fbemail.sendKeys(UN);
	fbpassword.sendKeys(PWD);

}
}


