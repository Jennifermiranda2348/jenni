package PojoToCreateJavaObject;

public class Spouse {
	
	String sname;
	int[] sPhone;
	int sAge;
	public Spouse(String sname, int[] sPhone, int sAge) {
		super();
		this.sname = sname;
		this.sPhone = sPhone;
		this.sAge = sAge;
	}
	
	public Spouse()
	{
		
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int[] getsPhone() {
		return sPhone;
	}

	public void setsPhone(int[] sPhone) {
		this.sPhone = sPhone;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	
}
