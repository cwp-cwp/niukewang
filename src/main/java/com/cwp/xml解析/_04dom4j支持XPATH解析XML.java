package com.cwp.xml解析;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/*
 * 默认请况下，dom4j 是不支持 XPATH 的，
 * 如果要在 dom4j 下使用 XPATH ,需要导入支持 XPATH 的 jar 包 jaxen-1.1-beta-7.jar
 * 
 * selectNodes("//name");//获取所有的 <name>  (XPATH语法查看帮助文档)
 * selectSingleNode("//p1/name");//获取 <p1> 下的一个 <name>
 */
public class _04dom4j支持XPATH解析XML {
	/*
	 * 查询 Person.xml 中的所有 <name> 的文本内容
	 */
	@Test
	public void test1() throws Exception{
		//1.创建解析器
		SAXReader reader = new SAXReader();
		
		//2.得到 document 对象
		Document document = reader.read("Person.xml");
		
		List<Node> list =  document.selectNodes("//name");//获取所有的 <name>
		for (Node node : list) {
			String name = node.getText();//获取文本内容
			System.out.print(name + " ");//张学友 刘德华 谭咏麟 
		}
	}
	/*
	 * 查询 Person.xml 的 <p1> 下的 <name> 的文本内容
	 */
	@Test
	public void test2() throws Exception{
		//1.创建解析器
		SAXReader reader = new SAXReader();
		
		//2.得到 document 对象
		Document document = reader.read("Person.xml");
		
		Node node = document.selectSingleNode("//p1/name");//获取 <p1> 下的一个 <name>
		String name = node.getText();//获取元素节点的文本内容
		System.out.println(name);//张学友
	}
}
