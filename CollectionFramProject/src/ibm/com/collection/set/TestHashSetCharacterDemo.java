package ibm.com.collection.set;

import java.util.HashSet;

public class TestHashSetCharacterDemo {
	public static void main(String []args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(5);
		hs.add(2);
		hs.add(3);
		System.out.println("����set�ص�֮ǰ��ӡ----"+hs);
		System.out.println(hs.add(4));
		System.out.println(hs.add(4));  //����HashSet�Ƿ������ظ�Ԫ�ؼ���
		System.out.println(hs);    //����HashSet�Ƿ�����
			
	}
}

