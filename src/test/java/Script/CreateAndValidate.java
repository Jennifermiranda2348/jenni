package Script;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import Generic_Utility.DatabaseLibrary;
import Generic_Utility.EndPointsLibrary;
import Generic_Utility.IPathConstants;
import Generic_Utility.Java_Utility;
import static io.restassured.RestAssured.*;

public class CreateAndValidate {
	
	Java_Utility jLib = new Java_Utility();
	String Proj_Name = "TY_API" +jLib.getRandomNumber();
	String CreatedBy = "Jennifer";
	
	@Test
	public void createProject() throws Throwable
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://rmgtestingserver:8084/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Login to application
		
		driver.findElement(By.xpath("//input[@id='usernmae']")).sendKeys(IPathConstants.appUserName);
		driver.findElement(By.id("inputPassword")).sendKeys(IPathConstants.apppassword);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		//Create Project
		
		driver.findElement(By.linkText("Projects")).click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(Proj_Name);
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys(CreatedBy);
		
		WebElement ele = driver.findElement(By.xpath("(//select[@name='status'])[2]"));
		Select sel = new Select(ele);
		sel.selectByVisibleText("Completed");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Get project ID
		
		String pid = driver.findElement(By.xpath("(//td[text()='"+ Proj_Name +"']/ancestor::tr/td)[1]")).getText();
		System.out.println(pid);
		
		//Get Project using API
		
		when().get(EndPointsLibrary.getSingleProject +pid).then().log().all();
		
		//Verification for project in Database
		
		String query = "select * from project;";
		Driver driver1 = new Driver();
		DriverManager.registerDriver(driver1);
		Connection con = DriverManager.getConnection(IPathConstants.dbURL, IPathConstants.dbUserName, IPathConstants.dbPassword);
		Statement state = con.createStatement();
		
		ResultSet result = state.executeQuery(query);
		boolean flag = false;
		while(result.next())
		{
			if(pid.equals(result.getString(1)))
			{
				flag = true;
				break;
			}
		}
		
		if(flag==true)
		{
			System.out.println("Data is Verified");
			
		}
		else
		{
			System.out.println("Data not verified");
			
		}
		
				driver.quit();
	}
	
}
