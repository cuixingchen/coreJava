package day6.tarena.com;
import java.util.Scanner;
public class TestScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������");
		int num = sc.nextInt();
		if(num<=0){
			System.out.println("�����������������");
			return;
		}
		String[] name = new String[num];
		int[] score = new int[num];
		for(int i=0;i<num;i++){
			System.out.println("���������ֺͳɼ���");
			name[i] = sc.next();
			score[i] = sc.nextInt();
		}//�ɼ�������¼��ok
		int total = 0;
		int max = score[0];
		int min = score[0];
		for(int i=0;i<num;i++){
			total = total + score[i];
			if(max<score[i]) max = score[i];
			if(min>score[i]) min = score[i];
		}
		System.out.println("�ܷ֣�"+total);
		System.out.println("ƽ���֣�"+Math.round(1.0*total/num));
		System.out.println("��߷֣�"+max);
		System.out.println("��ͷ֣�"+min);
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
