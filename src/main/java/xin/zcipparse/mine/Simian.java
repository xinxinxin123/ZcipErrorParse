package xin.zcipparse.mine;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Simian {

	public static void main(String[] args) throws DocumentException {
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(new File(Const.simPath));
		  
		Element rootElement = document.getRootElement();
		Element checkElement =  rootElement.element("check");
		
		Iterator<Element> setIterator = checkElement.elements("set").iterator();
		
		List<String> sourceList = new ArrayList<String>(); 
		List<String> resultList = new ArrayList<String>();
		int count = 0;
		while(setIterator.hasNext()){
			Element setElement = setIterator.next();
			Iterator<Element> blockIterator = setElement.elements("block").iterator();
			sourceList = new ArrayList<String>();
			while(blockIterator.hasNext()){
				Element blockElement = blockIterator.next();
				String sourceFile = blockElement.attribute("sourceFile").getValue();
				if(!sourceList.contains(sourceFile)){
					sourceList.add(sourceFile);
				}
			}
			for (int i = 0; i < sourceList.size(); i++) {
				
				 String line = sourceList.get(i);
				 int comIdex = line.indexOf("com");
				 String result = line.substring(comIdex, line.length());
				 String result2 = "**/"+result; 
				 if(!resultList.contains(result2)){
					 resultList.add(result2);
					 System.out.println(result2);
					 count++;
				 }
			}
		}
		
		System.out.println(count);

	}

}
