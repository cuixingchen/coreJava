package day11.tarena.com;

public class TestThrow {
    public static int divide(int a,int b){
    	if(b==0){
    		//�쳣�׳���throw�Ӿ�
    		throw new ArithmeticException("0����������");
    		//System.out.println("���쳣��");
    	}else{
    	    return a/b;
    	}
    	/*a = a/b;//����һ���׳��쳣������
    	System.out.println("���쳣��");
    	return a;*/
    }
	public static void main(String[] args) {
		TestThrow.divide(2, 0);
	}
}
