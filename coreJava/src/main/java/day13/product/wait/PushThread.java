package day13.product.wait;
public class PushThread implements Runnable
{
  private SafeStack s;
  public PushThread(SafeStack s)
  {
    this.s = s;
  }
  public void run()
  {
    int temp = 0;
    
    for(int i=0;i<100;i++)
    {
      java.util.Random r = new java.util.Random();
      temp = r.nextInt(10);
      s.push(temp);
      try {
        Thread.sleep(100);
      }
      catch(InterruptedException e){
	      e.printStackTrace();
	  }
    }
  }  
}