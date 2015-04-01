package day9.tarena.com.cr;
import java.util.Scanner;
public class TestZ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入：");
		String s = sc.next();
		String nameReg = "^[A-Za-z0-9_]{5,8}$";
		String passReg = "^[A-Za-z0-9]{6,8}$";
		//手机正则
		String moblieReg = "^1\\d{10}$";
	//email正则 前面支持字母数字_ 有@ 以.com或者.net结束
		String emailReg = "^[A-Za-z0-9_]+@[A-Za-z0-9_]+(\\.com|\\.net)$";
		if(s.matches(emailReg)){
			System.out.println("输入合法");
		}else{
			System.out.println("输入非法");
		}
	}
}
