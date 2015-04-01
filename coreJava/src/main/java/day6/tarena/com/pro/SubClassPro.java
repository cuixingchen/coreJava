package day6.tarena.com.pro;//包要不同
import day6.tarena.com.SuperClass;
public class SubClassPro extends SuperClass{//写继承
	public void a(){
		this.test();//算继承
	}//在SuperClass加一个protected的test方法
    public static void main(String[] args){
    	SuperClass c = new SuperClass();
    	//c.test();//不是本类，不是本包，有继承不能算
    	SubClassPro sc = new SubClassPro();
    	sc.test();//算继承
    }
}
