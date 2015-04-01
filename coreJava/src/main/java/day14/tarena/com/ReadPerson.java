package day14.tarena.com;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class ReadPerson {
	public static void main(String[] args) {
		//练习：用合适的流读出Person
		try{
			FileInputStream fis = new 
			FileInputStream("d:/person.tmp");
			ObjectInputStream ois = new 
			  ObjectInputStream(fis);
			Object obj = ois.readObject();
			if(obj instanceof Person){
				Person p = (Person)obj;
				System.out.println(p);
			}
			ois.close();
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}
}
