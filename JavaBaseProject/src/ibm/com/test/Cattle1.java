package ibm.com.test;
public class Cattle1 {
	   int cattleAge;  
	   public Cattle1(String name){
	      // �������������һ��������name
	      System.out.println("Сţ�������� : " + name ); 
	   } 
	   public void setAge( int age ){
		   cattleAge = age;
	   }
	   public int getAge( ){
	       System.out.println("Сţ������Ϊ : " + cattleAge ); 
	       return cattleAge;
	   }   
	   public static void main(String[] args){
		      /* �������� */
		      Cattle1 myCattle = new Cattle1( "tommy" );
		      /* ͨ���������趨age */
		      myCattle.setAge( 2 );
		      /* ������һ��������ȡage */
		      int age=myCattle.getAge( );
		      System.out.println("��getAge()������ȡ�ı���ֵ : " + age ); 
		      /*��Ҳ�����������������ʳ�Ա���� */
		      System.out.println("ͨ����ֱ�ӻ�ȡ�ı���ֵ : " +myCattle.cattleAge ); 
		   }
}
