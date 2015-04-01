package day17;
import java.io.*;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import java.lang.reflect.Method;
public class MyWeb {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("«Î ‰»ÎURL£∫");
		String url = br.readLine();
		br.close();
		SAXBuilder sax = new SAXBuilder();
		Document doc = sax.build("c:/zlm/web.xml");
		Element root = doc.getRootElement();
		String myURL = root.getAttributeValue("url");
		String mapping = url.substring(myURL.length());
		System.out.println(mapping);
		String cName = null;
		List<Element> list = root.getChildren("servlet");
		for(Element servlet : list){
			String u = servlet.getChildTextTrim("url");
			if(mapping.equals(u)){
				cName = servlet.getChildTextTrim("class");
				break;
			}
		}
		if(cName!=null){
		    Class c = Class.forName(cName);
		    Object obj = c.newInstance();
		    Method m = c.getMethod("service");
		    m.invoke(obj);
		}else{
			System.out.println("Õ¯÷∑¥ÌŒÛ£¨«Î÷ÿ–¬ ‰»Î");
		}
	}
}
