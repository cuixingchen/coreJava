package day7.tarena.com.product;
//编号、名字、电话、地址、email
public class Custom {
    private int id;
    private String name;
    private String tel;
    private String addr;
    private String email;
	public Custom() {
		super();
	}
	public Custom(int id, String name, String tel, String addr, String email) {
		super();
		this.setId(id);
		this.setName(name);
		this.setTel(tel);
		this.setAddr(addr);
		this.setEmail(email);
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
