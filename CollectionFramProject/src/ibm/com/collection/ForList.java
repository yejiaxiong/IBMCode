package ibm.com.collection;

import java.util.ArrayList;
import java.util.List;

public class ForList {
	public static void main(String[] args) {
		//���弯��
		List list=new ArrayList<>();
		//���������������
		list.add("aa");
		list.add("bb");
		list.add("cc");
		System.out.println("List���ϵ�forѭ�����ԣ�");
		//forѭ��
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
