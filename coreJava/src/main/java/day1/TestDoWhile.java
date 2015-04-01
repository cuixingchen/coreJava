package day1;

public class TestDoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=0;
		System.out.println("++++++++++++++++++++++++++++++++");
		int j=0;
		do {
			i++;
			j++;
			System.out.println("1-i:"+i);
		} while (j<10);
		System.out.println("==================================");
		j=0;
		do {
			i++;
			j++;
			System.out.println("2-i:"+i);
		} while (j<10);
		System.out.println("------------------------------");
		
	}

}
