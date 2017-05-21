package com.uday.ocjp1;

import java.util.HashMap;
import java.util.Map;

class Emp{
	private int eid;
	private String ename;
	
	Object method(){
		return new Emp();
	}
	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (eid != other.eid)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		return true;
	}
	
	
}

class Emp1 extends Emp{
	
	
	String method() throws NullPointerException{
		return null;
	}
}
public class U7 {

	public static void main(String[] args) {

		Map<Emp,Integer> map=new HashMap<>();
		map.put(new Emp(100, "uday"),100);
		map.put(new Emp(100, "uday"),1000);
		map.put(new Emp(200,"kumar"),200);
		map.put(new Emp(300,"reddy"),300);
		
		for(Map.Entry<Emp,Integer> entry:map.entrySet()){
			System.out.println(" Emp: "+entry.getKey().getEid()+" "+entry.getKey().getEname()+" value:"+entry.getValue());
		}
		
		
		
	}

}
