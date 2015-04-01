package day6.tarena.com;

public class Teacher extends Person{
	private double sal;
    public Teacher(){}
    public Teacher(String name,int age,double sal){
    	super(name,age);
    	this.setSal(sal);
    }
    public double getSal(){
    	return this.sal;
    }
    public void setSal(double sal){
    	if(sal>970){
    		this.sal = sal;
    	}else{
    		System.out.println("sal错误，请重新定价");
    	}
    }
    public String getMessage(){
    	String s = super.getMessage()+",工资："+sal;
    	return s;
    }//重写，父类方法就调不到，被覆盖了
	public static void main(String[] args){
		Teacher t = new Teacher("zhangfei",30,5000);
		System.out.println(t.getMessage());
		Person p = new Person("zhaoyun",29);
		System.out.println(p.getMessage());
		//System.out.println(t.getMessage());
	}
}
