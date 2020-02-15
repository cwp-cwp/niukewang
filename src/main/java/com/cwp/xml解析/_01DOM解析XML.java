package com.cwp.xml解析;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/*
 * 使用jdk自带的扩展包解析 xml 文件
 * 
 * 解析步骤：
 * 		①创建解析工厂
 * 		②创建解析器
 * 		③执行 parse() 方法进行解析
 */
public class _01DOM解析XML {
	/*
	 * 解析 Person.xml文件获取元素节点
	 */
	@Test
	public void test1() throws Exception{
		//1.创建解析工厂对象
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		//2.创建解析器
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		//3.解析 xml 文件返回 document 对象
		Document document = builder.parse("Person.xml");
		
		//获取 name 节点(数组)
		NodeList nodeList = document.getElementsByTagName("name");
		
		//遍历节点
		for(int i = 0; i < nodeList.getLength(); i++){
			//item(index),返回该 NodeList 中 index 位置处的节点
			Node node = nodeList.item(i);
			
			//getTextContent(),返回节点的文本内容
			String name = node.getTextContent();
			
			System.out.println(name);//张学友 刘德华 谭咏麟

		}
	}
	
	/*
	 * 解析 Person.xml 文件，在 <p1> 标签下(末尾)创建一个新的节点 <sex>男</sex>
	 */
	@Test
	public void test2() throws Exception{
		//1.创建解析工厂
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		//2.创建解析器
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		//3.解析 xml 文件
		Document document = builder.parse("Person.xml");
		
		//获取 <p1> 标签(数组)
		NodeList nodeList = document.getElementsByTagName("p1");
		
		//获取第一个<p1>标签
		Node p1 = nodeList.item(0);
		
		//创建节点<sex>男</sex>
		Element sex = document.createElement("sex");//创建元素节点
		Text text = document.createTextNode("男");//创建文本节点
		sex.appendChild(text);// <sex>元素中加入文本内容
		p1.appendChild(sex);//<p1>元素节点中加入<sex>
		
		//回写 xml ,此段代码使用的时候可以粘贴
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.transform(new DOMSource(document), new StreamResult("Person.xml"));
		
	}
	
	/*
	 * 解析 xml 文件，修改 <work>歌神</work> 元素节点里的文本内容
	 */
	@Test
	public void test3() throws Exception{
		//1.创建解析工厂
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		//2.创建解析器
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		//3.解析 xml 文件
		Document document = builder.parse("Person.xml");
		
		//获取 <work>歌神</work> 元素节点
		Node work1 = document.getElementsByTagName("work").item(0);
		
		//修改 <work>歌神</work>元素节点里的文本内容
		work1.setTextContent("四大天王");
		
		//回写 xml ,此段代码使用的时候可以粘贴
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.transform(new DOMSource(document), new StreamResult("Person.xml"));
		
	}
	
	/*
	 * 解析 xml 文件，删除 <sex>男</sex> 元素节点
	 */
	@Test
	public void test4() throws Exception{
		//1.创建解析工厂
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		//2.创建解析器
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		//3.解析 xml 文件
		Document document = builder.parse("Person.xml");
		
		//获取<sex>男</sex> 元素节点
		Node sex = document.getElementsByTagName("sex").item(0);
		//获取<sex>节点的父节点
		Node parent = sex.getParentNode();
		//删除子节点
		parent.removeChild(sex);
		
		//回写 xml ,此段代码使用的时候可以粘贴
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.transform(new DOMSource(document), new StreamResult("Person.xml"));
		
	}
	
	/*
	 * 解析 xml 文件，遍历元素节点名称
	 */
	@Test
	public void test5() throws Exception{
		//1.创建解析工厂
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		//2.创建解析器
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		//3.解析 xml 文件
		Document document = builder.parse("Person.xml");
		
		//获取根节点
		Node root = document.getElementsByTagName("person").item(0);
		//获取根节点的子节点
		NodeList list = root.getChildNodes();
			
		//遍历
		for(int i = 0; i < list.getLength(); i++){
			Node node = list.item(i);
			//判断节点类型,不做判断会将空节点打印输出
			if(node.getNodeType() == Node.ELEMENT_NODE){
				String nodeName = node.getNodeName();//获取元素节点的名字
				System.out.println(nodeName);
				NodeList list2 = node.getChildNodes();
				for(int j = 0; j < list2.getLength(); j++){
					Node node2 = list2.item(j);
					//判断节点类型，不做判断会将空节点打印输出
					if(node2.getNodeType() == Node.ELEMENT_NODE){
						String node2Name = node2.getNodeName();//获取元素节点的名字
						System.out.print(node2Name + "  ");
					}
				}
				System.out.println();
			}
		}
		
	}
}
