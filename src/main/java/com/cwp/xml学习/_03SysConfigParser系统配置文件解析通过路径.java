package com.cwp.xml学习;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class _03SysConfigParser系统配置文件解析通过路径 {

	public static void main(String[] args) {
		// 创建解析器
		SAXReader saxReader = new SAXReader();

		try {
			// 通过解析器的read方法将配置文件读取到内存中，生成一个Dcoumente【org.dom4j】对象树
			Document document = saxReader.read("WebContent\\WEB-INF\\MySQL.xml");
			/*
			 * driver-name节点元素的路径：config -> database-info -> driver-name
			 * driver-name节点元素的xpath路径：/config/database-info/driver-name
			 */
			Element element = (Element) document.selectSingleNode("/config/database-info/driver-name");
			// 获取driverNameElt节点元素对象的文本内容
			String driverNameValue = element.getStringValue();
			System.out.println(driverNameValue);
			
			/*
			 * url节点元素的路径： config -> database-info -> url url节点元素的xpath路径：
			 * /config/database-info/url url节点元素的xpath路径： config//url
			 * url节点元素的xpath路径： //url
			 */
			Node urlNode = document.selectSingleNode("config//url");
			String urlValue = urlNode.getStringValue();//获取节点里的内容
			System.out.println(urlValue);
			
			/*
			 * user节点元素的路径:config -> database-info -> user
			 * user节点元素的xpath路径:/config/database-info/user
			 * user节点元素的xpath路径:config//user user节点元素的xpath路径://user
			 */
			Node userNode = document.selectSingleNode("//user");
			String userValue = userNode.getText();//获取文本值
			System.out.println(userValue);
			
			Node passwordNode = document.selectSingleNode("config//password");
			String passwordValue = passwordNode.getText();
			System.out.println(passwordValue);
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}

	}

}
