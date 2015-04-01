package day6.tarena.com;

public class TestPo {
	public static void main(String[] args) {
		Person p1 = new Teacher("zhangfei",30,5000);//多态
		p1.setName("li");//Teacher当Person用
		p1.setAge(20);//父类中定义可以用
		//p1.setSal(3000.0);//子类中定义的不能用
		Person p2 = new Person();
		if(p1 instanceof Teacher){//p1指向的对象的类型
		    Teacher t1 = (Teacher) p1;
		    t1.setSal(3000.0);
		}
		System.out.println(p1.getMessage());//调重写后的
		if(p2 instanceof Teacher){//p2指向的对象的类型
		    Teacher t2 = (Teacher) p2;
		    t2.setSal(2000);
		}
	}//在类型转换前，用instanceof判断对象类型，保证成功
}
