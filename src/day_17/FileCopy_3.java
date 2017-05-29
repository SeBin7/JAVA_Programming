package day_17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy_3 {

	public static void main(String[] args) {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        
        long start = 0;
        long end = 0;
        try{
            fis = new FileInputStream(args[0]);
            bis = new BufferedInputStream(fis);
            
            fos = new FileOutputStream(args[1]);
            bos = new BufferedOutputStream(fos);
            
            start = System.currentTimeMillis();
            System.out.println("파일 복사 시작합니다.");
            int readData = 0;
            while((readData = bis.read()) != -1){
            	bos.write(readData);
            }
            end = System.currentTimeMillis();
            System.out.println("파일 복사 종료");
            System.out.println("복사시간 : "+(end-start));
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







