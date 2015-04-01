package day4;

import java.util.Arrays;
import java.util.Random;
public class Bubble 
{
	public static void main(String[] args) 
	{
		int[] arr = {6,8,3,2,1,4,5,7};
		/*for(int i=0;i<arr.length;i++){
		    for(int j=0;j<arr.length-1-i;j++){
			    if(arr[j]>arr[j+1]){
				    //½»»»jºÍj+1
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}*/
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]);
		}
	}
}
