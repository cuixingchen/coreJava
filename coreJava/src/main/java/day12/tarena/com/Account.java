package day12.tarena.com;

public class Account implements Runnable{
	private double money = 2000;
	Object obj = new Object();
    public void run(){
    	//Object obj = new Object();
    	synchronized(obj){//原子性(不可再分)
    	    double temp = money;//从远端取数据到本地
    	    temp = temp -800;
    	    try {
		  	    Thread.sleep(1000);//模拟网络延时
		    }catch (Exception e) {e.printStackTrace();}
		//synchronized(obj){
    	    money = temp;//写入远端数据库
    	}}
	public static void main(String[] args) throws Exception{
		Account a = new Account();
		Thread t1 = new Thread(a);Thread t2 = new Thread(a);
		t1.start();t2.start();
		Thread.sleep(3000);//保证两个取钱完成后看余额
		System.out.println(a.money);
	}
}
