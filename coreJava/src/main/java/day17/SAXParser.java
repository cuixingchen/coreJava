package day17;

import org.xml.sax.*;
import org.xml.sax.helpers.*;

public class SAXParser {

    public static void main(String[] args) throws Exception{
//    	���ù���ģʽ����SAX������
    	XMLReader read=XMLReaderFactory.createXMLReader();
		//��������ǰҪע�����ݹ�����
    	read.setContentHandler(new XMLContentHandler());
		//��ʼ�����ĵ�
        read.parse("c:/zlm/student.xml");
    }
}
