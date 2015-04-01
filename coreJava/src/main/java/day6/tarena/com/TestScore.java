package day6.tarena.com;
import java.util.Scanner;
public class TestScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入人数：");
		int num = sc.nextInt();
		if(num<=0){
			System.out.println("输入错误，请重新输入");
			return;
		}
		String[] name = new String[num];
		int[] score = new int[num];
		for(int i=0;i<num;i++){
			System.out.println("请输入名字和成绩：");
			name[i] = sc.next();
			score[i] = sc.nextInt();
		}//成绩和名字录入ok
		int total = 0;
		int max = score[0];
		int min = score[0];
		for(int i=0;i<num;i++){
			total = total + score[i];
			if(max<score[i]) max = score[i];
			if(min>score[i]) min = score[i];
		}
		System.out.println("总分："+total);
		System.out.println("平均分："+Math.round(1.0*total/num));
		System.out.println("最高分："+max);
		System.out.println("最低分："+min);
		String maxName = "";
		String minName = "";
		for(int i=0;i<num;i++){
			if(max==score[i]) maxName=maxName+name[i]+" ";
			if(min==score[i]) minName=minName+name[i]+" ";
		}
		System.out.println(maxName);
		System.out.println(minName);
	}
}
