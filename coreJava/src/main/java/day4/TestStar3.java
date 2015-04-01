package day4;

public class TestStar3 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<4;i++){
		    for(int j=0;j<4-1-i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++){
			    System.out.print("*");
			}
			System.out.println();
		}
	}
}
