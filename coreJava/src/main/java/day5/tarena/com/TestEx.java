package day5.tarena.com;

public class TestEx {
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b = {{1,4,7},{2,5,8},{3,6,9}};
	//要求:做a*b部分效果，显示出：
		/* 1 4 9
		 * 16 25 36
		 * 49 64 81
		 * a的行*b的列*/
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]*b[j][i]+" ");
			}
			System.out.println();
		}
	}
}
