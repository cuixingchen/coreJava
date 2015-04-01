package day11.tarena.com;

public class TestRuntimeException {
	public static void main(String[] args) {
		int b = 0;//用判断避免 非检测异常
		if(b!=0)
		    b = 2/b;//算术异常
		String s = null;
		if(s!=null)
		    s.equals("");//空指针异常
		int[] arr = new int[2];
		int index = 2;
		if(index>=0 && index<arr.length)
		    arr[index] = 2;//数组下标越界异常
		Object obj = 3;
		if(obj instanceof String){
		    String st = (String)obj;//类型转换异常
		}
		String str = "aa";
		String reg = "^-?[0-9]+$";
		if(str.matches(reg)){
		    int i = Integer.parseInt(str);//数字格式异常
		    System.out.println(i);
		}
	}
}
