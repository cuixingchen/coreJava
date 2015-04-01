package day17;

import java.io.FileOutputStream;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public class TestJDomSax {
	public static void main(String[] args) {
		String filePath = "c:/zlm/lib.xml";
		try{
			SAXBuilder sax = new SAXBuilder();//����һ��Sa
			Document doc = sax.build(filePath);//�õ�Document��Ӧxml
			Element el = doc.getRootElement();//�õ����ڵ�,��Ӧbooks
			List<Element> list = el.getChildren("book");//�õ�book�ڵ㼯
		    for(Element book : list){//ȡ�����е�book
		    	//ȡ����,���޸�
		    	String email = book.getAttributeValue("email");
		    	System.out.println(email);
		    	book.setAttribute("email","zhang@1.net");
		    	//ȡ�ӽڵ�,���޸�
		    	String name = book.getChildTextTrim("name");
		    	System.out.println(name);
		    	Element ele = book.getChild("name");
		    	ele.setText("zhang");
		    }
		    //����޸ĺ�Ľ��
		    XMLOutputter out = new XMLOutputter();
		    out.output(doc,new FileOutputStream(filePath));
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}
}
