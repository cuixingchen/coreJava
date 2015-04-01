package day2;

public class TestShift 
{
	public static void main(String[] args) 
	{
		System.out.println(7>>2);//7右移2位 0000 0111
		System.out.println(7<<2);//0001 1100
		System.out.println(7>>34);//先取32/64的余，然后移
		System.out.println(7>>-30);//+32/64的倍数，转正数后移
	    System.out.println(-7>>1);//前面补1 1111 1100
		System.out.println(-7>>>1);//前面补0
	}
}