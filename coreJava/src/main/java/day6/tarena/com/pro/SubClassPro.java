package day6.tarena.com.pro;//��Ҫ��ͬ
import day6.tarena.com.SuperClass;
public class SubClassPro extends SuperClass{//д�̳�
	public void a(){
		this.test();//��̳�
	}//��SuperClass��һ��protected��test����
    public static void main(String[] args){
    	SuperClass c = new SuperClass();
    	//c.test();//���Ǳ��࣬���Ǳ������м̳в�����
    	SubClassPro sc = new SubClassPro();
    	sc.test();//��̳�
    }
}
