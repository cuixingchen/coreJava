package day8.tarena.com;

public class TestClone implements Cloneable{
    int a = 1;
    String s = new String("abc");
    /*public Object clone() throws CloneNotSupportedException{
    	return super.clone();
    }*///浅克隆
    public Object clone(){//深克隆
    	TestClone t = new TestClone();
    	t.a = this.a;
    	t.s = new String(this.s);
    	return t;
    }
	public static void main(String[] args) throws Exception{
		TestClone tc1 = new TestClone();
		tc1.a = 2;
		tc1.s = "bbb";
		Object obj = tc1.clone();
		if(obj instanceof TestClone){
			TestClone tc = (TestClone)obj;
			System.out.println(tc == tc1);//f
			System.out.println(tc.a == tc1.a);//t
			System.out.println(tc.s == tc1.s);//浅克隆
		}
	}
}
