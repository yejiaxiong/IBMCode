package ibm.com.file;

import java.io.File;
import java.io.IOException;

public class DelFileDemo {
	 
	 
	    /**ɾ���ļ�
	     * @param path Ŀ¼
	     * @param filename �ļ���
	     */
	    public static void delFile(String path,String filename){
	        File file=new File(path+"/"+filename);
	        if(file.exists()&&file.isFile())
	            file.delete();
	    }
	    public static void main(String[] args) throws IOException {
	        //ɾ���ļ�����
	        String fileUrl="C:/JMPX";
	        String fileName="HelloWorld.txt";
	        delFile(fileUrl,fileName);
	        System.out.println("C:/JMPX�ļ�����HelloWorld.txt�ļ�ɾ���ɹ���");
	    }
}
