package day10.tarena.com;

import java.util.TreeSet;

public class Person implements Comparable<Person>{
	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<Person>();//ø…≈≈–Ú
		for(int i=1;i<9;i++){
			Person p = new Person(30,"zhang"+(9-i));
			ts.add(p);
			System.out.println("*********");
		}
		ts.add(new Person(28,"zhang1"));
		System.out.println(ts);
	}
	public int compareTo(Person p){
		//return age - p.age;
		System.out.println(name+" com "+p.name);
		return name.compareTo(p.name);
	}
	@Override
	public String toString(){
		return name+":"+age;
	}
    private int age;
    private String name;
	public Person(){
		super();
	}
	public Person(int age, String name) {
		super();
		this.setAge(age);
		this.setName(name);
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0&&age<130){
		    this.age = age;
		}else{
			System.out.println("ƒÍ¡‰¥ÌŒÛ");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}
