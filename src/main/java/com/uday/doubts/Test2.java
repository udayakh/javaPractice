package com.uday.doubts;

class Super {
	protected void method() {
		System.out.println("super");
	}
}

class Sub extends Super {
	public final void method() {
		System.out.println("sub");
	}
}

class Student1 {
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

	public Student1(int id, String name) {
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
		Student1 other = (Student1) obj;
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

public class Test2 {
	public static void main(String[] args) {
		Student1 st1 = new Student1(100, "uday");
		Student1 st2 = new Student1(100, "uday");

		if (st1.equals(st2) && (st1.hashCode() == st2.hashCode())) {
			System.out.println("equals");
		} else {
			System.out.println("not equals");
		}

		Super s = new Sub();
		s.method();
		
		System.out.println(22/013);
		System.out.println(013);

	}

}
