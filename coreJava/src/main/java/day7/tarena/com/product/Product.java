package day7.tarena.com.product;

public class Product {
    private String id;
    private String name;
    private double price;
    private String provider;
	public Product() {
		super();
	}
	public Product(String id, String name, double price, String provider) {
		super();
		this.setId(id);
		this.setName(name);
		this.setPrice(price);
		this.setProvider(provider);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<=0){
			System.out.println("¼Û¸ñÓÐÎó");
		}else{
		    this.price = price;
		}
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
}
