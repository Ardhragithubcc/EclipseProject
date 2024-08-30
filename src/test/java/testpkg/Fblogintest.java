package testpkg;
import basepkg.Baseclass;

import org.testng.annotations.Test;
import pagepkg.Fbloginpage;
import utilities.Excelutils;



public class Fblogintest extends Baseclass
{
	
@Test
public void verifyLoginWithValidCred() throws Exception
{
	Fbloginpage p1=new Fbloginpage(driver);
	
	String x1="C:\\Users\\Balukrishna\\Desktop\\Book1.xslx";
	String Sheet="Sheet1";
	int rowCount=Excelutils.getRowCount(x1,Sheet);
	for(int i=1;i<=rowCount;i++)
	{
	String UserName=Excelutils.getCellvalue(x1,Sheet,i,0);
	System.out.println("username---"+UserName);
	String Pwd=Excelutils.getCellvalue(x1,Sheet,i,1);
	System.out.println("password---"+Pwd);
	p1.setvalues(UserName, Pwd);
	p1.clickloginbtn();
	String expectedurl="https://www.facebook.com";
	String actualurl=driver.getCurrentUrl();
	if(actualurl.equals(expectedurl))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	}
}
}