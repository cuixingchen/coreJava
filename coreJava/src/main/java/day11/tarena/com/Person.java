package day11.tarena.com;

public class Person {
	private int age;
	public Person() {
		super();
	}
	public Person(int age) throws AgeException{
		super();
		this.setAge(age);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws AgeException{
		if(age > 0&& age<130){
		    this.age = age;
		}else{
			throw new AgeException("年龄不合法");
		}
	}
	public static void main(String[] args) {
		try{
		    Person p = new Person(-20);
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}

}
