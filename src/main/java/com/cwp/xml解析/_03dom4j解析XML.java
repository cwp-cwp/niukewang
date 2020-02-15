package com.cwp.xml����;

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
 * dom4j ���� XML �ļ����裺
 * 		�ٴ���������
 * 		�ڵõ� document ����
 * 		�۵õ����ڵ�
 * 
 * element(qname) ��ʾ��ȡָ����ǩ������ĵ�һ���ӱ�ǩ
 * elements(qname) ��ȡָ����ǩ������������ӱ�ǩ(һ��)
 * elements() ��ȡ��ǩ���������һ���ӱ�ǩ
 * getText() ��ȡԪ�ؽڵ�����ı�����
 * setText(String);//���ýڵ���ı�����
 * addElement("sex");//��� <sex> �ڵ�
 * DocumentHelper.createElement("email");//���� <email>
 * element.remove(element2);//ͨ����Ԫ��ɾ����Ԫ��
 */
public class _03dom4j����XML {
	/*
	 * ��ѯ Person.xml �� <p1> Ԫ�ص� <name> Ԫ�ص�ֵ
	 */
	@Test
	public void test1() throws Exception{
		//1.����������
		SAXReader reader = new SAXReader();
		
		//2.�õ� document ����
		Document document = reader.read("Person.xml");
		
		//3.�õ����ڵ�
	    Element rootElement = document.getRootElement();
	    
	    Element element = rootElement.element("p1");//��ȡ���ڵ��µ��ӱ�ǩ <p1>
	    Element element2 = element.element("name");//��ȡ <p1> Ԫ�ؽڵ��µ� <name> Ԫ�ؽڵ�
	    String name = element2.getText();//��ȡԪ�ؽڵ�����ı�����
		System.out.println(name);//��ѧ��
	}
	
	/*
	 * ��ѯ Person.xml ������ <name> Ԫ�ص�ֵ
	 */
	@Test
	public void test2() throws Exception{
		//1.����������
		SAXReader reader = new SAXReader();
		
		//2.�õ� document ����
		Document document = reader.read("Person.xml");
		
		//3.�õ����ڵ�
	    Element rootElement = document.getRootElement();
	    
	    List<Element> list = rootElement.elements();//��ȡ���ڵ��µ�����һ���ӱ�ǩ
	    for (Element element : list) {
			Element element2 = element.element("name");//��ȡ�ñ�ǩ�µ� <name> �ӱ�ǩ
			String name = element2.getText();//��ȡ��ǩ���ı�����
			System.out.print(name + " ");//��ѧ�� ���»� ̷ӽ�� 
		}
	}
	
	/*
	 * �� Person.xml �� <p1> Ԫ����� <sex>��</sex>
	 */
	@Test
	public void test3() throws Exception{
		//1.����������
		SAXReader reader = new SAXReader();
		
		//2.�õ� document ����
		Document document = reader.read("Person.xml");
		
		//3.�õ����ڵ�
	    Element rootElement = document.getRootElement();
	    
	    Element element = rootElement.element("p1");//��ȡ <p1> �ڵ�
	    Element element2 = element.addElement("sex");//��� <sex> �ڵ�
	    element2.setText("��");//���ýڵ���ı�����
	    
	    //��д�� xml �ļ���
	    OutputFormat format = OutputFormat.createPrettyPrint();//�����ÿ��ĸ�ʽ
	    XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("Person.xml"), format);
	    xmlWriter.write(document);//д�뵽 document ��
	    xmlWriter.close();//�ر���
	    
	}
	
	/*
	 * �� Person.xml �� p1 Ԫ����� <name> Ԫ�صĺ������ <email>zhangxueyou139.com</email>
	 */
	@Test
	public void test4() throws Exception{
		//1.����������
		SAXReader reader = new SAXReader();
		
		//2.�õ� document ����
		Document document = reader.read("Person.xml");
		
		//3.�õ����ڵ�
	    Element rootElement = document.getRootElement();
	    
	    Element element = rootElement.element("p1");//��ȡ <p1>
	    List<Element> list = element.elements();//��ȡ <p1> �µ������ӱ�ǩ
	    Element element2 = DocumentHelper.createElement("email");//���� <email>
	    element2.setText("zhangxueyou139.com");//�����ı�����
	    list.add(1, element2);//��ָ��λ�����Ԫ��
	    
	    //��д�� xml �ļ���
	    OutputFormat format = OutputFormat.createPrettyPrint();//�����ÿ��ĸ�ʽ
	    XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("Person.xml"), format);
	    xmlWriter.write(document);//д�뵽 document ��
	    xmlWriter.close();//�ر���
	}
	
	/*
	 * �޸� Person.xml �� <p1> �� <age>56</age> Ϊ 60 ��
	 */
	@Test
	public void test5() throws Exception{
		//1.����������
		SAXReader reader = new SAXReader();
		
		//2.�õ� document ����
		Document document = reader.read("Person.xml");
		
		//3.�õ����ڵ�
	    Element rootElement = document.getRootElement();
	    
	    Element element = rootElement.element("p1");//��ȡ <p1>
	    Element element2 = element.element("age");//��ȡ <age>
	    element2.setText("60");//�޸��ı�����
	    
	    //��д�� xml �ļ���
	    OutputFormat format = OutputFormat.createPrettyPrint();//�����ÿ��ĸ�ʽ
	    XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("Person.xml"), format);
	    xmlWriter.write(document);//д�뵽 document ��
	    xmlWriter.close();//�ر���
	}
	
	/*
	 * ɾ�� Person.xml �� <p1> �µ� <sex>��</sex> 
	 */
	@Test
	public void test6() throws Exception{
		//1.����������
		SAXReader reader = new SAXReader();
		
		//2.�õ� document ����
		Document document = reader.read("Person.xml");
		
		//3.�õ����ڵ�
	    Element rootElement = document.getRootElement();
	    
	    Element element = rootElement.element("p1");//��ȡ <p1>
	    Element element2 = element.element("sex");//��ȡ <sex>
	    element.remove(element2);//ͨ����Ԫ��ɾ����Ԫ��
	    
	    //��д�� xml �ļ���
	    OutputFormat format = OutputFormat.createPrettyPrint();//�����ÿ��ĸ�ʽ
	    XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("Person.xml"), format);
	    xmlWriter.write(document);//д�뵽 document ��
	    xmlWriter.close();//�ر���
	}
	
	/*
	 * ��ѯ Person.xml �� <p1 id="1001"> ������ֵ
	 */
	@Test
	public void test7() throws Exception{
		//1.����������
		SAXReader reader = new SAXReader();
		
		//2.�õ� document ����
		Document document = reader.read("Person.xml");
		
		//3.�õ����ڵ�
	    Element rootElement = document.getRootElement();
	    
	    Element element = rootElement.element("p1");//��ȡ <p1>
	    String id = element.attributeValue("id");//��ȡ id ���Ե�ֵ
	    System.out.println(id);
	}

}
