package ibm.com.collection.set;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTreeSetDemo {
	/**
	 * TreeSet��������������Ԫ�ؽ�������ģ�ͬ����Ҳ���Ա�֤Ԫ��Ψһ
	 * ��CompareTo��������0��ʱ�򼯺���ֻ��һ��Ԫ��
	 * ��CompareTo��������������ʱ�򼯺ϻ���ô�����ôȡ
	 * ��CompateTo�������ظ�����ʱ�򼯺ϻᵹ��洢
	 */
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>(new CompareByLen());
		ts.add("����");
		ts.add("����");
		ts.add("����");
		ts.add("����");
		ts.add("����");//��  �ظ�������
		System.out.println(ts);
	}
}

class CompareByLen implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		System.out.println(s1 + " :" + s2);
		int num = s1.length() - s2.length();
		return num == 0 ? s1.compareTo(s2) : num;
	}

}
