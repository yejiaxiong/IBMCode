package ibm.com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommonMethodList {
	public static void main(String[] args)
	{
	    List<String> L = new ArrayList<>();
	    //ĩβ���Ԫ��
	    L.add("abc");
	    L.add("bcd");
	    L.add("cde");
	    //����List�������������ģ�������ʹ���������е���
	    for(int i = 0;i < L.size();i++)
	    {
	        System.out.println(L.get(i));
	    }
	    System.out.println("����������list���֮ǰ---------------------");
	    //ָ��λ�����Ԫ��
	    L.add(1,"fgh");
	    for(int i = 0;i < L.size();i++)
	    {
	        System.out.println(L.get(i));
	    }
	    System.out.println("list���֮��---------------------");
	    //ɾ��ָ��Ԫ��
	    L.remove("abc");
	    for(int i = 0;i < L.size();i++)
	    {
	        System.out.println(L.get(i));
	    }
	    System.out.println("listɾ��abc֮��---------------------");
	    //ɾ��ָ������Ԫ��
	    L.remove(1);
	    for(int i = 0;i < L.size();i++)
	    {
	        System.out.println(L.get(i));
	    }
	    System.out.println("list��remove(1)֮��---------------------");
	    //��ָ����������Ԫ���滻��ָ��Ԫ��
	    L.set(1,"hello");
	    //��ȡָ����������Ԫ��
	    L.get(1);
	    //ʹ�õ�������ȡ�������е�Ԫ��,���ʹ��listIterator���е���
	    Iterator<String> it = L.listIterator();
	    while(it.hasNext())
	    {
	        System.out.println(it.next());
	    }
	    System.out.println("list��L.get()֮��---------------------");
	    //����List�������������ģ�������ʹ���������е���
	    for(int i = 0;i < L.size();i++)
	    {
	        System.out.println(L.get(i));
	    }
	}
}
