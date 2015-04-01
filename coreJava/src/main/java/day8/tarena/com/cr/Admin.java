package day8.tarena.com.cr;

public class Admin extends Person {
	private double sal;

	public Admin() {
		super();
	}

	public Admin(String name, int age, double sal) {
		super(name, age);
		this.setSal(sal);
	}
	@Override
	public void setAge(int age) {
		if(age>18&&age<60){
		    super.setAge(age);
		}else{
			System.out.println("ÄêÁä´íÎó");
		}
	}
	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		if(sal>970){
		    this.sal = sal;
		}else{
			System.out.println("¹¤×Ê´íÎó");
		}
	}
}
