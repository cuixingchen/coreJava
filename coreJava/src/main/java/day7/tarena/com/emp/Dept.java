package day7.tarena.com.emp;

public class Dept extends Emp {
    private double addition;

	public Dept() {
		super();
	}

	public Dept(String id, String name, int age, double sal, double addition) {
		super(id, name, age, sal);
		this.setAddition(addition);
	}
	public double getYearIncome(){
		return super.getYearIncome()+addition;
	}

	public double getAddition() {
		return addition;
	}

	public void setAddition(double addition) {
		if(addition>0){
		    this.addition = addition;
		}else{
			System.out.println("ฒนึ๚ดํฮ๓");
		}
	}
}
