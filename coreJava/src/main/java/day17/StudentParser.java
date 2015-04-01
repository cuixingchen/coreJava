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
			System.out.println("名字："+name);
			System.out.println("性别："+sex);
			List<Element> lesson = stu.getChildren("lesson");
			for(Element less : lesson){
				String lName = less.getChildTextTrim("lessonName");
				String lScore = less.getChildTextTrim("lessonScore");
				System.out.println("课程名："+lName);
				System.out.println("分数："+lScore);
			}
			System.out.println("__________________");
		}//练习2：用JDOM解析hibernatemap.xml
	}
}
