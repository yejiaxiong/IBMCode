package ibm.com.collection;

import java.util.ArrayList;
import java.util.List;
public class OrderListDemo {
	public static void main(String[] args) {
		//���弯��
		List list=new ArrayList<>();
		//���������������
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		//�����ʾ
		System.out.println("����List���ϵ������ԣ�");
		for (Object o : list) {
			System.out.println(o);
		}
}
}
