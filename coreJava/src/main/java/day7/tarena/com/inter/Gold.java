package day7.tarena.com.inter;

public class Gold implements JinShu,HuoBi{
	public void change(){
		System.out.println("���Ժܶ�óԵ�");
	}
	public void shine(){
		System.out.println("�ܻƺܱ���");
	}
	public static void main(String[] args) {
		JinShu js = new Gold();//��̬
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
	int I = 3;//�ӿ����������Զ���public����
    void shine();//Ĭ�Ͼ���public�ĳ��󷽷�
}
*/
