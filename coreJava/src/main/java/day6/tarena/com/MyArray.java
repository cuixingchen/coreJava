package day6.tarena.com;

public class MyArray{
	int index = 0;//��¼Ԫ�ظ���
    int[] arr = new int[10];
    public void add(int a){
        //���������Ƶķ�int
    	if(arr.length==index){
    		int[] old = arr;
    		arr = new int[index*2];
    		System.arraycopy(old,0,arr,0, index);
    	}
    	arr[index] = a;
    	index++;
    }
}
