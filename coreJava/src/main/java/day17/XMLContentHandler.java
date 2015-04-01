package day17;

import org.xml.sax.*;

public class XMLContentHandler implements ContentHandler {
	
	//DTD�ж����Ԫ����
    private static final String ELEMENT_NAME = "name";
    private static final String ELEMENT_SEX = "sex";
    private static final String ELEMENT_LESSON = "lesson";
    private static final String ELEMENT_LESSON_NAME = "lessonName";
    private static final String ELEMENT_LESSON_SCORE = "lessonScore";
    private static final String ELEMENT_STUDENT = "student";
    private static final String ELEMENT_LINE = "breakLine";
 	
 	//��ǰԪ�ص�����
    private String currentData = "";
    private String lessonName = "";
    private String lessonScore = "";

     /**
     * ������ĳһ�������¼�����ʱ���ȵ��ô˷��������ĵ��ж�λ��
     * @param locator
     */
    public void setDocumentLocator(Locator locator) {

    }

    /**
     * �ڽ��������ĵ���ʼʱ����
     */
    public void startDocument() throws SAXException {
        System.out.println("XML�ļ���ʼ����");
    }

    /**
     * �ڽ��������ĵ�����ʱ����
     */
    public void endDocument() throws SAXException {
        System.out.println("XML�ļ���������");
    }

    /**
     * �ڽ��������ռ俪ʼʱ����
     */
    public void startPrefixMapping(String prefix, String uri) throws
        SAXException {

    }

    /**
     * �ڽ��������ռ����ʱ����
     */
    public void endPrefixMapping(String prefix) throws SAXException {

    }

    /**
     * �ڽ���Ԫ�ؿ�ʼʱ����
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
     * �ڽ���Ԫ�ؽ���ʱ����
     * @param namespaceURI
     * @param localName ����������student
     * @param qName ԭʼ��
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
     * ȡ��Ԫ������
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
     * ȡ��Ԫ�������еĿհ�
     * @param ch
     * @param start
     * @param length
     */
    public void ignorableWhitespace(char[] ch, int start, int length) throws
        SAXException {

    }

    /**
     * �ڽ���������ָ��ʱ�����ô˷�����
     * ��Щ����ָ�����XML�İ�Ȩָ����ɽ���������ʶ��
     * @param target
     * @param data
     */
    public void processingInstruction(String target, String data) throws
        SAXException {

    }

    /**
     * ��δ��֤����������ʵ��ʱ���ô˷���
     * @param name
     */
    public void skippedEntity(String name) throws SAXException {

    }
}