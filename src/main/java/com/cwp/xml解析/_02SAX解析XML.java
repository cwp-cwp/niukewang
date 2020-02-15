package com.cwp.xml解析;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.junit.Test;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*
 * SAX 解析步骤
 * 		①创建解析工厂
 * 		②创建解析器
 * 		③执行 parse() 方法进行解析
 * 		④创建一个继承 DefaultHandler 的类，重写里面的三个方法
 */
public class _02SAX解析XML {
	/*
	 * 解析 Person.xml ,获取其结构
	 */
	@Test
	public void test1() throws Exception{
		//1.创建解析工厂
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		//2.创建解析器
		SAXParser parser = factory.newSAXParser();
		
		//3.执行 paerse() 方法
		MyDefaultHandler dh = new  MyDefaultHandler();
		parser.parse("Person.xml", dh);
		parser.parse("Person.xml", new MyDefaultHandler2());
		
	}
}
/*
 * 创建 继承 DefaultHandler 的类
 */
class MyDefaultHandler extends DefaultHandler{

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// qName 为标签名
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
 * 创建一个类继承 DefaultHandler, 获取 <name>标签的内容
 */
class MyDefaultHandler2 extends DefaultHandler{

	Boolean flag = false;
	
	//获取第一个 <name>
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
