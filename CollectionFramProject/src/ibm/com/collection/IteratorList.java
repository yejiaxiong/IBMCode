package ibm.com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorList {
	public static void main(String[] args) {
		//���弯��
		List list=new ArrayList<>();
		//���������������
		list.add("aa");
		list.add("bb");
		list.add("cc");
		System.out.println("List���ϵĵ������������ԣ�");
		//�����������ʾ
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
