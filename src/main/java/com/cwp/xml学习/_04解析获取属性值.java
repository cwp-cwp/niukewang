package com.cwp.xml学习;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class _04解析获取属性值 {

	public static void main(String[] args) throws Exception {
		// 创建解析器
		SAXReader saxReader = new SAXReader();
		
		// 通过解析器的read方法将配置文件读取到内存中，生成一个Document【org.dom4j】对象树
		Document document = saxReader.read("WebContent\\WEB-INF\\Test.xml");

		/*
		 * 获取connector节点元素对象的路径：server -> service -> connector
		 * 获取connector节点元素对象的xpath路径：/server/service/connector
		 * 获取connector节点元素对象的xpath路径：server//connector
		 * 获取connector节点元素对象的xpath路径：//connector
		 */
		Element element = (Element) document.selectSingleNode("//connector");
		
		//获取connectorElt节点元素对象的port属性对象
		Attribute portAttribute = element.attribute("port");
		
		//获取portAttr属性对象的值
		String portValue = portAttribute.getStringValue();
		System.out.println(portValue);//8080
		
		// attributeValue() 方法直接获取属性值
		String portValue1 = element.attributeValue("port");
		System.out.println(portValue1);//8080
	}

}
