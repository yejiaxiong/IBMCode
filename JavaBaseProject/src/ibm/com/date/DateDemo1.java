package ibm.com.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {
	 public static void main(String args[]) {
	      Date dNow = new Date( );
	      SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
	      System.out.println("��ǰʱ��Ϊ: " + ft.format(dNow));
	   }

}
