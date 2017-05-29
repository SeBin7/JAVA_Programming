package day_17;
//InputStream => Reader
//OutputStream => Writer
//  byte[]          char[]

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileCopy_4 {

	public static void main(String[] args) {
        FileReader fis = null;
        BufferedReader bis = null;
        
        FileWriter fos = null;
        BufferedWriter bos = null;
        
        try{
            fis = new FileReader(args[0]);
            bis = new BufferedReader(fis);
            
            fos = new FileWriter(args[1],true);
            bos = new BufferedWriter(fos);
            
            System.out.println("파일 복사 시작합니다.");
            
            SimpleDateFormat f = 
            		new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date = f.format(new Date());
            bos.write("Copy 된 시간 정보 : "+date);
            bos.newLine();
            int readData = 0;
            while((readData = bis.read()) != -1){
            	bos.write(readData);
            }
            
            System.out.println("파일 복사 종료");
            bos.flush();
        }catch(Exception e){
        	System.out.println(e.getMessage());
        }finally {
			try{
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			}catch(Exception e){}
		}
	}
}







