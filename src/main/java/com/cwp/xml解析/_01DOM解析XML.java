package com.cwp.xml����;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/*
 * ʹ��jdk�Դ�����չ������ xml �ļ�
 * 
 * �������裺
 * 		�ٴ�����������
 * 		�ڴ���������
 * 		��ִ�� parse() �������н���
 */
public class _01DOM����XML {
	/*
	 * ���� Person.xml�ļ���ȡԪ�ؽڵ�
	 */
	@Test
	public void test1() throws Exception{
		//1.����������������
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		//2.����������
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		//3.���� xml �ļ����� document ����
		Document document = builder.parse("Person.xml");
		
		//��ȡ name �ڵ�(����)
		NodeList nodeList = document.getElementsByTagName("name");
		
		//�����ڵ�
		for(int i = 0; i < nodeList.getLength(); i++){
			//item(index),���ظ� NodeList �� index λ�ô��Ľڵ�
			Node node = nodeList.item(i);
			
			//getTextContent(),���ؽڵ���ı�����
			String name = node.getTextContent();
			
			System.out.println(name);//��ѧ�� ���»� ̷ӽ��

		}
	}
	
	/*
	 * ���� Person.xml �ļ����� <p1> ��ǩ��(ĩβ)����һ���µĽڵ� <sex>��</sex>
	 */
	@Test
	public void test2() throws Exception{
		//1.������������
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		//2.����������
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		//3.���� xml �ļ�
		Document document = builder.parse("Person.xml");
		
		//��ȡ <p1> ��ǩ(����)
		NodeList nodeList = document.getElementsByTagName("p1");
		
		//��ȡ��һ��<p1>��ǩ
		Node p1 = nodeList.item(0);
		
		//�����ڵ�<sex>��</sex>
		Element sex = document.createElement("sex");//����Ԫ�ؽڵ�
		Text text = document.createTextNode("��");//�����ı��ڵ�
		sex.appendChild(text);// <sex>Ԫ���м����ı�����
		p1.appendChild(sex);//<p1>Ԫ�ؽڵ��м���<sex>
		
		//��д xml ,�˶δ���ʹ�õ�ʱ�����ճ��
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.transform(new DOMSource(document), new StreamResult("Person.xml"));
		
	}
	
	/*
	 * ���� xml �ļ����޸� <work>����</work> Ԫ�ؽڵ�����ı�����
	 */
	@Test
	public void test3() throws Exception{
		//1.������������
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		//2.����������
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		//3.���� xml �ļ�
		Document document = builder.parse("Person.xml");
		
		//��ȡ <work>����</work> Ԫ�ؽڵ�
		Node work1 = document.getElementsByTagName("work").item(0);
		
		//�޸� <work>����</work>Ԫ�ؽڵ�����ı�����
		work1.setTextContent("�Ĵ�����");
		
		//��д xml ,�˶δ���ʹ�õ�ʱ�����ճ��
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.transform(new DOMSource(document), new StreamResult("Person.xml"));
		
	}
	
	/*
	 * ���� xml �ļ���ɾ�� <sex>��</sex> Ԫ�ؽڵ�
	 */
	@Test
	public void test4() throws Exception{
		//1.������������
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		//2.����������
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		//3.���� xml �ļ�
		Document document = builder.parse("Person.xml");
		
		//��ȡ<sex>��</sex> Ԫ�ؽڵ�
		Node sex = document.getElementsByTagName("sex").item(0);
		//��ȡ<sex>�ڵ�ĸ��ڵ�
		Node parent = sex.getParentNode();
		//ɾ���ӽڵ�
		parent.removeChild(sex);
		
		//��д xml ,�˶δ���ʹ�õ�ʱ�����ճ��
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		transformer.transform(new DOMSource(document), new StreamResult("Person.xml"));
		
	}
	
	/*
	 * ���� xml �ļ�������Ԫ�ؽڵ�����
	 */
	@Test
	public void test5() throws Exception{
		//1.������������
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		//2.����������
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		//3.���� xml �ļ�
		Document document = builder.parse("Person.xml");
		
		//��ȡ���ڵ�
		Node root = document.getElementsByTagName("person").item(0);
		//��ȡ���ڵ���ӽڵ�
		NodeList list = root.getChildNodes();
			
		//����
		for(int i = 0; i < list.getLength(); i++){
			Node node = list.item(i);
			//�жϽڵ�����,�����жϻὫ�սڵ��ӡ���
			if(node.getNodeType() == Node.ELEMENT_NODE){
				String nodeName = node.getNodeName();//��ȡԪ�ؽڵ������
				System.out.println(nodeName);
				NodeList list2 = node.getChildNodes();
				for(int j = 0; j < list2.getLength(); j++){
					Node node2 = list2.item(j);
					//�жϽڵ����ͣ������жϻὫ�սڵ��ӡ���
					if(node2.getNodeType() == Node.ELEMENT_NODE){
						String node2Name = node2.getNodeName();//��ȡԪ�ؽڵ������
						System.out.print(node2Name + "  ");
					}
				}
				System.out.println();
			}
		}
		
	}
}
