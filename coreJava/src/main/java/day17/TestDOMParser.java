package day17;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class TestDOMParser {
	public static void main(String[] args) throws Exception {
		//利用工厂模式取得dom工厂，建立document对象
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse("c:/zlm/student.xml");
		// 获得根节点StudentInfo
		Element elmtInfo = document.getDocumentElement();
		// 得到所有student节点,节点集合
		NodeList nlStudent = elmtInfo.getElementsByTagName("student");
		System.out.println("XML文件开始解析");
		// 循环输出每一个学生成绩
		for (int i = 0; i < nlStudent.getLength(); i++) {
			// 当前student元素
			Element elmtStudent = (Element) nlStudent.item(i);
			// Name/sex/lesson节点清单
			NodeList nlCurrent = elmtStudent.getElementsByTagName("name");
			System.out.println("姓名:"
					+ nlCurrent.item(0).getFirstChild().getNodeValue());
			nlCurrent = elmtStudent.getElementsByTagName("sex");
			System.out.println("性别:"
					+ nlCurrent.item(0).getFirstChild().getNodeValue());
			// 取得Lesson节点,不是一个,需要循环
			nlCurrent = elmtStudent.getElementsByTagName("lesson");

			for (int j = 0; j < nlCurrent.getLength(); j++) {
				// Lesson这个元素的对应
				Element elmtLesson = (Element) nlCurrent.item(j);
				NodeList nlLesson = elmtLesson
						.getElementsByTagName("lessonName");
				System.out.print(nlLesson.item(0).getFirstChild()
						.getNodeValue());
				System.out.print(":");
				nlLesson = elmtLesson.getElementsByTagName("lessonScore");
				System.out.print(nlLesson.item(0).getFirstChild()
						.getNodeValue());
				System.out.println();
			}

			System.out.println("------------------------------------");
		}

		System.out.println("XML文件解析结束");
	}

}
