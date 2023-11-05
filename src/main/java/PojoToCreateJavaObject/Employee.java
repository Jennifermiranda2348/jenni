package PojoToCreateJavaObject;

public class Employee {
	
	String ename;
	int[] phone;
	int age;
	Spouse spouse;
	public Employee(String ename, int[] phone, int age, Spouse spouse) {
		super();
		this.ename = ename;
		this.phone = phone;
		this.age = age;
		this.spouse = spouse;
	}
	
	public Employee()
	{
		
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int[] getPhone() {
		return phone;
	}

	public void setPhone(int[] phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Spouse getSpouse() {
		return spouse;
	}

	public void setSpouse(Spouse spouse) {
		this.spouse = spouse;
	}
	
	
	
}
