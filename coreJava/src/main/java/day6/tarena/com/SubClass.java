package day6.tarena.com;

public class SubClass extends SuperClass{
    private int b;
    public SubClass(){// 1
    	this("a",20,30);//2
    	System.out.println("Sub无参");//14
    }
    public SubClass(String s,int a,int b){//3
    	super(s,a);//4
    	System.out.println("Sub有参");//12
    	this.setB(b);//13
    	//this.setS(s);
    	//this.a = a;
    }//在SuperClass的有参构造中加this()
    public int getB(){
    	return b;
    }
    public void setB(int b){
    	this.b = b;
    }
	public static void main(String[] args) {
		SubClass sc = new SubClass();//子类会先调用父类构造
		//SubClass sc1 = new SubClass("zz",23);//不能继承父类构造
		sc.setB(20);
		sc.setS("zhang");//SuperClass继承来的
		System.out.println(sc.getB());
		System.out.println(sc.getS());
		sc.equals("");//Object继承来的
	}
}
