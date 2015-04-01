package day8.tarena.com;

public class Student {
    private int id;
    private String name;
	public Student() {
		super();
	}
	public Student(int id, String name) {
		super();
		this.setId(id);
		this.setName(name);
	}
	public boolean equals(Object obj){//�����͡���id
		if(obj == null) return false;
		else if(obj instanceof Student){
			Student s = (Student)obj;
			return s.id == this.id;
			//return s.name.equals(name);
		}
		return false;
	}
	public int hashCode(){//��id������ ����
		int type = 41;//��һ����������һ������
		return type * 97 + id;//ֻ��һ���㷨���������д
		//return type * 97 + name.hashCode();
	}
	public String toString(){
		return "ѧ����"+name+"��ѧ�ţ�"+id;
	}
	public static void main(String[] args) {
		Student st1 = new Student(1,"zhang");
		Student st2 = new Student(1,"zhang");
		System.out.println(st1 == st2);//f
		System.out.println(st1.equals(st2));//t
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st1.toString());
		System.out.println(st1);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
