package ibm.com.collection.linklist;

import java.util.Iterator;
import java.util.LinkedList;
//LinkedList����ͨforѭ������ǿforѭ����Iterator������ �����Ա�ʾ��
public class LinkedListDemo {
	
	/**
	 * ����һ��LinkedList����,����Ԫ��50000��
	 * @return
	 */
	private static LinkedList<Integer> getLinkedList() {
	    LinkedList list = new LinkedList();
	    for (int i = 0; i < 50000; i++){
	        list.add(i);
	    }
	    return list;
	}

	/**
	 * ͨ������������ʱ���LinkedList
	 */
	private static void listByNormalFor(LinkedList<Integer> list) {
	    // ��¼��ʼʱ��
	    long start = System.currentTimeMillis();
	    int size = list.size();
	    for (int i = 0; i < size; i++) {
	        list.get(i);
	    }
	    // ��¼��ʱ
	    long interval = System.currentTimeMillis() - start;
	    System.out.println("listByNormalFor��" + interval + " ms");
	}

	/**
	 * ͨ����ǿforѭ������LinkedList
	 * @param list
	 */
	public static void listByStrengThenFor(LinkedList<Integer> list){
	    // ��¼��ʼʱ��
	    long start = System.currentTimeMillis();
	    for (Integer i : list) { }
	    // ��¼��ʱ
	    long interval = System.currentTimeMillis() - start;
	    System.out.println("listByStrengThenFor��" + interval + " ms");
	}

	/**
	 * ͨ�������������LinkedList
	 */
	private static void listByIterator(LinkedList<Integer> list) {
	    // ��¼��ʼʱ��
	    long start = System.currentTimeMillis();
	    for(Iterator iter = list.iterator(); iter.hasNext();) {
	        iter.next();
	    }
	    // ��¼��ʱ
	    long interval = System.currentTimeMillis() - start;
	    System.out.println("listByIterator��" + interval + " ms");
	}

	public static void main(String[] args) {
	    LinkedList<Integer> list = getLinkedList();
	    //ͨ������������ʱ���LinkedList
	    listByNormalFor(list);
	    //ͨ����ǿforѭ������LinkedList
	    listByStrengThenFor(list);
	    //ͨ�������������LinkedList
	    listByIterator(list);
	}
}
