package ibm.com.collection.arraylist;

import java.util.ArrayList;

public class ToArrayMethod {
	public static void main(String[] args) {
		    //ֱ��ת������
		    ArrayList<String> list = new ArrayList();
	        list.add("1");
	        list.add("2");
	        String[] number = (String[]) list.toArray();
	        System.out.println(number);
		
		    //��ȷת����ʽ
//			ArrayList<String> list = new ArrayList();
//		    list.add("1");
//		    list.add("2");
//		    Object[] number = list.toArray();
//		    for (int i = 0; i < number.length; i++) {
//		        String e = (String) number[i];
//		        System.out.println(e);
//		    }
//		    System.out.println(number);
    }
}
