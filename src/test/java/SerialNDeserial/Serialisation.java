package SerialNDeserial;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoToCreateJavaObject.PojoSerialNDeSerial;


public class Serialisation {
	
	@Test
	public void empser() throws Throwable, Throwable, Throwable
	{
		ObjectMapper om= new ObjectMapper();
		PojoSerialNDeSerial psd = new PojoSerialNDeSerial("Jovina", 80739430, 12);
		
		om.writerWithDefaultPrettyPrinter()
		.writeValue(new File("./Jenni1.json"),psd);
		
	}
	
	
	

}
