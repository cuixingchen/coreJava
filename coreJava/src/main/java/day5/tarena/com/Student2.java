package day5.tarena.com;

public class Student2 {
	int id;
	private String name;//没有条件判断的也需要封装
	private int age = 20;//本类内部可用，外部不可以
	public Student2(){}
	public Student2(int id,String name,int age){
		this.id = id;//this. 代表本类属性、方法
		this.name = name;
		//this.age = age;
		this.setAge(age);
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		if(age>6 && age<60){
		    this.age = age;
		}else{
			System.out.println("年龄有错误");
		}
	}
	public void study(String lesson){
		System.out.println("每天9点半开始");
		System.out.println("学习了"+lesson);
		System.out.println("17点结束");
	}
	public String coding(String lang){
		String s = lang + "开发";
		return s;
	} 
}
