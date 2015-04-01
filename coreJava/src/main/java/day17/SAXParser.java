package day17;

import org.xml.sax.*;
import org.xml.sax.helpers.*;

public class SAXParser {

    public static void main(String[] args) throws Exception{
//    	利用工厂模式加载SAX解析器
    	XMLReader read=XMLReaderFactory.createXMLReader();
		//处理内容前要注册内容管理器
    	read.setContentHandler(new XMLContentHandler());
		//开始解析文档
        read.parse("c:/zlm/student.xml");
    }
}
