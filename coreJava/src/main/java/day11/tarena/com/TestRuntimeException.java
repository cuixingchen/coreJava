package day11.tarena.com;

public class TestRuntimeException {
	public static void main(String[] args) {
		int b = 0;//���жϱ��� �Ǽ���쳣
		if(b!=0)
		    b = 2/b;//�����쳣
		String s = null;
		if(s!=null)
		    s.equals("");//��ָ���쳣
		int[] arr = new int[2];
		int index = 2;
		if(index>=0 && index<arr.length)
		    arr[index] = 2;//�����±�Խ���쳣
		Object obj = 3;
		if(obj instanceof String){
		    String st = (String)obj;//����ת���쳣
		}
		String str = "aa";
		String reg = "^-?[0-9]+$";
		if(str.matches(reg)){
		    int i = Integer.parseInt(str);//���ָ�ʽ�쳣
		    System.out.println(i);
		}
	}
}
