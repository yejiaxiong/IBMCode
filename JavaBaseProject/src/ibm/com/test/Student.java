package ibm.com.test;

public class Student {
	public Student(){}
	public Student(String p){
	name=p;
	}
	//用于改名的的函数，不过得改成别人的名字
	public void changName(Student p){
	this.name=p.name;
	}
	public String name;

}
