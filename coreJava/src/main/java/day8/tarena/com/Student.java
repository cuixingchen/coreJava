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
	public boolean equals(Object obj){//比类型、比id
		if(obj == null) return false;
		else if(obj instanceof Student){
			Student s = (Student)obj;
			return s.id == this.id;
			//return s.name.equals(name);
		}
		return false;
	}
	public int hashCode(){//按id和类型 生成
		int type = 41;//用一个素数代表一种类型
		return type * 97 + id;//只是一种算法，可以随便写
		//return type * 97 + name.hashCode();
	}
	public String toString(){
		return "学生："+name+"，学号："+id;
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
