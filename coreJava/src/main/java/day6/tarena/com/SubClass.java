package day6.tarena.com;

public class SubClass extends SuperClass{
    private int b;
    public SubClass(){// 1
    	this("a",20,30);//2
    	System.out.println("Sub�޲�");//14
    }
    public SubClass(String s,int a,int b){//3
    	super(s,a);//4
    	System.out.println("Sub�в�");//12
    	this.setB(b);//13
    	//this.setS(s);
    	//this.a = a;
    }//��SuperClass���вι����м�this()
    public int getB(){
    	return b;
    }
    public void setB(int b){
    	this.b = b;
    }
	public static void main(String[] args) {
		SubClass sc = new SubClass();//������ȵ��ø��๹��
		//SubClass sc1 = new SubClass("zz",23);//���ܼ̳и��๹��
		sc.setB(20);
		sc.setS("zhang");//SuperClass�̳�����
		System.out.println(sc.getB());
		System.out.println(sc.getS());
		sc.equals("");//Object�̳�����
	}
}
