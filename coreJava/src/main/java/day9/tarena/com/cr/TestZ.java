package day9.tarena.com.cr;
import java.util.Scanner;
public class TestZ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����룺");
		String s = sc.next();
		String nameReg = "^[A-Za-z0-9_]{5,8}$";
		String passReg = "^[A-Za-z0-9]{6,8}$";
		//�ֻ�����
		String moblieReg = "^1\\d{10}$";
	//email���� ǰ��֧����ĸ����_ ��@ ��.com����.net����
		String emailReg = "^[A-Za-z0-9_]+@[A-Za-z0-9_]+(\\.com|\\.net)$";
		if(s.matches(emailReg)){
			System.out.println("����Ϸ�");
		}else{
			System.out.println("����Ƿ�");
		}
	}
}
