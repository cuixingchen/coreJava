package day13.product.wait;
public class SafeStack
{
  private int top = 0;
  private int[] values = new int[10];
  private boolean dataAvailable = false;//压站出站的标志
  public void push(int n) 
  {
    synchronized(this)
    {
      while(dataAvailable)    //1
      {
      	try
        {
        	wait();//必须在同步语句块内调用，否则异常
        }
      	catch(InterruptedException e)
        {
        	e.printStackTrace();
        }        
      }
      values[top] = n;
      System.out.println("压入数字"+n+"步骤1完成");
      top++;
      dataAvailable = true;
      notifyAll();
      System.out.println("压入数字完成");
    }  
  }

  public int[] pop() 
  {
    synchronized(this)
    {
      while(!dataAvailable)    //3
      {
        try
        {
          wait();
        }
      	catch(InterruptedException e)
        {
          e.printStackTrace();
        }        
      }  
      System.out.print("弹出");
      top--;
      int[] test = {values[top],top};
      dataAvailable = false;
      //唤醒正在等待压入数据的线程
      notifyAll();
      return test;
    }
  }
}