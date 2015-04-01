package day5.tarena.com;

public class TestProduct {
	public static void main(String[] args) {
		Product p = new Product("hl001","≈£ƒÃ",4.0,"±±æ©");
		p.packProduct("À‹¡œ");
		p.setPrice(4.5);
		System.out.println(p.price);
	}
}