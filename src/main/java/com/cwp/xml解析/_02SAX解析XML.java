package com.cwp.xml����;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.junit.Test;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*
 * SAX ��������
 * 		�ٴ�����������
 * 		�ڴ���������
 * 		��ִ�� parse() �������н���
 * 		�ܴ���һ���̳� DefaultHandler ���࣬��д�������������
 */
public class _02SAX����XML {
	/*
	 * ���� Person.xml ,��ȡ��ṹ
	 */
	@Test
	public void test1() throws Exception{
		//1.������������
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		//2.����������
		SAXParser parser = factory.newSAXParser();
		
		//3.ִ�� paerse() ����
		MyDefaultHandler dh = new  MyDefaultHandler();
		parser.parse("Person.xml", dh);
		parser.parse("Person.xml", new MyDefaultHandler2());
		
	}
}
/*
 * ���� �̳� DefaultHandler ����
 */
class MyDefaultHandler extends DefaultHandler{

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// qName Ϊ��ǩ��
		System.out.println("<" + qName + ">");
	}
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		String str = new String(ch, start, length);
		System.out.println(str);
	}
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.println("</" + qName + ">");
	}
}
/*
 * ����һ����̳� DefaultHandler, ��ȡ <name>��ǩ������
 */
class MyDefaultHandler2 extends DefaultHandler{

	Boolean flag = false;
	
	//��ȡ��һ�� <name>
	int index = 0;
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if("name".equals(qName)){
			flag = true;
		}
	}
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		if(flag == true && index == 0){
			System.out.println(new String(ch, start, length));
		}
	}
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		flag = false;
		index++;
	}

	
}
