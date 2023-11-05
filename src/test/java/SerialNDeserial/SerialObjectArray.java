package SerialNDeserial;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoToCreateJavaObject.PojoObjectArray;

public class SerialObjectArray {
	
	@Test
	public void empser() throws Throwable, Throwable, Throwable
	{
		int[] ph = {12345678, 87456321};
		ObjectMapper om= new ObjectMapper();
		PojoObjectArray poa = new PojoObjectArray("Jenni","TY-123", ph);
		
		om.writerWithDefaultPrettyPrinter()
		.writeValue(new File("./Jenni2.json"),poa);
		
	}

}
