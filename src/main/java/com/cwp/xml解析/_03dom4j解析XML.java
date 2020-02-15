package com.cwp.xml解析;

import java.io.FileOutputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

/*
 * dom4j 解析 XML 文件步骤：
 * 		①创建解析器
 * 		②得到 document 对象
 * 		③得到父节点
 * 
 * element(qname) 表示获取指定标签名下面的第一个子标签
 * elements(qname) 获取指定标签名下面的所有子标签(一层)
 * elements() 获取标签下面的所有一层子标签
 * getText() 获取元素节点里的文本内容
 * setText(String);//设置节点的文本内容
 * addElement("sex");//添加 <sex> 节点
 * DocumentHelper.createElement("email");//创建 <email>
 * element.remove(element2);//通过父元素删除子元素
 */
public class _03dom4j解析XML {
	/*
	 * 查询 Person.xml 的 <p1> 元素的 <name> 元素的值
	 */
	@Test
	public void test1() throws Exception{
		//1.创建解析器
		SAXReader reader = new SAXReader();
		
		//2.得到 document 对象
		Document document = reader.read("Person.xml");
		
		//3.得到根节点
	    Element rootElement = document.getRootElement();
	    
	    Element element = rootElement.element("p1");//获取根节点下的子标签 <p1>
	    Element element2 = element.element("name");//获取 <p1> 元素节点下的 <name> 元素节点
	    String name = element2.getText();//获取元素节点里的文本内容
		System.out.println(name);//张学友
	}
	
	/*
	 * 查询 Person.xml 的所有 <name> 元素的值
	 */
	@Test
	public void test2() throws Exception{
		//1.创建解析器
		SAXReader reader = new SAXReader();
		
		//2.得到 document 对象
		Document document = reader.read("Person.xml");
		
		//3.得到根节点
	    Element rootElement = document.getRootElement();
	    
	    List<Element> list = rootElement.elements();//获取根节点下的所有一层子标签
	    for (Element element : list) {
			Element element2 = element.element("name");//获取该标签下的 <name> 子标签
			String name = element2.getText();//获取标签的文本内容
			System.out.print(name + " ");//张学友 刘德华 谭咏麟 
		}
	}
	
	/*
	 * 向 Person.xml 的 <p1> 元素添加 <sex>男</sex>
	 */
	@Test
	public void test3() throws Exception{
		//1.创建解析器
		SAXReader reader = new SAXReader();
		
		//2.得到 document 对象
		Document document = reader.read("Person.xml");
		
		//3.得到根节点
	    Element rootElement = document.getRootElement();
	    
	    Element element = rootElement.element("p1");//获取 <p1> 节点
	    Element element2 = element.addElement("sex");//添加 <sex> 节点
	    element2.setText("男");//设置节点的文本内容
	    
	    //回写到 xml 文件中
	    OutputFormat format = OutputFormat.createPrettyPrint();//创建好看的格式
	    XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("Person.xml"), format);
	    xmlWriter.write(document);//写入到 document 中
	    xmlWriter.close();//关闭流
	    
	}
	
	/*
	 * 向 Person.xml 的 p1 元素里的 <name> 元素的后面添加 <email>zhangxueyou139.com</email>
	 */
	@Test
	public void test4() throws Exception{
		//1.创建解析器
		SAXReader reader = new SAXReader();
		
		//2.得到 document 对象
		Document document = reader.read("Person.xml");
		
		//3.得到根节点
	    Element rootElement = document.getRootElement();
	    
	    Element element = rootElement.element("p1");//获取 <p1>
	    List<Element> list = element.elements();//获取 <p1> 下的所有子标签
	    Element element2 = DocumentHelper.createElement("email");//创建 <email>
	    element2.setText("zhangxueyou139.com");//设置文本内容
	    list.add(1, element2);//在指定位置添加元素
	    
	    //回写到 xml 文件中
	    OutputFormat format = OutputFormat.createPrettyPrint();//创建好看的格式
	    XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("Person.xml"), format);
	    xmlWriter.write(document);//写入到 document 中
	    xmlWriter.close();//关闭流
	}
	
	/*
	 * 修改 Person.xml 里 <p1> 的 <age>56</age> 为 60 岁
	 */
	@Test
	public void test5() throws Exception{
		//1.创建解析器
		SAXReader reader = new SAXReader();
		
		//2.得到 document 对象
		Document document = reader.read("Person.xml");
		
		//3.得到根节点
	    Element rootElement = document.getRootElement();
	    
	    Element element = rootElement.element("p1");//获取 <p1>
	    Element element2 = element.element("age");//获取 <age>
	    element2.setText("60");//修改文本内容
	    
	    //回写到 xml 文件中
	    OutputFormat format = OutputFormat.createPrettyPrint();//创建好看的格式
	    XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("Person.xml"), format);
	    xmlWriter.write(document);//写入到 document 中
	    xmlWriter.close();//关闭流
	}
	
	/*
	 * 删除 Person.xml 的 <p1> 下的 <sex>男</sex> 
	 */
	@Test
	public void test6() throws Exception{
		//1.创建解析器
		SAXReader reader = new SAXReader();
		
		//2.得到 document 对象
		Document document = reader.read("Person.xml");
		
		//3.得到根节点
	    Element rootElement = document.getRootElement();
	    
	    Element element = rootElement.element("p1");//获取 <p1>
	    Element element2 = element.element("sex");//获取 <sex>
	    element.remove(element2);//通过父元素删除子元素
	    
	    //回写到 xml 文件中
	    OutputFormat format = OutputFormat.createPrettyPrint();//创建好看的格式
	    XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("Person.xml"), format);
	    xmlWriter.write(document);//写入到 document 中
	    xmlWriter.close();//关闭流
	}
	
	/*
	 * 查询 Person.xml 中 <p1 id="1001"> 的属性值
	 */
	@Test
	public void test7() throws Exception{
		//1.创建解析器
		SAXReader reader = new SAXReader();
		
		//2.得到 document 对象
		Document document = reader.read("Person.xml");
		
		//3.得到根节点
	    Element rootElement = document.getRootElement();
	    
	    Element element = rootElement.element("p1");//获取 <p1>
	    String id = element.attributeValue("id");//获取 id 属性的值
	    System.out.println(id);
	}

}
