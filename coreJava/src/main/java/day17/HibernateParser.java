package day17;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
public class HibernateParser {
	public static void main(String[] args) throws Exception{
		SAXBuilder sax = new SAXBuilder();
		Document doc = sax.build("c:/zlm/hibernatemap.xml");
		Element root = doc.getRootElement();
		Element cla = root.getChild("class");
		String name = cla.getAttributeValue("name");
		String table = cla.getAttributeValue("table");
		String schema = cla.getAttributeValue("schema");
		System.out.print("name:"+name);
		System.out.print("  table:"+table);
		System.out.println("  schema:"+schema);
		Element id = cla.getChild("id");
		name = id.getAttributeValue("name");
		String type = id.getAttributeValue("type");
		System.out.print("name:"+name);
		System.out.println("  type:"+type);
		Element column = id.getChild("column");
		name = column.getAttributeValue("name");
		String precision = column.getAttributeValue("precision");
		String scale = column.getAttributeValue("scale");
		System.out.print("name:"+name);
		System.out.print("  precision:"+precision);
		System.out.println("  scale:"+scale);
		Element generator = id.getChild("generator");
		String clas = generator.getAttributeValue("class");
		System.out.println("  class:"+clas);
		Element param = generator.getChild("param");
		name = param.getAttributeValue("name"); 
		System.out.println("name:"+name);
		String value = param.getValue();
		System.out.println("param:"+value);
		List<Element> list = cla.getChildren("property");
		for(Element pro : list){
			name = pro.getAttributeValue("name");
			type = pro.getAttributeValue("type");
			System.out.print("name:"+name);
			System.out.println("  type:"+type);
			column = pro.getChild("column");
			name = column.getAttributeValue("name");
			String length = column.getAttributeValue("length");
			System.out.print("name:"+name);
			System.out.println("  length:"+length);
		}
	}

}
