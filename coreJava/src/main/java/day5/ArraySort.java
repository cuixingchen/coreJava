package day5;


public class ArraySort {
	public void doChooseSort(int[] src)//选择排序
    {
       int len=src.length;
       int temp;
       for(int i=0;i<len;i++)
       {
           temp=src[i];
           int j;
           int samllestLocation=i;//最小数的下标
           for(j=i+1;j<len;j++)
           {
              if(src[j]<temp)
              {
                  temp=src[j];//取出最小值
                  samllestLocation=j;//取出最小值所在下标
              }
           }
           src[samllestLocation]=src[i];
           src[i]=temp;
       }
    }
	public void doInsertSort(int[] src)//插入排序
    {
       int len=src.length;
       for(int i=1;i<len;i++)
       {
           int j;
           int temp=src[i];
           for(j=i;j>0;j--)
           {
              if(src[j-1]>temp)
              {
                  src[j]=src[j-1];
                  
              }else break;
           }
           src[j]=temp;
       }
    }


	public static void main(String[] args) {
		int[] test = {2,1,3,5,4,7,6};
		ArraySort as = new ArraySort();
		//as.doChooseSort(test);
		as.doInsertSort(test);
		for(int i=0;i<test.length;i++){
			System.out.println(test[i]);
		}
	}

}
