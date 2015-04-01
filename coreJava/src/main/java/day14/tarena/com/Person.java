package day14.tarena.com;

public class Person implements java.io.Serializable{
    private String name;
    private int age;
    private transient String sex;
    static Object obj ;//没有实现Serializable
	public Person() {
		super();
	}
	public Person(String name, int age, String sex,Object obj) {
		super();
		this.setName(name);
		this.setAge(age);
		this.setSex(sex);
		this.obj = obj;
	}
	@Override
	public String toString(){
		return name+":"+age+":"+sex+":"+obj;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0&&age<130){
		    this.age = age;
		}else{
			System.out.println("age err!");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
