package ibm.com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*
 * 实现字符流与字节流之间的转换
 */


public class ByteAndCharSwitchDemo2 {

	 /**
     *     读取文件输出到控制台
     */
    public static void main(String[] args) {

        // 定义字节输出流的对象
        OutputStream out = System.out;
        // 定义字节流的对象
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            // 实例化字节输出流 使用
            bw = new BufferedWriter(new OutputStreamWriter(out));
            br = new BufferedReader(new FileReader("C:\\GBA\\IO" + File.separator+"test.txt"));
            // 定义读取行的字符串
            String line = null;
            // 读取数据
            while ((line = br.readLine()) != null) {
                // 输出到控制台
                bw.write(line);
                // 新的一行 
                bw.newLine();
                // 刷新缓冲
                bw.flush();
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            // 释放资源
            try {
                if(bw != null)
                    bw.close();
                if (br != null)
                    br.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
