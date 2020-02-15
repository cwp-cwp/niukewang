package com.cwp.xmlѧϰ;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class _04������ȡ����ֵ {

	public static void main(String[] args) throws Exception {
		// ����������
		SAXReader saxReader = new SAXReader();
		
		// ͨ����������read�����������ļ���ȡ���ڴ��У�����һ��Document��org.dom4j��������
		Document document = saxReader.read("WebContent\\WEB-INF\\Test.xml");

		/*
		 * ��ȡconnector�ڵ�Ԫ�ض����·����server -> service -> connector
		 * ��ȡconnector�ڵ�Ԫ�ض����xpath·����/server/service/connector
		 * ��ȡconnector�ڵ�Ԫ�ض����xpath·����server//connector
		 * ��ȡconnector�ڵ�Ԫ�ض����xpath·����//connector
		 */
		Element element = (Element) document.selectSingleNode("//connector");
		
		//��ȡconnectorElt�ڵ�Ԫ�ض����port���Զ���
		Attribute portAttribute = element.attribute("port");
		
		//��ȡportAttr���Զ����ֵ
		String portValue = portAttribute.getStringValue();
		System.out.println(portValue);//8080
		
		// attributeValue() ����ֱ�ӻ�ȡ����ֵ
		String portValue1 = element.attributeValue("port");
		System.out.println(portValue1);//8080
	}

}
