package day14.tarena.com;
import java.io.*;
public class WritePerson {
	public static void main(String[] args){
		try{
			FileOutputStream fos = new 
			  FileOutputStream("d:/person.tmp");
			ObjectOutputStream oos = new 
			ObjectOutputStream(fos);
			Person p = new Person("zhang",25,"man","OBJ");
			//Person p = new Person("zhang",25,"man",new Object());
			oos.writeObject(p);
			oos.close();
			FileInputStream fis = new 
			FileInputStream("d:/person.tmp");
			ObjectInputStream ois = new 
			  ObjectInputStream(fis);
			Object obj = ois.readObject();
			if(obj instanceof Person){
				Person p1 = (Person)obj;
				System.out.println(p1);
			}
			ois.close();
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}

}
