package day4;

public class TestContinue
{
	public static void main(String[] args){
	    for(int i=0;i<100;i++){
		    if(i%5==0) continue;//continue�����´Σ���������
			if(i%37==0) break;//break�˳�ѭ����û���´�
			System.out.print(i+" ");
		}
	}
}