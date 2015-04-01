package day13.product.wait;
public class PopThread implements Runnable
{
  private SafeStack s;
  public PopThread(SafeStack s)
  {
    this.s = s;
  }
  public void run()
  {
    for(int i=0;i<100;i++)
    {
    	int temp[] = s.pop();
		System.out.println("->"+ temp[0] + "<-");
    	try {
            	Thread.sleep(100);
        }
        catch(InterruptedException e){
		    e.printStackTrace();
		}
    }
  }
}