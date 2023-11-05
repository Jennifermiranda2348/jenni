package SerialNDeserial;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoToCreateJavaObject.Employee;

public class EmployeeDeserial {
	
	@Test
	public void employee() throws Throwable, Throwable, Throwable
	{
		ObjectMapper om = new ObjectMapper();
		Employee emp = om.readValue(new File("./Jenni3.json"), Employee.class);
		
		System.out.println(emp.getEname());
		System.out.println(emp.getPhone()[0]);
		System.out.println(emp.getPhone()[1]);
		System.out.println(emp.getAge());
		
		System.out.println(emp.getSpouse().getSname());
		System.out.println(emp.getSpouse().getsPhone()[0]);
		System.out.println(emp.getSpouse().getsPhone()[1]);
		System.out.println(emp.getSpouse().getsAge());
		
		
	}

}
