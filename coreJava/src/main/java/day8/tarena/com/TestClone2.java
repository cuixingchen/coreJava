package day8.tarena.com;

public class TestClone2 {
	public static void main(String[] args) throws Exception{
		TestClone tc1 = new TestClone();
		tc1.a = 2;
		tc1.s = "bbb";
		Object obj = tc1.clone();
		if(obj instanceof TestClone){
			TestClone tc = (TestClone)obj;
			System.out.println(tc == tc1);//f
			System.out.println(tc.a == tc1.a);//t
			System.out.println(tc.s == tc1.s);//Ç³¿ËÂ¡
		}
	}
}
