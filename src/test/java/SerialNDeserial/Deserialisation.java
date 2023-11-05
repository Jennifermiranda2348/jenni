package SerialNDeserial;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoToCreateJavaObject.PojoSerialNDeSerial;

public class Deserialisation {
	@Test
	public void empDeser() throws Throwable, Throwable, Throwable
	{
		ObjectMapper om= new ObjectMapper();
		PojoSerialNDeSerial psd = om.readValue(new File("./Jenni1.json"), PojoSerialNDeSerial.class);
		System.out.println(psd.getEname());
		System.out.println(psd.getPNo());
		System.out.println(psd.getAge());
		
	}
}
