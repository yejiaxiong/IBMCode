package ibm.com.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddMethod {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3); // ��ʱlist : 0 1 2 3
        print("list", list);
        list.add(0, 4); //  ��ָ��λ�ò���Ԫ��
        print("list", list); //  ��ʱlist ��4 0 1 2 3
        List newList = list.subList(2, 4); //��ȡlist �����������һλ
        print("newList", newList); //  ��ʱ newList �� 1 2
        list.addAll(2, newList); //����list���µ�listԪ��Ĭ������ԭ��Ԫ�صĺ��� ,��ʱnewList ������ʹ����
        print("list", list); // ��ʱ��list : 4 0 1 2 1 2 3
        System.out.println("list size " + list.size());
        list.set(0, 1); //��ָ��λ���滻Ԫ��
        print("list", list); // ��ʱ list : 1 0 1 2 1 2 3
        System.out.println(list.indexOf(1));
        System.out.println(list.lastIndexOf(1));
        System.out.println(list.isEmpty());
 
    }
 
    private static void print(String flag, List list) {
        System.out.print(flag + ":");
        list.forEach(System.out::print);
        System.out.println();

	}
}
