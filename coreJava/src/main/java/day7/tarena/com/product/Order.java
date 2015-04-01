package day7.tarena.com.product;
//编号、总金额、一个客户、多个商品
public class Order {
    private String id;
    private double money;
    private Custom cus;
    private Product[] pro;
	public Order() {
		super();
	}
	public Order(String id, double money, Custom cus, Product[] pro) {
		super();
		this.setId(id);
		this.setMoney(money);
		this.setCus(cus);
		this.setPro(pro);
	}
	public Custom getCus() {
		return cus;
	}
	public void setCus(Custom cus) {
		this.cus = cus;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		if(money>0){
		    this.money = money;
		}else{
			System.out.println("money 错误");
		}
	}
	public Product[] getPro() {
		return pro;
	}
	public void setPro(Product[] pro) {
		this.pro = pro;
	}
}
