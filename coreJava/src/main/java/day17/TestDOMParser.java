package day17;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class TestDOMParser {
	public static void main(String[] args) throws Exception {
		//���ù���ģʽȡ��dom����������document����
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse("c:/zlm/student.xml");
		// ��ø��ڵ�StudentInfo
		Element elmtInfo = document.getDocumentElement();
		// �õ�����student�ڵ�,�ڵ㼯��
		NodeList nlStudent = elmtInfo.getElementsByTagName("student");
		System.out.println("XML�ļ���ʼ����");
		// ѭ�����ÿһ��ѧ���ɼ�
		for (int i = 0; i < nlStudent.getLength(); i++) {
			// ��ǰstudentԪ��
			Element elmtStudent = (Element) nlStudent.item(i);
			// Name/sex/lesson�ڵ��嵥
			NodeList nlCurrent = elmtStudent.getElementsByTagName("name");
			System.out.println("����:"
					+ nlCurrent.item(0).getFirstChild().getNodeValue());
			nlCurrent = elmtStudent.getElementsByTagName("sex");
			System.out.println("�Ա�:"
					+ nlCurrent.item(0).getFirstChild().getNodeValue());
			// ȡ��Lesson�ڵ�,����һ��,��Ҫѭ��
			nlCurrent = elmtStudent.getElementsByTagName("lesson");

			for (int j = 0; j < nlCurrent.getLength(); j++) {
				// Lesson���Ԫ�صĶ�Ӧ
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

		System.out.println("XML�ļ���������");
	}

}
