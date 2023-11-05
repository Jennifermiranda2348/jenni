package PojoToCreateJavaObject;

public class PojoClassReqres {
	
	//Step 1: Declare the variables globally
	
	String name, job;

	//Step 2: Create constructor to initialize the variables
	
	public PojoClassReqres(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}

	//Step 3: Provide getters and setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
}	