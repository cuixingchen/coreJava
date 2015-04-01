package day8.tarena.com;

public class User {
    private String name;
    private String passWd;
    private String tel;
    private String email;
	public User() {
		super();
	}
	public User(String name, String passWd, String tel, String email) {
		super();
		this.setName(name);
		this.setPassWd(passWd);
		this.setTel(tel);
		this.setEmail(email);
	}
	@Override//重写标注，说明下一个方法是重写的
	public boolean equals(Object obj){
		if(obj == null) return false;
		else if(obj instanceof User){
			User u = (User)obj;
			return u.name.equals(name);
		}return false;
	}
	@Override
	public int hashCode(){
		int type = 43;
		return type*97+name.hashCode();
	}
	@Override
	public String toString(){
		return "用户名："+name+"，密码：******，电话："+tel+"，邮箱："+email;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
