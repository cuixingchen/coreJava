package day6.tarena.com;

public class TestPo {
	public static void main(String[] args) {
		Person p1 = new Teacher("zhangfei",30,5000);//��̬
		p1.setName("li");//Teacher��Person��
		p1.setAge(20);//�����ж��������
		//p1.setSal(3000.0);//�����ж���Ĳ�����
		Person p2 = new Person();
		if(p1 instanceof Teacher){//p1ָ��Ķ��������
		    Teacher t1 = (Teacher) p1;
		    t1.setSal(3000.0);
		}
		System.out.println(p1.getMessage());//����д���
		if(p2 instanceof Teacher){//p2ָ��Ķ��������
		    Teacher t2 = (Teacher) p2;
		    t2.setSal(2000);
		}
	}//������ת��ǰ����instanceof�ж϶������ͣ���֤�ɹ�
}
