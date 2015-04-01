package day5.tarena.com;

public class Student{
    //特征：学号、姓名、年龄
	int id;
	String name;
	int age;
	public Student(){}//方便继承、反射等用途
	public Student(int id,String name,int age){
		this.id = id;//this. 代表本类属性、方法
		this.name = name;
		this.age = age;
	}//提供所有属性做参数，全参构造，用于创建一个有效对象
	//行为：学习、代码
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
