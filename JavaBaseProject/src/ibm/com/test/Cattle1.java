package ibm.com.test;
public class Cattle1 {
	   int cattleAge;  
	   public Cattle1(String name){
	      // 这个构造器仅有一个参数：name
	      System.out.println("小牛的名字是 : " + name ); 
	   } 
	   public void setAge( int age ){
		   cattleAge = age;
	   }
	   public int getAge( ){
	       System.out.println("小牛的年龄为 : " + cattleAge ); 
	       return cattleAge;
	   }   
	   public static void main(String[] args){
		      /* 创建对象 */
		      Cattle1 myCattle = new Cattle1( "tommy" );
		      /* 通过方法来设定age */
		      myCattle.setAge( 2 );
		      /* 调用另一个方法获取age */
		      int age=myCattle.getAge( );
		      System.out.println("用getAge()方法获取的变量值 : " + age ); 
		      /*你也可以像下面这样访问成员变量 */
		      System.out.println("通过类直接获取的变量值 : " +myCattle.cattleAge ); 
		   }
}
