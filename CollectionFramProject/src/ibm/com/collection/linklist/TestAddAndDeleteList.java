package ibm.com.collection.linklist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//ArrayList ��LinkedList����ɾ��������ʱ�Ա�
public class TestAddAndDeleteList {
	static final int N = 50000;

	static long timeList(List list) {
		long start = System.currentTimeMillis();
		Object o = new Object();
		for (int i = 0; i < N; i++)
			list.add(0, o);
		return System.currentTimeMillis() - start;
	}

	public static void main(String[] args) {
		System.out.println("ArrayList��ʱ��" + timeList(new ArrayList()) + " ms");
		System.out.println("LinkedList��ʱ��" + timeList(new LinkedList()) + " ms");
	}

}
