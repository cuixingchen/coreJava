package day7.tarena.com;

public abstract class Account{
    private double money = 2000;
    public abstract double get() ;
    public double getMoney(){
    	return this.money;
    }
    public void setMoney(double money){
    	if(money<0){
    		System.out.println("½ð¶î²»¶Ô");
    	}else{
    		this.money = money;
    	}
    }
}
