package ibm.com.file;

import java.io.File;
import java.io.IOException;

public class NewFileDemo {
	public static void main(String[] args) throws IOException {

		File f = new File("C:/JMPX");
		f.mkdir();// 创建文件夹
		File ff = new File(f, "HelloWorld.txt");
		boolean b = ff.createNewFile();// 创建文件
		System.out.println(b);
		File f1 = new File("C:/JMPX/Copy");
		boolean bool = f1.mkdirs();// 创建文件夹 以备后面讲文件复制用
		System.out.println(bool);
	}
}
