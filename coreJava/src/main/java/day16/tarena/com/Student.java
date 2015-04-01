package day16.tarena.com;

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
	@Override
	public boolean equals(Object obj){
		if(obj == null) return false;
		else if(obj.getClass() == this.getClass()){
			Student s = (Student)obj;
			return s.id == this.id;
		}
		return false;
	}
	@Override
	public int hashCode(){
		int type = this.getClass().hashCode();
		return type * 47 + id;
	}
	@Override
	public String toString(){
		return id+":"+name;
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
