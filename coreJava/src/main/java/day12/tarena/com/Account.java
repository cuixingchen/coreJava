package day12.tarena.com;

public class Account implements Runnable{
	private double money = 2000;
	Object obj = new Object();
    public void run(){
    	//Object obj = new Object();
    	synchronized(obj){//ԭ����(�����ٷ�)
    	    double temp = money;//��Զ��ȡ���ݵ�����
    	    temp = temp -800;
    	    try {
		  	    Thread.sleep(1000);//ģ��������ʱ
		    }catch (Exception e) {e.printStackTrace();}
		//synchronized(obj){
    	    money = temp;//д��Զ�����ݿ�
    	}}
	public static void main(String[] args) throws Exception{
		Account a = new Account();
		Thread t1 = new Thread(a);Thread t2 = new Thread(a);
		t1.start();t2.start();
		Thread.sleep(3000);//��֤����ȡǮ��ɺ����
		System.out.println(a.money);
	}
}
