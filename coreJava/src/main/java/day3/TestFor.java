package day3;

public class TestFor 
{
	public static void main(String[] args) 
	{
		/*for(int i=1;i<11;i++){
		    System.out.println(i);//循环体语句
		}*///ctrl+c退出dos的死循环
        for(int i=1;i<101;i++){
		    if(i%2!=0){
			    System.out.println(i);
			}
		}
		for(int i=1;i<101;i=i+2){
		    System.out.println(i);
		}
		for(int i=1;i<=50;i++){
		    System.out.println(i*2-1);
		}
	}//eclipse中 点红点退出JVM
}//练习：用两种思路打印1-100的奇数(1,3,5,7,9...)