package day6.tarena.com;

public class SuperClass {
    private String s ;
    private int a;
    public SuperClass(){//7
    	//super();//8��Ч��,��Object()
    	System.out.println("Super�޲�");//8
    }
    public SuperClass(String s,int a){//5
    	this();//6
    	System.out.println("Super�в�");//9
    	this.setS(s);//10
    	this.a = a;//11
    }
    protected void test(){
    	System.out.println("test");
    }
    public void setS(String s){
    	this.s = s;
    }
    public String getS(){
    	return s;
    }
}
