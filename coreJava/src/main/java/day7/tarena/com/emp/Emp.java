package day7.tarena.com.emp;
//编号、姓名、年龄、工资
public abstract class Emp{
    private String id;
    private String name;
    private int age;
    private double sal;
	protected Emp(){
		super();
	}
	protected Emp(String id, String name, int age, double sal) {
		super();
		this.setId(id);
		this.setName(name);
		this.setAge(age);
		this.setSal(sal);
	}
	public double getYearIncome(){
		return sal * 12;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>18&&age<60){
		    this.age = age;
		}else{
			System.out.println("年龄错误");
		}
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		if(sal>970){
		    this.sal = sal;
		}else{
			System.out.println("工资错误");
		}
	}
}
