package ibm.com.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSublistMethod {
	public static void main(String[] args) {	
		//�޸�sublist ��Ӱ��ԭ����list
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("a");
        l1.add("b");
        l1.add("c");
        System.out.println("l1.subList֮ǰ��l1----"+l1);
        List<String> l2 = l1.subList(1, 2);
        System.out.println("l2.add֮ǰ----"+l2);
        System.out.println("l1.subList֮���l1----"+l1);
        l2.add("new");
        System.out.println("l2.add��l1֮��----"+l1);
        System.out.println("l2.add֮��----"+l2);
    }
}
