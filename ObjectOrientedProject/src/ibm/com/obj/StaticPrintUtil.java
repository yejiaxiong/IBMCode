package ibm.com.obj;

import java.util.Date;

public class StaticPrintUtil {
	// ��̬����
		public static String classTopic = "�������";

		// ��̬����
		public static void printMessage() {
			System.out.println("����һ����̬����");
		}

		// ��̬�����
		static {
			Date currentDate = new Date();
			System.out.println("����ʱ���� " + currentDate);
			// ֻ������ʾ�̬�ĳ�Ա
			System.out.println("���ǵĿγ��� " + classTopic);
			printMessage();
		}	
}
