package day8.tarena.com.cr;

public class Teacher extends Person {
    private double sal;

	public Teacher() {
		super();
	}

	public Teacher(String name, int age, double sal) {
		super(name, age);
		this.setSal(sal);
	}
	@Override
	public void setAge(int age) {
		if(age>18&&age<60){
		    super.setAge(age);
		}else{
			System.out.println("�������");
		}
	}
	public double getSal() {
		return sal;
	}
    
	public void setSal(double sal) {
		if(sal>970){
		    this.sal = sal;
		}else{
			System.out.println("���ʴ���");
		}
	}
}
