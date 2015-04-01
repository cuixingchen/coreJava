package day4;

public class TestContinue
{
	public static void main(String[] args){
	    for(int i=0;i<100;i++){
		    if(i%5==0) continue;//continue继续下次，结束本次
			if(i%37==0) break;//break退出循环，没有下次
			System.out.print(i+" ");
		}
	}
}