package ibm.com.file;

import java.io.File;
import java.io.IOException;

public class RenameFileDemo {
	/**�ļ�������
     * @param path �ļ�Ŀ¼
     * @param oldname  ԭ�����ļ���
     * @param newname ���ļ���
     */
	public static void renameFile(String path,String oldname,String newname){
        if(!oldname.equals(newname)){//�µ��ļ�������ǰ�ļ�����ͬʱ,���б�Ҫ����������
            File oldfile=new File(path+"/"+oldname);
            File newfile=new File(path+"/"+newname);
            if(newfile.exists())//���ڸ�Ŀ¼���Ѿ���һ���ļ������ļ�����ͬ��������������
                System.out.println(newname+"�Ѿ����ڣ�");
            else{
                oldfile.renameTo(newfile);
            } 
        }         
    }
	
	 public static void main(String[] args) throws IOException {  
	        String path="C:/JMPX";
	        String oldName="sms.log";
	        String newName="reName.log";
	        renameFile(path,oldName,newName);
	        System.out.println("�ѳɹ���C:/JMPX�ļ�����sms.log�ļ���������ΪreName.log");
	    }
}
