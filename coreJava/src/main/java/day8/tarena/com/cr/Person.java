package day8.tarena.com.cr;

public abstract class Person {
    private String name;
    private int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.setName(name);
		this.setAge(age);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0&&age<130){
		    this.age = age;
		}else{
			System.out.println("ÄêÁä´íÎó");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
