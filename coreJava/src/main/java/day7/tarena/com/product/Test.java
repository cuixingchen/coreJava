package day7.tarena.com.product;

public class Test {
	public static void main(String[] args) {
		Custom cus = new Custom(1001,"����","1350","����","1@");
		Product[] p = new Product[3];
		p[0] = new Product("001", "ţ��",4.0,"����");
		p[1] = new Product("002", "��ţ",4000.0,"����");
		p[2] = new Product("003", "С����",400.0,"����");
		Order o = new Order("ko01",4404,cus,p);
	}
}
