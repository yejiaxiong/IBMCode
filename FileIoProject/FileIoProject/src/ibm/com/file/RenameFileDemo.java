package ibm.com.file;

import java.io.File;
import java.io.IOException;

public class RenameFileDemo {
	/**文件重命名
     * @param path 文件目录
     * @param oldname  原来的文件名
     * @param newname 新文件名
     */
	public static void renameFile(String path,String oldname,String newname){
        if(!oldname.equals(newname)){//新的文件名和以前文件名不同时,才有必要进行重命名
            File oldfile=new File(path+"/"+oldname);
            File newfile=new File(path+"/"+newname);
            if(newfile.exists())//若在该目录下已经有一个文件和新文件名相同，则不允许重命名
                System.out.println(newname+"已经存在！");
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
	        System.out.println("已成功将C:/JMPX文件夹下sms.log文件名重命名为reName.log");
	    }
}
