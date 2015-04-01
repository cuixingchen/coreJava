package day10.tarena.com;
import java.util.Scanner;
public class TestZZ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String reg1 = "^[A-Za-z0-9]{5,12}$";
		String emailReg = "^[A-Za-z0-9_]+@[A-Za-z0-9_]+(\\.com|\\.net)$";
		String priceReg = "^[0-9]+\\.?[0-9]{0,2}$";
		while(true){
		    System.out.println("请输入客户名：");
		    String name = sc.next();
		    if(name.matches(reg1)) break;
		}
		while(true){
		    System.out.println("请输入email：");
		    String email = sc.next();
		    if(email.matches(emailReg)) break;
		}
		while(true){
		    System.out.println("请输入价格：");
		    String price = sc.next();
		    if(price.matches(priceReg)) break;
		}
		System.out.println("ok");
	}

}
