package day8.tarena.com;

public class StaticInner {
    private int i1;
    private static int i2;
    public static class Static{
    	public void test(){
    	    //System.out.println(i1);//不能直接使用，因为static
    	    System.out.println(i2);
    	}
    }
    public class Member{
    	public void test(){
    	    System.out.println(i1);
    	    System.out.println(i2);
    	}
    }
}

class TestStatic{
	public static void main(String[] args){
		StaticInner.Static s = new StaticInner.Static();
		s.test();
		StaticInner.Member m = 
		    new StaticInner().new Member();
		m.test();
		//System.out.println(StaticInner.i2);
	}
}
