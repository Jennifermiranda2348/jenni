package Generic_Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;


public class DatabaseLibrary {

	Connection con;
	
	/**
	 * This method is used to connect with mysql db
	 * @throws Throwable 
	 */
	
	public void connectToDB() throws Throwable 
	{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(IPathConstants.dbURL, IPathConstants.dbUserName, IPathConstants.dbPassword);
	}
	
	/*
	 * This method is used to close db
	 * @throws Throwable 
	 */
	public void closeDB() throws Throwable
	{
		con.close();
	}
	
	/*
	 * This method will execute the query and return the value only if the validate is successful
	 */
	public String readDataFromDBAndValidate(String query, int columnIndex,String expData) throws Throwable
	{
		boolean flag = false;
		ResultSet result = con.createStatement().executeQuery(query);
		while(result.next())
		{
			if(result.getString(columnIndex).equalsIgnoreCase(expData))
			{
				flag = true;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("Verified");
			return expData;
		}
		else
		{
			System.out.println("Data not verified");
			return "";
		}
		
		
	}
	
}
