package day8.tarena.com;
import java.util.Scanner;
public class TestUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User[] u = new User[2];
		for(int i=0;i<u.length;i++){
			System.out.println("�������û��������롢�绰��email");
			String name = sc.next();
			String passWd = sc.next();
			String tel = sc.next();
			String email = sc.next();
			u[i] = new User(name,passWd,tel,email);
		}
		if(u[0].equals(u[1])){
			System.out.println("��ͬ�û�");
			System.out.println(u[0]);
		}else{
			System.out.println("��ͬ�û�");
			System.out.println(u[0]);
			System.out.println(u[1]);
		}
	}
}
