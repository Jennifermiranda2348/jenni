package SerialNDeserial;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoToCreateJavaObject.PojoObjectArray;
import PojoToCreateJavaObject.PojoSerialNDeSerial;

public class DeserializeObjectArray {
	
	@Test
	public void empDeser() throws Throwable, Throwable, Throwable
	{

		ObjectMapper om= new ObjectMapper();
		PojoObjectArray psd = om.readValue(new File("./Jenni2.json"), PojoObjectArray.class);
		System.out.println(psd.getEname());
		System.out.println(psd.getEid());
		System.out.println(psd.getPh()[0]);
		System.out.println(psd.getPh()[1]);
		
	}
}


