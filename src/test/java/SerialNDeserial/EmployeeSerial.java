package SerialNDeserial;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoToCreateJavaObject.Employee;
import PojoToCreateJavaObject.Spouse;

public class EmployeeSerial {
	
	@Test 
	public void employee() throws Throwable, Throwable, Throwable
	{
		int[] sPhone = {78954,48561};
		Spouse sp = new Spouse("Marsh", sPhone, 32);
		int[] phone = {48965,75231};
		
		ObjectMapper om = new ObjectMapper();
		Employee emp = new Employee("Jonna",phone,28,sp);
		
		om.writerWithDefaultPrettyPrinter()
		.writeValue(new File("./Jenni3.json"),emp);
	}

}
