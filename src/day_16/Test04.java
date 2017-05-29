package day_16;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test04 {

	public static void main(String[] args){
        Properties p = new Properties();
        try{
            p.load(new FileInputStream("dbInfo.properties"));
        }catch(Exception e){
        	e.printStackTrace();
        }
        p.put("id", "java");
        p.put("pw", "1234");
        System.out.println(p);
        System.out.println(p.getProperty("id"));
        
	}
}
