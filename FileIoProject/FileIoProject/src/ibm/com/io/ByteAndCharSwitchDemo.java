package ibm.com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*
 * ʵ���ַ������ֽ���֮���ת��
 */

public class ByteAndCharSwitchDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		byteStreamToCharStream();
		//charStreamToByteStream();
	}
	
	//�ַ���ת��Ϊ�ֽ�����OutputStreamWriter
	public static void charStreamToByteStream() throws IOException {
		OutputStream osr = System.out;
		OutputStreamWriter ost = new OutputStreamWriter(osr);
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedWriter bw = new BufferedWriter(ost);
		
		bw.write("������");
		bw.newLine();
		bw.flush();
		
	}
	
	//�ֽ���ת��Ϊ�ַ���:InputStreamRader
	public static void byteStreamToCharStream() throws IOException {
		InputStream isr = System.in;
		InputStreamReader isw = new InputStreamReader(isr);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(isw);
		
		String str=null;
		while((str = br.readLine())!=null) {
			if(str.equals("over"))
				break;
			System.out.println(str.toString().toUpperCase());
		}
	}
}
