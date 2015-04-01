package day5.tarena.com;

public class Product {
// 编号、名称、价格、产地
	String pId;
	String name;
	double price;
	String provider;
	
	public Product(){}
	public Product(String pId,String name,double price,String provider){
		this.pId = pId;
		this.name = name;
		this.price = price;
		this.provider = provider;
	}
	//包装商品、商品定价
	public void packProduct(String str){
		System.out.println("用"+str+"包装了商品");
	}
	public void setPrice(double price){
		this.price = price;
	}

}
