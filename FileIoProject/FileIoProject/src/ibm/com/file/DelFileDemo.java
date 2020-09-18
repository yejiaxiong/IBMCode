package ibm.com.file;

import java.io.File;
import java.io.IOException;

public class DelFileDemo {
	 
	 
	    /**删除文件
	     * @param path 目录
	     * @param filename 文件名
	     */
	    public static void delFile(String path,String filename){
	        File file=new File(path+"/"+filename);
	        if(file.exists()&&file.isFile())
	            file.delete();
	    }
	    public static void main(String[] args) throws IOException {
	        //删除文件调用
	        String fileUrl="C:/JMPX";
	        String fileName="HelloWorld.txt";
	        delFile(fileUrl,fileName);
	        System.out.println("C:/JMPX文件夹下HelloWorld.txt文件删除成功！");
	    }
}
