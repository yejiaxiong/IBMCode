package ibm.com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*
 * 实现字符流与字节流之间的转换
 */


public class ByteAndCharSwitchDemo1 {

	 /**
     * 从控制台输入后写入文件
     */
    public static void main(String[] args) {

        // 创建字节流对象 System.in 代表从控制台输入
        InputStream in = System.in;
        // 创建字符流对象
        BufferedWriter bw = null;
        BufferedReader br = null;

        try {
            // 实例化字符流对象 通过 InputStreamReader 将字节输入流转化成字符输入流
            br = new BufferedReader(new InputStreamReader(in));
            bw = new BufferedWriter(new FileWriter("C:\\GBA\\IO" + File.separator+"test.txt"));
            // 定义读取数据的行
            String line = null;
            // 读取数据
            while ((line = br.readLine()) != null) {
                // 如果输入的是"exit"就退出
                if("exit".equals(line)){
                    break;
                }
                // 将数据写入文件
                bw.write(line);
                // 写入新的一行
                bw.newLine();
                // 刷新数据缓冲
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
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
