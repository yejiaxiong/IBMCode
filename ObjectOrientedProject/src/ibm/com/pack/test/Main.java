package ibm.com.pack.test;
import java.util.Date;
import ibm.com.pack.Phone;
public class Main {
	public static void main(String[] args) {
		// ʹ��ibm.com.pack���µ�Phone�࣬��������
		Phone huawei = new Phone();
		huawei.setCpu(2.5);
		huawei.setMemory(8);
		System.out.println("CPU is " + huawei.getCpu());
		System.out.println("Memory is " + huawei.getMemory());

		// ʹ��java.uitl���µ�Date�࣬ �����ǰʱ��
		Date currentDate = new Date();
		System.out.println("Current Time " + currentDate);
	}
}
