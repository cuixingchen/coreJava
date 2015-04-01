package day17;

import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class StudentParser {
	public static void main(String[] args) throws Exception{
		SAXBuilder sax = new SAXBuilder();
		Document doc = sax.build("c:/zlm/student.xml");
		Element root = doc.getRootElement();
		List<Element> list = root.getChildren("student");
		for(Element stu : list){
			String name = stu.getChildTextTrim("name");
			String sex = stu.getChildTextTrim("sex");
			System.out.println("���֣�"+name);
			System.out.println("�Ա�"+sex);
			List<Element> lesson = stu.getChildren("lesson");
			for(Element less : lesson){
				String lName = less.getChildTextTrim("lessonName");
				String lScore = less.getChildTextTrim("lessonScore");
				System.out.println("�γ�����"+lName);
				System.out.println("������"+lScore);
			}
			System.out.println("__________________");
		}//��ϰ2����JDOM����hibernatemap.xml
	}
}
