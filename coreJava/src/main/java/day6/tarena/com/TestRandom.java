package day6.tarena.com;
import java.util.Random;
import java.util.HashSet;
public class TestRandom {
	public static void main(String[] args) {
		Random r = new Random();
		HashSet hs = new HashSet();//自动过滤重复元素
		for(;;){
			int i = r.nextInt(8)+1;
			hs.add(i+"");
			if(hs.size()==7) break;
 		}
		System.out.println(hs);
		/*int[] arr = new int[7];
		int[] tem = {1,2,3,4,5,6,7,8};
		for(int i=0;i<arr.length;i++){
			int index = r.nextInt(8-i);
			arr[i] = tem[index];
			tem[index] = tem[8-1-i];
		}*/
		/*for(int i=0;i<arr.length;i++){
		    arr[i] = r.nextInt(8)+1;
		    for(int j=0;j<i;j++){
		    	if(arr[j]==arr[i]){
		    		i--;
		    		break;
		    	}
		    }
		}*/
		/*for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]);
		}*/
	}
}
