package day7.tarena.com.emp;

public class Admin extends Emp {
    private String pos;

	public Admin() {
		super();
	}

	public Admin(String id, String name, int age, double sal, String pos) {
		super(id, name, age, sal);
		this.setPos(pos);
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}
}
