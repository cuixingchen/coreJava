package day5.tarena.com;

public class Student2 {
	int id;
	private String name;//û�������жϵ�Ҳ��Ҫ��װ
	private int age = 20;//�����ڲ����ã��ⲿ������
	public Student2(){}
	public Student2(int id,String name,int age){
		this.id = id;//this. ���������ԡ�����
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
			System.out.println("�����д���");
		}
	}
	public void study(String lesson){
		System.out.println("ÿ��9��뿪ʼ");
		System.out.println("ѧϰ��"+lesson);
		System.out.println("17�����");
	}
	public String coding(String lang){
		String s = lang + "����";
		return s;
	} 
}
