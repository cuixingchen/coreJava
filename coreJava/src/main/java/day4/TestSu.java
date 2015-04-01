package day4;

public class TestSu{
	public static void main(String[] args) 
	{
		for(int i=2;i<100;i++){
			boolean flag = true;//默认是
		    for(int j=2;j<i;j++){
		        if(i%j==0)//i不是素数
			    {
					flag = false;
					break;
			    }
			   /*if(i%j!=0)//不能确定是或者不是？
			     System.out.println(i);*/
		    }
			if(flag)
				System.out.println(i);
		}
	}
}
