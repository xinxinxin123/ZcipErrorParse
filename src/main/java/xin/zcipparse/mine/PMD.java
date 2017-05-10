package xin.zcipparse.mine;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class PMD {

	public static void main(String[] args) throws DocumentException {
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(new File(Const.pmdPath));
		Element rootElement = document.getRootElement(); 
		
		Iterator<Element> filesIterator =  rootElement.elements("file").iterator();
		int count = 0;
		while(filesIterator.hasNext()){
			Element fileElement = filesIterator.next();
			String fileName = fileElement.attribute("name").getValue();
			int beginIndex = fileName.indexOf("com/");
			if(beginIndex != -1){
				String result1 = fileName.substring(beginIndex, fileName.length());
				String result2 = ".*/"+result1;
				count ++;
				System.out.println(result2);
			}
			
		}
		
		System.out.println(count);
	}

}
