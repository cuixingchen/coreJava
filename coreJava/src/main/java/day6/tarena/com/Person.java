package day6.tarena.com;

public class Person {
    private String name;
    private int age;
    public Person(){
    	this("zhangfei",25);
    	//new Person("zhangfei",25);
    	//this.setName("zhangfei");
    	//this.setAge(25);
    }
    public Person(String name,int age){
    	this.setName(name);
    	setAge(age);//���븴�ã�ֻдһ�Σ������ط�����
    }
    public static void main(String[] args){
    	Person p1 = new Person();
    	Person p2 = new Person("li",30);
    	System.out.println(p1.getAge());
    	//p1.setAge(30);
    	//p2.setAge(40);
    }
    public String getMessage(){
    	String s = "ĳ�ˣ�������"+name+",���䣺"+age;
    	return s;
    }
    public String getName(){
    	return name;
    }
    public void setName(String name){
    	this.name = name;
    }
    public int getAge(){
    	return age;
    }
    public void setAge(int age){
    	if(age>0&&age<130){
    		this.age = age;
    	}else{
    		System.out.println("����Ƿ���");
    	}
    }   
}
