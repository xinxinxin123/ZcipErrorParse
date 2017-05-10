package xin.zcipparse.mine;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class CheckStyle { 
	
	public static void main(String[] args) throws DocumentException {
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(new File(Const.checkStylePath));
		
		Element rootelement =  document.getRootElement();
		
		Iterator<Element> filesIterator =  rootelement.elements("file").iterator();
		
		int i = 0;
		String finalResultString = "";
		while(filesIterator.hasNext()){
			Element fileElement =  filesIterator.next();
			
			List<Element> errorElements = fileElement.elements("error");
			if(null != errorElements && errorElements.size() > 0){
				String value =  fileElement.attribute("name").getValue();
				
				String result1 = value.replaceAll(Const.checkReplace, "");
				
				finalResultString= finalResultString + result1 + ",";
			
				i++;
				//System.out.println(result1);
				
			}
		}
		System.out.println(finalResultString);
		System.out.println(i);
	}

}
