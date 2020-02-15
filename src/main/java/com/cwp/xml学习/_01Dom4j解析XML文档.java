package com.cwp.xml学习;

import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class _01Dom4j解析XML文档 {

	public static void main(String[] args) {
		//创建解析器
		SAXReader saxReader = new SAXReader();
		
		try {
			//通过解析器的read方法将配置文件读取到内存中，生成一个Document[org.dom4j]对象树
			Document document = saxReader.read("WebContent\\WEB-INF\\web.xml");
			//获取根节点
			Element elements = document.getRootElement();
			//开始遍历根节点
			Iterator<Element> iterator = elements.elementIterator();
			while(iterator.hasNext()){
				//获取每个父节点
				Element element = iterator.next();
				//遍历父节点里面的每个子节点
				Iterator innerElt = element.elementIterator();
				while(innerElt.hasNext()){
					//获取每个子节点
					Element obj = (Element) innerElt.next();
					//获取每个元素的文本值
					System.out.println(obj.getStringValue());
				}
				System.out.println("----------------------------");
			}
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
		
	}

}
