package day6.tarena.com;

public class MyArray{
	int index = 0;//记录元素个数
    int[] arr = new int[10];
    public void add(int a){
        //可以无限制的放int
    	if(arr.length==index){
    		int[] old = arr;
    		arr = new int[index*2];
    		System.arraycopy(old,0,arr,0, index);
    	}
    	arr[index] = a;
    	index++;
    }
}
