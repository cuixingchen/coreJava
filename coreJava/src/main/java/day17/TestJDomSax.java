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
			SAXBuilder sax = new SAXBuilder();//创建一个Sa
			Document doc = sax.build(filePath);//得到Document对应xml
			Element el = doc.getRootElement();//得到根节点,对应books
			List<Element> list = el.getChildren("book");//得到book节点集
		    for(Element book : list){//取出所有的book
		    	//取属性,并修改
		    	String email = book.getAttributeValue("email");
		    	System.out.println(email);
		    	book.setAttribute("email","zhang@1.net");
		    	//取子节点,并修改
		    	String name = book.getChildTextTrim("name");
		    	System.out.println(name);
		    	Element ele = book.getChild("name");
		    	ele.setText("zhang");
		    }
		    //输出修改后的结果
		    XMLOutputter out = new XMLOutputter();
		    out.output(doc,new FileOutputStream(filePath));
		}catch(Exception ee){
			ee.printStackTrace();
		}
	}
}
