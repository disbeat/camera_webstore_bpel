package is.utils;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;

public class puPriceInCameras {
	
	final private static String PATH = "xml";
	final private static String EXTENSION = ".xml";

	/**
	 * @param args
	 * @throws IOException 
	 * @throws JDOMException 
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws JDOMException, IOException {
		// TODO Auto-generated method stub
		String brands[] = {"agfa", "canon", "casio", "contax", "epson", 
				"fujifilm", "hp", "kodak", "konica_minolta", "kyocera",
				"olympus", "panasonic", "pentax", "ricoh", "samsung",
				"sanyo", "sigma", "sony", "toshiba"};
		Document doc = null;
		Element base = null;
    	Element element = null;
    	Element el = null;
    	List<Element> list = null;
    	Iterator <Element> it = null;
    	//XMLOutputter outputter = null;
    	
    	
    	for (String brand : brands)
    	{
	    	doc = XMLFileIO.readFromFile(PATH + File.separator + brand + EXTENSION);
	    	
	    	base = doc.getRootElement();
	    	list = base.getChildren();
	
			it = list.iterator();
	    	
			while (it.hasNext()){
				element = it.next();
				el = new Element("price");
				el.setAttribute("currency", "€");
				el.addContent((Math.round(Math.random()*4500)+500)+"."+(Math.round(Math.random()*99)));
				element.addContent(el);
			}
			
			//outputter = new XMLOutputter(Format.getPrettyFormat());
			XMLFileIO.writeToFile(doc, "xmlWPrice"+ File.separator+brand+EXTENSION);
	
		}
	}

}
