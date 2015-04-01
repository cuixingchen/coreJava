package day13.product.wait;
public class SafeStack
{
  private int top = 0;
  private int[] values = new int[10];
  private boolean dataAvailable = false;//ѹվ��վ�ı�־
  public void push(int n) 
  {
    synchronized(this)
    {
      while(dataAvailable)    //1
      {
      	try
        {
        	wait();//������ͬ�������ڵ��ã������쳣
        }
      	catch(InterruptedException e)
        {
        	e.printStackTrace();
        }        
      }
      values[top] = n;
      System.out.println("ѹ������"+n+"����1���");
      top++;
      dataAvailable = true;
      notifyAll();
      System.out.println("ѹ���������");
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
      System.out.print("����");
      top--;
      int[] test = {values[top],top};
      dataAvailable = false;
      //�������ڵȴ�ѹ�����ݵ��߳�
      notifyAll();
      return test;
    }
  }
}