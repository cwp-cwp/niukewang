package com.cwp.xmlѧϰ;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

@SuppressWarnings("Duplicates")
public class _06XPath�������XML {

	// ������������
	static DocumentBuilderFactory documentBuilderFactory;
	// ����������
	static DocumentBuilder documentBuilder;
	// ����XPath����
	static XPath xPath;
	// ����һ��Document[org.w3c.dom]������
	static Document document;
	static {
		try {
			// ������������
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			// ����������
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
			// ͨ����������ȡ�����ļ�,����һ��Document[org.w3c.dom]������
			document = documentBuilder.parse("WebContent\\WEB-INF\\books.xml");
			// ����XPath����
			xPath = XPathFactory.newInstance().newXPath();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*
	 * 1. ��ȡbookstore�ڵ���book����categoryֵΪweb�µĵڶ���title�ڵ���ı����� bookstore ->
	 * book[@category='web'][2] -> title
	 * xpath·����/bookstore/book[@category='web'][2]/title/text()
	 */
	public static void main(String[] args) throws Exception {

		// evaluate(expression, item, returnType);
		// ������
		// expression - XPath ���ʽ
		// item - ��ʼ�����ģ�����ڵ㣩
		// returnType - ����ķ�������
		String titlePath = "/bookstore/book[@category='web'][2]/title/text()";
		String titleValue = (String) xPath.evaluate(titlePath, document,
				XPathConstants.STRING);
		System.out.println(titleValue);
	}

	/*
	 * 2.��ȡbookstore�ڵ���book����categoryֵΪweb��titile����Ϊen�Ľڵ����� bookstore ->
	 * book[@category='web'] -> title[@lang='en']
	 * xpath·����/bookstore/book[@category='web']/title[@lang='en']/text()
	 */
	@Test
	public void test1() throws XPathExpressionException {
		String titleLangXpath = "/bookstore/book[@category='web']/title[@lang='en']/text()";
		String titleLangValue = (String) xPath.evaluate(titleLangXpath,
				document, XPathConstants.STRING);
		System.out.println(titleLangValue);
	}

	/*
	 * 3.��ȡbookstore��book����categoryֵΪcooking��title��lang���Ե�ֵ bookstore ->
	 * book[@category='cooking'] -> title ->@lang
	 * xpath·����/bookstore/book[@category='cooking']/title/@lang
	 */
	@Test
	public void test2() throws XPathExpressionException {
		String titleLangAttrXpath = "/bookstore/book[@category='cooking']/title/@lang";
		String titleLangAttrValue = (String) xPath.evaluate(titleLangAttrXpath,
				document, XPathConstants.STRING);
		System.out.println(titleLangAttrValue);
	}

	/*
	 * 4.��ȡbookstore�ڵ�������book�Ľڵ㼯�� /bookstore/book
	 */
	@Test
	public void test3() throws XPathExpressionException {
		NodeList bookList = (NodeList) xPath.evaluate("/bookstore/book",
				document, XPathConstants.NODESET);
		// ��ʼ����bookList
		for (int i = 0; i < bookList.getLength(); i++) {
			Element bookElt = (Element) bookList.item(i);
			String titleValue01 = (String) xPath.evaluate("title", bookElt,
					XPathConstants.STRING);
			String authorValue = (String) xPath.evaluate("author", bookElt,
					XPathConstants.STRING);
			String year = (String) xPath.evaluate("year", bookElt,
					XPathConstants.STRING);
			String price = (String) xPath.evaluate("price", bookElt,
					XPathConstants.STRING);
			
			System.out.println(titleValue01 + " " + authorValue + " " + year
					+ " " + price);
			System.out.println("---------------");
		}
	}

}
