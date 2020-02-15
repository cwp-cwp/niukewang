package com.cwp.xmlѧϰ;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class _02MySAXParserJDK�Դ�����չ������ {

	public static void main(String[] args) {
		// ��������������
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

		try {
			// ����������
			SAXParser saxParser = saxParserFactory.newSAXParser();
			// ͨ����������parser����
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
