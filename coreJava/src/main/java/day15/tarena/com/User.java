package day15.tarena.com;

public class User {
    private String userName;
    private String passWd;
    private String email;
	public User() {
		super();
	}
	public User(String userName, String passWd, String email) {
		super();
		this.setUserName(userName);
		this.setPassWd(passWd);
		this.setEmail(email);
	}
	@Override
	public boolean equals(Object obj){
		if(obj == null) return false;
		else if(obj instanceof User){
			User u = (User)obj;
			return u.userName.equals(this.userName);
		}
		return false;
	}
	@Override
	public int hashCode(){
		int type = 41;
		return type*47 + userName.hashCode();
	}
	@Override
	public String toString(){
		return userName+","+passWd+","+email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassWd() {
		return passWd;
	}
	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
