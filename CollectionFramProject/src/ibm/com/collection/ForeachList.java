package ibm.com.collection;

import java.util.ArrayList;
import java.util.List;

public class ForeachList {
	public static void main(String[] args) {
		//���弯��
		List list=new ArrayList<>();
		//���������������
		list.add("aa");
		list.add("bb");
		list.add("cc");
		System.out.println("List���ϵ�foreachѭ�����ԣ�");
		//foreachѭ��
		for (Object o : list) {
			System.out.println(o);
		}
	}
}
