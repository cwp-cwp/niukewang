package com.cwp.xmlѧϰ;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class _03SysConfigParserϵͳ�����ļ�����ͨ��·�� {

	public static void main(String[] args) {
		// ����������
		SAXReader saxReader = new SAXReader();

		try {
			// ͨ����������read�����������ļ���ȡ���ڴ��У�����һ��Dcoumente��org.dom4j��������
			Document document = saxReader.read("WebContent\\WEB-INF\\MySQL.xml");
			/*
			 * driver-name�ڵ�Ԫ�ص�·����config -> database-info -> driver-name
			 * driver-name�ڵ�Ԫ�ص�xpath·����/config/database-info/driver-name
			 */
			Element element = (Element) document.selectSingleNode("/config/database-info/driver-name");
			// ��ȡdriverNameElt�ڵ�Ԫ�ض�����ı�����
			String driverNameValue = element.getStringValue();
			System.out.println(driverNameValue);
			
			/*
			 * url�ڵ�Ԫ�ص�·���� config -> database-info -> url url�ڵ�Ԫ�ص�xpath·����
			 * /config/database-info/url url�ڵ�Ԫ�ص�xpath·���� config//url
			 * url�ڵ�Ԫ�ص�xpath·���� //url
			 */
			Node urlNode = document.selectSingleNode("config//url");
			String urlValue = urlNode.getStringValue();//��ȡ�ڵ��������
			System.out.println(urlValue);
			
			/*
			 * user�ڵ�Ԫ�ص�·��:config -> database-info -> user
			 * user�ڵ�Ԫ�ص�xpath·��:/config/database-info/user
			 * user�ڵ�Ԫ�ص�xpath·��:config//user user�ڵ�Ԫ�ص�xpath·��://user
			 */
			Node userNode = document.selectSingleNode("//user");
			String userValue = userNode.getText();//��ȡ�ı�ֵ
			System.out.println(userValue);
			
			Node passwordNode = document.selectSingleNode("config//password");
			String passwordValue = passwordNode.getText();
			System.out.println(passwordValue);
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}

	}

}
