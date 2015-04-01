package day10.tarena.com;

public class TestFei {
	public static long get2(int n){//递推
		long x = 1;//第二项
		long y = 1;//第一项
		for(int i=0;i<n-2;i++){
			/*long temp = x;
			x = x+y;//第三项
			y = temp;*///第二项
			x = x+y;//第三项
			y = x-y;//第三项 - 第一项=第二项
		}
	    return x;
	}
    public static long get1(int n){//递归，自己调自己
    	//f(x) = f(x-1)+f(x-2);
    	if(n>=3){
    		long f = get1(n-1)+get1(n-2);
    		return f;
    	}else if(n>0){
    		return 1;
    	}else{
    		System.out.println("错误的项");
    		return 0;
    	}
    }
	public static void main(String[] args) {
		System.out.println(TestFei.get2(70));
	}

}
