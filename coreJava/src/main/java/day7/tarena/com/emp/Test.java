package day7.tarena.com.emp;

public class Test {//����ԭ�򣬶���չ���ţ����޸Ĺر�
    public static double getIncome(Emp e){
    	return e.getYearIncome();
    }
	public static Emp addEmp(String name,int age){
		if(age>20 && age<60){
			Emp e = new Sales("001",name,age,3000,0.1);
			return e;
		}else{
			return null;
		}
	}
}
