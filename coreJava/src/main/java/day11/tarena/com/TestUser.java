package day11.tarena.com;
import java.util.*;
public class TestUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û��������������");
		Map<String,String> map = new HashMap<String,String>();
		String nameReg = "^[A-Za-z0-9]{5,8}$";
		String passReg = "^[A-Za-z0-9]{6,12}$";
		String emailReg = "^[A-Za-z0-9_]+@[A-Za-z0-9_]+(\\.com|\\.net)$";
		for(;;){
			String name = sc.next();
			if(name.matches(nameReg)){
				map.put("name", name);
				break;
			}else{
				System.out.println("�����������������");
			}
		}
		for(;;){
			String pass1 = sc.next();
			String pass2 = sc.next();
			if(pass1.equals(pass2)&&pass1.matches(passReg)){
				map.put("passWd", pass1);
				break;
			}else{
				System.out.println("�����������������");
			}
		}
		for(;;){
			String email = sc.next();
			if(email.matches(emailReg)){
				map.put("email", email);
				break;
			}else{
				System.out.println("�����������������");
			}
		}
		String name = map.get("name");
		String passWd = map.get("passWd");
		String email = map.get("email");
		User u = new User(name,passWd,email);
		System.out.println(u);
	}
}
