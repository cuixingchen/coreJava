package day7.tarena.com;

public class Custom {
    private final int id;
    private static int count = 1;
    public static final int CO = 1;//����ֻ��������ʱ��ֵ
    public Custom(){
    	id = count;
    	count++;
    	//CO = 1;//�����г������ܸ�ֵ
    }
	public static void main(String[] args) {
		Custom c1 = new Custom();
		Custom c2 = new Custom();
		System.out.println(c1.id);
		System.out.println(c2.id);
	}
}
