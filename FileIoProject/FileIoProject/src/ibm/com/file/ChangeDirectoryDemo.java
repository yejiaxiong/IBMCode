package ibm.com.file;

import java.io.File;
import java.io.IOException;

public class ChangeDirectoryDemo {
	 /**转移文件目录
     * @param filename 文件名
     * @param oldpath 旧目录
     * @param newpath 新目录
     * @param cover 若新目录下存在和转移文件具有相同文件名的文件时，是否覆盖新目录下文件，cover=true将会覆盖原文件，否则不操作
     */
    public static void changeDirectory(String filename,String oldpath,String newpath,boolean cover){
        if(!oldpath.equals(newpath)){
            File oldfile=new File(oldpath+"/"+filename);
            File newfile=new File(newpath+"/"+filename);
            if(newfile.exists()){//若在待转移目录下，已经存在待转移文件
                if(cover)//覆盖
                    oldfile.renameTo(newfile);
                else
                    System.out.println("在新目录下已经存在："+filename);
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
    	changeDirectory(fileName,oldPath,newPath,false);//调用移动文件方法
    }
}
