package day6.tarena.com;

public class SuperClass {
    private String s ;
    private int a;
    public SuperClass(){//7
    	//super();//8无效果,调Object()
    	System.out.println("Super无参");//8
    }
    public SuperClass(String s,int a){//5
    	this();//6
    	System.out.println("Super有参");//9
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
