package com.cwp.xml学习;

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
public class _06XPath对象解析XML {

	// 创建解析工厂
	static DocumentBuilderFactory documentBuilderFactory;
	// 创建解析器
	static DocumentBuilder documentBuilder;
	// 创建XPath对象
	static XPath xPath;
	// 生成一个Document[org.w3c.dom]对象树
	static Document document;
	static {
		try {
			// 创建解析工厂
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			// 创建解析器
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
			// 通过解析器读取配置文件,生成一个Document[org.w3c.dom]对象树
			document = documentBuilder.parse("WebContent\\WEB-INF\\books.xml");
			// 创建XPath对象
			xPath = XPathFactory.newInstance().newXPath();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*
	 * 1. 获取bookstore节点下book属性category值为web下的第二个title节点的文本内容 bookstore ->
	 * book[@category='web'][2] -> title
	 * xpath路径：/bookstore/book[@category='web'][2]/title/text()
	 */
	public static void main(String[] args) throws Exception {

		// evaluate(expression, item, returnType);
		// 参数：
		// expression - XPath 表达式
		// item - 开始上下文（例如节点）
		// returnType - 所需的返回类型
		String titlePath = "/bookstore/book[@category='web'][2]/title/text()";
		String titleValue = (String) xPath.evaluate(titlePath, document,
				XPathConstants.STRING);
		System.out.println(titleValue);
	}

	/*
	 * 2.获取bookstore节点下book属性category值为web的titile属性为en的节点内容 bookstore ->
	 * book[@category='web'] -> title[@lang='en']
	 * xpath路径：/bookstore/book[@category='web']/title[@lang='en']/text()
	 */
	@Test
	public void test1() throws XPathExpressionException {
		String titleLangXpath = "/bookstore/book[@category='web']/title[@lang='en']/text()";
		String titleLangValue = (String) xPath.evaluate(titleLangXpath,
				document, XPathConstants.STRING);
		System.out.println(titleLangValue);
	}

	/*
	 * 3.获取bookstore下book属性category值为cooking的title的lang属性的值 bookstore ->
	 * book[@category='cooking'] -> title ->@lang
	 * xpath路径：/bookstore/book[@category='cooking']/title/@lang
	 */
	@Test
	public void test2() throws XPathExpressionException {
		String titleLangAttrXpath = "/bookstore/book[@category='cooking']/title/@lang";
		String titleLangAttrValue = (String) xPath.evaluate(titleLangAttrXpath,
				document, XPathConstants.STRING);
		System.out.println(titleLangAttrValue);
	}

	/*
	 * 4.获取bookstore节点下所有book的节点集合 /bookstore/book
	 */
	@Test
	public void test3() throws XPathExpressionException {
		NodeList bookList = (NodeList) xPath.evaluate("/bookstore/book",
				document, XPathConstants.NODESET);
		// 开始遍历bookList
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
