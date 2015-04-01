package day8.tarena.com.cr;

public class Student extends Person {
    private int id;

	public Student() {
		super();
	}

	public Student(String name, int age, int id) {
		super(name, age);
		this.setId(id);
	}
    @Override
	public void setAge(int age) {
		if(age>6&&age<60){
		    super.setAge(age);
		}else{
			System.out.println("ÄêÁä´íÎó");
		}
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
