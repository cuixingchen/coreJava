package day10.tarena.com;

public class TestFei {
	public static long get2(int n){//����
		long x = 1;//�ڶ���
		long y = 1;//��һ��
		for(int i=0;i<n-2;i++){
			/*long temp = x;
			x = x+y;//������
			y = temp;*///�ڶ���
			x = x+y;//������
			y = x-y;//������ - ��һ��=�ڶ���
		}
	    return x;
	}
    public static long get1(int n){//�ݹ飬�Լ����Լ�
    	//f(x) = f(x-1)+f(x-2);
    	if(n>=3){
    		long f = get1(n-1)+get1(n-2);
    		return f;
    	}else if(n>0){
    		return 1;
    	}else{
    		System.out.println("�������");
    		return 0;
    	}
    }
	public static void main(String[] args) {
		System.out.println(TestFei.get2(70));
	}

}
