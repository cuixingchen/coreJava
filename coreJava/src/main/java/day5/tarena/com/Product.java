package day5.tarena.com;

public class Product {
// ��š����ơ��۸񡢲���
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
	//��װ��Ʒ����Ʒ����
	public void packProduct(String str){
		System.out.println("��"+str+"��װ����Ʒ");
	}
	public void setPrice(double price){
		this.price = price;
	}

}
