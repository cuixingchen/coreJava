package day3;

public class TestFor 
{
	public static void main(String[] args) 
	{
		/*for(int i=1;i<11;i++){
		    System.out.println(i);//ѭ�������
		}*///ctrl+c�˳�dos����ѭ��
        for(int i=1;i<101;i++){
		    if(i%2!=0){
			    System.out.println(i);
			}
		}
		for(int i=1;i<101;i=i+2){
		    System.out.println(i);
		}
		for(int i=1;i<=50;i++){
		    System.out.println(i*2-1);
		}
	}//eclipse�� �����˳�JVM
}//��ϰ��������˼·��ӡ1-100������(1,3,5,7,9...)