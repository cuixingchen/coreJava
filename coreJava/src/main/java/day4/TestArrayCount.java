package day4;

public class TestArrayCount 
{
	public static void main(String[] args) 
	{
		 char[] arr = {'a','c','b','c','a','c','d','a','e'};
		 char[] ch = new char[arr.length];
		 int[] times = new int[arr.length];
		 int index = 0;//ch和times有效下标
		 for(int i = 0;i<arr.length;i++){
			 boolean flag = true;//默认flag=true，即新元素
			 for(int j=0;j<index;j++){
			     if(arr[i] == ch[j]){
				     times[j]++;
					 flag = false;//老元素 flag = false
					 break;
				 }
			 }
			 if(flag){//flag=true 即新元素
				 ch[index] = arr[i];
				 times[index] = 1;
				 index++;
			 }
		 }
		 for(int i=0;i<index;i++){
		     System.out.println(ch[i]+":"+times[i]+"次");
		 }
	}
}
