package com.uday.doubts;

import java.util.HashMap;
import java.util.Map;

class Person{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
}


public class PersonTest {

	public static void main(String[] args) {

		Person p1=new Person(1,"uday");
		System.out.println(p1.getId()+" "+p1.getName());
		Person p2=new Person(1, "uday");
		System.out.println(p2.getId()+" "+p2.getName());
		
		Map<Person, Integer> map=new HashMap<>();
		map.put(p1, 100);
		map.put(p2, 100);
		
		for(Map.Entry<Person, Integer> entry:map.entrySet()){
			System.out.println(entry.getKey().getId()+" "+entry.getValue());
		}
		
		
		
	}

}
