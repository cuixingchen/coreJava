package day7.tarena.com.emp;

public class Tech extends Emp {
    private String project;
    private double proComm;
	public Tech() {
		super();
	}
	public Tech(String id, String name, int age, double sal, String project, double proComm) {
		super(id, name, age, sal);
		this.setProject(project);
		this.setProComm(proComm);
	}
	public double getYearIncome(){
		return super.getYearIncome()+proComm;
	}
	public double getProComm() {
		return proComm;
	}
	public void setProComm(double proComm) {
		if(proComm<1000){
			System.out.println("奖金错误，不用发了");
		}else{
		    this.proComm = proComm;
		}
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
}
