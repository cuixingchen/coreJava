package day11.tarena.com;

public class TestThrow {
    public static int divide(int a,int b){
    	if(b==0){
    		//异常抛出用throw子句
    		throw new ArithmeticException("0不能做除数");
    		//System.out.println("抛异常了");
    	}else{
    	    return a/b;
    	}
    	/*a = a/b;//不是一定抛出异常，可能
    	System.out.println("抛异常了");
    	return a;*/
    }
	public static void main(String[] args) {
		TestThrow.divide(2, 0);
	}
}
