package day5.tarena.com;

public class Student{
    //������ѧ�š�����������
	int id;
	String name;
	int age;
	public Student(){}//����̳С��������;
	public Student(int id,String name,int age){
		this.id = id;//this. ���������ԡ�����
		this.name = name;
		this.age = age;
	}//�ṩ����������������ȫ�ι��죬���ڴ���һ����Ч����
	//��Ϊ��ѧϰ������
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
