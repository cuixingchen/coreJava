package day7.tarena.com.inter;

public class Gold implements JinShu,HuoBi{
	public void change(){
		System.out.println("可以很多好吃的");
	}
	public void shine(){
		System.out.println("很黄很暴力");
	}
	public static void main(String[] args) {
		JinShu js = new Gold();//多态
		js.shine();
		//js.change();
		HuoBi hb = new Gold();
		hb.change();
		System.out.println(JinShu.I);
		Gold g = new Gold();
		g.shine();
		g.change();
	}
}/*public interface JinShu {
	int I = 3;//接口中所有属性都是public常量
    void shine();//默认就是public的抽象方法
}
*/
