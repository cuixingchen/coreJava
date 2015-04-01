package day7.tarena.com.emp;

public class Sales extends Emp{
    private double comm;
	public Sales() {
		super();
	}
	public Sales(String id, String name, int age, double sal, double comm) {
		super(id, name, age, sal);
		this.setComm(comm);
	}
	public double getYearIncome(){
		return super.getYearIncome()*(1+comm);
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		if(comm>0){
		    this.comm = comm;
		}else{
			System.out.println("销售提成不能负数");
		}
	}
}
