package com.cwp.xml����;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/*
 * Ĭ������£�dom4j �ǲ�֧�� XPATH �ģ�
 * ���Ҫ�� dom4j ��ʹ�� XPATH ,��Ҫ����֧�� XPATH �� jar �� jaxen-1.1-beta-7.jar
 * 
 * selectNodes("//name");//��ȡ���е� <name>  (XPATH�﷨�鿴�����ĵ�)
 * selectSingleNode("//p1/name");//��ȡ <p1> �µ�һ�� <name>
 */
public class _04dom4j֧��XPATH����XML {
	/*
	 * ��ѯ Person.xml �е����� <name> ���ı�����
	 */
	@Test
	public void test1() throws Exception{
		//1.����������
		SAXReader reader = new SAXReader();
		
		//2.�õ� document ����
		Document document = reader.read("Person.xml");
		
		List<Node> list =  document.selectNodes("//name");//��ȡ���е� <name>
		for (Node node : list) {
			String name = node.getText();//��ȡ�ı�����
			System.out.print(name + " ");//��ѧ�� ���»� ̷ӽ�� 
		}
	}
	/*
	 * ��ѯ Person.xml �� <p1> �µ� <name> ���ı�����
	 */
	@Test
	public void test2() throws Exception{
		//1.����������
		SAXReader reader = new SAXReader();
		
		//2.�õ� document ����
		Document document = reader.read("Person.xml");
		
		Node node = document.selectSingleNode("//p1/name");//��ȡ <p1> �µ�һ�� <name>
		String name = node.getText();//��ȡԪ�ؽڵ���ı�����
		System.out.println(name);//��ѧ��
	}
}
