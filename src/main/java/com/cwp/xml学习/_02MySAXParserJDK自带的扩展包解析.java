package com.cwp.xml学习;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class _02MySAXParserJDK自带的扩展包解析 {

	public static void main(String[] args) {
		// 创建解析器工厂
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

		try {
			// 创建解析器
			SAXParser saxParser = saxParserFactory.newSAXParser();
			// 通过解析器的parser方法
			MyDefaultHandler dh = new MyDefaultHandler();
			saxParser.parse("WebContent\\WEB-INF\\web.xml", dh);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class MyDefaultHandler extends DefaultHandler {

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// super.startElement(uri, localName, qName, attributes);
		System.out.print("<" + qName + ">");
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// super.characters(ch, start, length);
		System.out.print(new String(ch, start, length));
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// super.endElement(uri, localName, qName);
		System.out.print("</" + qName + ">");
	}

}
