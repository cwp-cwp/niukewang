package com.cwp.xmlѧϰ;

import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class _01Dom4j����XML�ĵ� {

	public static void main(String[] args) {
		//����������
		SAXReader saxReader = new SAXReader();
		
		try {
			//ͨ����������read�����������ļ���ȡ���ڴ��У�����һ��Document[org.dom4j]������
			Document document = saxReader.read("WebContent\\WEB-INF\\web.xml");
			//��ȡ���ڵ�
			Element elements = document.getRootElement();
			//��ʼ�������ڵ�
			Iterator<Element> iterator = elements.elementIterator();
			while(iterator.hasNext()){
				//��ȡÿ�����ڵ�
				Element element = iterator.next();
				//�������ڵ������ÿ���ӽڵ�
				Iterator innerElt = element.elementIterator();
				while(innerElt.hasNext()){
					//��ȡÿ���ӽڵ�
					Element obj = (Element) innerElt.next();
					//��ȡÿ��Ԫ�ص��ı�ֵ
					System.out.println(obj.getStringValue());
				}
				System.out.println("----------------------------");
			}
			
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
		
	}

}
