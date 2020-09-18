package ibm.com.test;
public class Cattle {
	 public Cattle(String name){
	      //这个构造器仅有一个参数：name
	      System.out.println("牛的名字是 : " + name ); 
	   }
	   public static void main(String[] args){
	      // 下面的语句将创建一个对象
	      Cattle myDog = new Cattle( "tommy" );
	   }
}
