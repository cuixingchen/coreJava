package day4;

public class TestSu{
	public static void main(String[] args) 
	{
		for(int i=2;i<100;i++){
			boolean flag = true;//Ĭ����
		    for(int j=2;j<i;j++){
		        if(i%j==0)//i��������
			    {
					flag = false;
					break;
			    }
			   /*if(i%j!=0)//����ȷ���ǻ��߲��ǣ�
			     System.out.println(i);*/
		    }
			if(flag)
				System.out.println(i);
		}
	}
}
