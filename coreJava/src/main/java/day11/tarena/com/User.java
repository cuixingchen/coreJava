package day11.tarena.com;

public class User {
    private String name;
    private String passWd;
    private String email;
	public User() {
		super();
	}
	public User(String name, String passWd, String email) {
		super();
		this.setName(name);
		this.setPassWd(passWd);
		this.setEmail(email);
	}
	@Override
	public String toString(){
		return name+":"+passWd+":"+email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassWd() {
		return passWd;
	}
	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}
}
