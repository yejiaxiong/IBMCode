package ibm.com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[]args){
        Collection collection = new ArrayList();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");

        //ʹ����Collection�е�iterator()���������� �����еĵ���������Ϊ�˻�ȡ�����еĵ���������

        //�÷�һ
        Iterator iterator = collection.iterator();
        System.out.println("����Iterator����Collection��Ԫ�ط���һ");
        while (iterator.hasNext()){
    	   
           System.out.println("����Iterator����Collection��Ԫ�أ�"+iterator.next());
           
        }

       System.out.println("����Iterator����Collection��Ԫ�ط�����");
        //�÷���
        for (Iterator iterator1 = collection.iterator();iterator1.hasNext();){
            System.out.println("����Iterator����Collection��Ԫ�أ�"+iterator1.next());
        }
    }

}
