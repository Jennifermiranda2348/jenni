package PojoToCreateJavaObject;

public class PojoObjectArray {
	
	String ename;
	String eid;
	int[] ph;
	public PojoObjectArray(String ename, String eid, int[] ph) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.ph = ph;
	}
	
	public PojoObjectArray()
	{
		
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public int[] getPh() {
		return ph;
	}

	public void setPh(int[] ph) {
		this.ph = ph;
	}
	
	

}
