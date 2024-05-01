package model;

public class Student {

	private int roll;
	private String name;
	private String address;
	
	
	public Student(int roll) {
		super();
		this.roll = roll;
		System.out.println("1 para roll Const ");
	}
	
	public Student(String name) {
		super();
		this.name = name;
		System.out.println("1 para name Const ");
	}
	
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
		System.out.println("2 para Const ");
	}
	
	public Student(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		System.out.println("3 para Const ");
	}


	public Student() {
		super();
		System.out.println("Def Const");
	}




	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
}
