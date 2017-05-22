package day_12;

interface Parserable {
	void parse(String fileName);
		
}

class XMLParser implements Parserable {

	@Override
	public void parse(String fileName) {
		System.out.println(fileName + " parsing....");
		
	}
	
}

class HTMLParser implements Parserable {

	@Override
	public void parse(String fileName) {
		System.out.println(fileName + " parsing....");
		
	} 
	
}

class ParserManager {
	public static Parserable getParser(String type) {
		if(type.equals("XML"))
			return new XMLParser(); 
		else
			return new HTMLParser(); 
		
	}
}

public class p388 {
	public static void main(String[] args) {
/*		args = new String[0];
		args[0] = "index.html";*/
		
		String fileName = args[0];
		System.out.println(fileName);
		
		int i = fileName.indexOf('.');
		
		String ext = fileName.substring(fileName.length() - i);
		System.out.println("확장자 정보: " + ext);
		Parserable parser = ParserManager.getParser(ext);
		parser.parse(fileName);
		
/*		Parserable parser = ParserManager.getParser("HTML");
		parser.parse("index");
		parser = ParserManager.getParser("XML");
		parser.parse("index");*/
		
	}
}
