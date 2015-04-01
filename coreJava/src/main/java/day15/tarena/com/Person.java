package day15.tarena.com;

public class Person {
    private int age;
    private String name;
	public Person() {
		super();
		System.out.println("call 无参构造");
	}
	public Person(int age, String name) {
		super();
		System.out.println("call 有参构造");
		this.setAge(age);
		this.setName(name);
	}
	@Override
	public String toString(){
		return age + ":" + name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0 && age<130){
		    this.age = age;
		}else{
			System.out.println("age err");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
