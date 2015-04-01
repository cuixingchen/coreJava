package day17;

import org.xml.sax.*;

public class XMLContentHandler implements ContentHandler {
	
	//DTD中定义的元素名
    private static final String ELEMENT_NAME = "name";
    private static final String ELEMENT_SEX = "sex";
    private static final String ELEMENT_LESSON = "lesson";
    private static final String ELEMENT_LESSON_NAME = "lessonName";
    private static final String ELEMENT_LESSON_SCORE = "lessonScore";
    private static final String ELEMENT_STUDENT = "student";
    private static final String ELEMENT_LINE = "breakLine";
 	
 	//当前元素的数据
    private String currentData = "";
    private String lessonName = "";
    private String lessonScore = "";

     /**
     * 当其他某一个调用事件发生时，先调用此方法来在文档中定位。
     * @param locator
     */
    public void setDocumentLocator(Locator locator) {

    }

    /**
     * 在解析整个文档开始时调用
     */
    public void startDocument() throws SAXException {
        System.out.println("XML文件开始解析");
    }

    /**
     * 在解析整个文档结束时调用
     */
    public void endDocument() throws SAXException {
        System.out.println("XML文件解析结束");
    }

    /**
     * 在解析命名空间开始时调用
     */
    public void startPrefixMapping(String prefix, String uri) throws
        SAXException {

    }

    /**
     * 在解析命名空间结束时调用
     */
    public void endPrefixMapping(String prefix) throws SAXException {

    }

    /**
     * 在解析元素开始时调用
     * @param namespaceURI
     * @param localName
     * @param qName
     * @param atts
     */
    public void startElement(String namespaceURI, String localName,
                             String qName, Attributes atts) throws SAXException {
       //System.out.println("Start");
    }

    /**
     * 在解析元素结束时调用
     * @param namespaceURI
     * @param localName 本地名，如student
     * @param qName 原始名
     */
    public void endElement(String namespaceURI, String localName, String qName) throws
        SAXException {
        if (localName.equals(ELEMENT_NAME)) {
            System.out.println(localName + ":" + currentData);
        }

        else if (localName.equals(ELEMENT_SEX)) {
            System.out.println(localName + ":" + currentData);
        }

        else if (localName.equals(ELEMENT_LESSON_NAME)) {
            this.lessonName = currentData;
        }

        else if (localName.equals(ELEMENT_LESSON_SCORE)) {
            this.lessonScore = currentData;
        }

        else if (localName.equals(ELEMENT_LESSON)) {
            System.out.println(lessonName + ":" + lessonScore);
        }

        else if (localName.equals(ELEMENT_LINE)) {
            System.out.println("------------------------------------");
        }
    }

    /**
     * 取得元素数据
     * @param ch
     * @param start
     * @param length
     */
    public void characters(char[] ch, int start, int length) throws
        SAXException {
    	//System.out.println("gogo");
        currentData = new String(ch, start, length).trim();
    }

    /**
     * 取得元素数据中的空白
     * @param ch
     * @param start
     * @param length
     */
    public void ignorableWhitespace(char[] ch, int start, int length) throws
        SAXException {

    }

    /**
     * 在解析到处理指令时，调用此方法。
     * 这些处理指令不包括XML的版权指令，它由解析器本身识别。
     * @param target
     * @param data
     */
    public void processingInstruction(String target, String data) throws
        SAXException {

    }

    /**
     * 当未验证解析器忽略实体时调用此方法
     * @param name
     */
    public void skippedEntity(String name) throws SAXException {

    }
}