package day2;

public class TestShift 
{
	public static void main(String[] args) 
	{
		System.out.println(7>>2);//7����2λ 0000 0111
		System.out.println(7<<2);//0001 1100
		System.out.println(7>>34);//��ȡ32/64���࣬Ȼ����
		System.out.println(7>>-30);//+32/64�ı�����ת��������
	    System.out.println(-7>>1);//ǰ�油1 1111 1100
		System.out.println(-7>>>1);//ǰ�油0
	}
}