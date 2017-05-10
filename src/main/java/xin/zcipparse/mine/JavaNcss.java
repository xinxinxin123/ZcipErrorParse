package xin.zcipparse.mine;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class JavaNcss {
	public static void main(String[] args) throws DocumentException {
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(new File(Const.ncssPath));
		Element rootElement = document.getRootElement(); 
		Element functions = rootElement.element("functions");
		Iterator<Element> functionListIterator =  functions.elements("function").iterator();
		int i = 0;
		
		List<String> resultList = new ArrayList<String>();
		while(functionListIterator.hasNext()){
			Element function = functionListIterator.next();
			int ccn = Integer.parseInt(function.element("ccn").getText());
			
			
			if(ccn > 10){
				String name = function.element("name").getText();
				if(!resultList.contains(name)){
					resultList.add(name);
					System.out.println(name);
					i++;
				}
			}
		}
		
		
		System.out.println(i);
	}
}
