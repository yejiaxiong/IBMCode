package ibm.com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolveChineseGarbledCharactersDemo {
	 public static void main(String[] args) throws IOException {
		    String path="C:\\JMPX\\Copy\\reName.log";//测试之前先查看是否存在这个文件
		    File file=new File(path);
	        if(!file.exists()||file.isDirectory())
	            throw new FileNotFoundException();
	        FileInputStream fis=new FileInputStream(file);
		 try {
			    
	            fis = new FileInputStream(file);
	            InputStreamReader reader = new InputStreamReader(fis,"UTF-8");
	            BufferedReader br = new BufferedReader(reader);
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	            br.close();
	            reader.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (fis != null) {
	                try {
	                    fis.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }
}
