package ibm.com.obj;

public class OverLoadTest {
	public static void main(String[] args) {
		System.out.println("����1��"+sum(1,2));
		System.out.println("����2��"+sum(1.0,2.0));
		System.out.println("����3��"+sum(1L,2L));
		

	}
	public static int sum(int a,int b) {//����1
		return a+b;
	}
	public static double sum(double a,double b) {//����2
		return a+b;
	}
	public static long sum(long a,long b) {//����3
		return a+b;
	}
}
