package ibm.com.collection;

import java.util.ArrayList;
import java.util.List;

public class RepeatListDemo {
	public static void main(String[] args) {
		//���弯��
		List list=new ArrayList<>();
		//���������������
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		list.add("aa");
		list.add("bb");
		//�����ʾ
		System.out.println("����List���ϵ�Ԫ�ؿ��ظ���");
		for (Object o : list) {
			System.out.println(o);
		}
}
}