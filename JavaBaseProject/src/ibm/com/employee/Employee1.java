package ibm.com.employee;

public class Employee1 {
	 // ���ʵ������������ɼ�
	   public String name;
	   // ˽�б��������ڸ���ɼ�
	   private double salary;
	   //�ڹ������ж�name��ֵ
	   public Employee1 (String empName){
	      name = empName;
	   }
	   //�趨salary��ֵ
	   public void setSalary(double empSal){
	      salary = empSal;
	   }  
	   // ��ӡ��Ϣ
	   public void printEmp(){
	      System.out.println("���� : " + name );
	      System.out.println("нˮ : " + salary);
	   }
	 
	   public static void main(String[] args){
		     Employee1 empOne = new Employee1("RUNOOB");
		      empOne.setSalary(1000.0);
		      empOne.printEmp();
		   }


}
