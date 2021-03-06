package ibm.com.collection.arraylist;

import java.util.ArrayList;
public class ArrayListCloneMethod {
	public static void main(String[] args) {	
		ArrayList<Student> students = new ArrayList<>();
        Student student = new Student("Ryan", 25);
        Student student1 = new Student("Kiven", 24);
        students.add(student);
        students.add(student1);
        ArrayList<Student> students2 = (ArrayList<Student>) students.clone();
        students2.remove(1);//此处打断点
        System.out.println(students);
        System.out.println(students2);
        System.out.println(students.hashCode());
        System.out.println(students2.hashCode());

        //结论：ArrayList的拷贝是深拷贝  但元素的引用是相同的
    }
}
