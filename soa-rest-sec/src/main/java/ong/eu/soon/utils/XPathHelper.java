package ong.eu.soon.utils;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XPathHelper {
	public void query(String expression, String filename)
			throws ParserConfigurationException,
	SAXException, IOException, XPathExpressionException {
		// Standard of reading a XML file
		File f = new File(filename);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder;
		Document doc = null;
		XPathExpression expr = null;
		builder = factory.newDocumentBuilder();
		doc = builder.parse(f);

		// Create a XPathFactory
		XPathFactory xFactory = XPathFactory.newInstance();

		// Create a XPath object
		XPath xpath = xFactory.newXPath();

		// Compile the XPath expression
		expr = xpath.compile(expression);
		// Run the query and get a nodeset
		Object result = expr.evaluate(doc, XPathConstants.NODESET);

		// Cast the result to a DOM NodeList
		NodeList nodes = (NodeList) result;
		for (int i = 0; i < nodes.getLength(); i++) {
			System.out.println(nodes.item(i).getNodeValue());
		}

		// New XPath expression to get the number of people with name lars
		expr = xpath.compile("count(//person[firstname='Lars'])");
		// Run the query and get the number of nodes
		Double number = (Double) expr.evaluate(doc, XPathConstants.NUMBER);
		System.out.println("Number of objects " + number);

		// Do we have more then 2 people with name lars?
		expr = xpath.compile("count(//person[firstname='Lars']) >2");
		// Run the query and get the number of nodes
		Boolean check = (Boolean) expr.evaluate(doc, XPathConstants.BOOLEAN);
		System.out.println(check);

	}

}