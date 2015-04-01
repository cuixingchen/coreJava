package day7.tarena.com.product;

public class Test {
	public static void main(String[] args) {
		Custom cus = new Custom(1001,"张三","1350","北京","1@");
		Product[] p = new Product[3];
		p[0] = new Product("001", "牛奶",4.0,"内蒙");
		p[1] = new Product("002", "奶牛",4000.0,"内蒙");
		p[2] = new Product("003", "小绵羊",400.0,"内蒙");
		Order o = new Order("ko01",4404,cus,p);
	}
}
