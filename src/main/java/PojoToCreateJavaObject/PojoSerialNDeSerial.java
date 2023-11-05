package PojoToCreateJavaObject;

public class PojoSerialNDeSerial {
	
	//Step 1: Declare the variables globally
		
		private String ename;
		private int PNo;
		private int age;
		
		//Step 2: Create constructor to initialize the variables
		
		public PojoSerialNDeSerial(String ename, int pNo, int age) {
			super();
			this.ename = ename;
			this.PNo = pNo;
			this.age = age;
		}
		
		//Step 3: Create empty constructor
		
		public PojoSerialNDeSerial()
		{
			
		}

		//Step 4: Provide getters and setters
		
		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public int getPNo() {
			return PNo;
		}

		public void setPNo(int pNo) {
			PNo = pNo;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		
		
		
	
}
