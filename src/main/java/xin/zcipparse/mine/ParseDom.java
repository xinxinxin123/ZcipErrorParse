package xin.zcipparse.mine;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ParseDom {
	public static void main(String[] args) throws DocumentException {
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(new File("C:/Users/liyuxin/Desktop/zcip����/8967971/20170427/20170427184445_JavaNCSS_8967971_JavaNCSS.xml"));
		Element rootElement = document.getRootElement(); 
//		System.out.println(rootElement.getName());
//		System.out.println(elementtime.getText());
		Element functions = rootElement.element("functions");
		Iterator<Element> functionListIterator =  functions.elements("function").iterator();
		
		while(functionListIterator.hasNext()){
			Element function = functionListIterator.next();
			int ccn = Integer.parseInt(function.element("ccn").getText());
			if(ccn > 50){
				System.out.println(function.element("name").getText());
			}
		}
		
	}
}
