package day7.tarena.com;

public class DAccount extends Account{
    public double get(){
    	return getMoney()*0.03;
    }
	public static void main(String[] args) {
		Account a = new DAccount();
		System.out.println(a.get());
	}
}
