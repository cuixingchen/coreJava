package day1;

public class A extends Thread{
    public void run(){
        
        System.out.println("1");
        try{
            System.out.println("2");
            sleep(300);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("erro");
        }
        System.out.println("thread1");
    }
    public static void main(String[] args) throws InterruptedException{
        A a = new A();
        a.start();
        sleep(1000);
        a.interrupt();
    }
}
