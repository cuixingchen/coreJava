package day4;

public class TestZh 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<10;i++){//������
		   for(int j=0;j<13;j++){//Ů����
		       int k = 36-i-j;//С����
			   if((i*4+j*3+k/2)==36 && k%2==0){
			       System.out.println(i+","+j+","+k);
			   }
		   }
		}
	}
}
