package ibm.com.file;

import java.io.File;
import java.io.IOException;

public class ChangeDirectoryDemo {
	 /**ת���ļ�Ŀ¼
     * @param filename �ļ���
     * @param oldpath ��Ŀ¼
     * @param newpath ��Ŀ¼
     * @param cover ����Ŀ¼�´��ں�ת���ļ�������ͬ�ļ������ļ�ʱ���Ƿ񸲸���Ŀ¼���ļ���cover=true���Ḳ��ԭ�ļ������򲻲���
     */
    public static void changeDirectory(String filename,String oldpath,String newpath,boolean cover){
        if(!oldpath.equals(newpath)){
            File oldfile=new File(oldpath+"/"+filename);
            File newfile=new File(newpath+"/"+filename);
            if(newfile.exists()){//���ڴ�ת��Ŀ¼�£��Ѿ����ڴ�ת���ļ�
                if(cover)//����
                    oldfile.renameTo(newfile);
                else
                    System.out.println("����Ŀ¼���Ѿ����ڣ�"+filename);
            }
            else{
                oldfile.renameTo(newfile);
            }
        }       
    }
    
    public static void main(String[] args) throws IOException {
	    String fileName="reName.log";
	    String oldPath="C:\\JMPX";
	    String newPath="C:\\JMPX\\Copy";
    	changeDirectory(fileName,oldPath,newPath,false);//�����ƶ��ļ�����
    }
}
