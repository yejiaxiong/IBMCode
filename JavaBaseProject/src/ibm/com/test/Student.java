package ibm.com.test;

public class Student {
	public Student(){}
	public Student(String p){
	name=p;
	}
	//���ڸ����ĵĺ����������øĳɱ��˵�����
	public void changName(Student p){
	this.name=p.name;
	}
	public String name;

}
