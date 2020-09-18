package ibm.com.test;

public class TestInnerClass {
	
	public class InnerClass {
        public int getSum(int x,int y) {
            return x + y;
        }
    }
    public static void main(String[] args) {
    	TestInnerClass.InnerClass ti = new TestInnerClass().new InnerClass();
        int i = ti.getSum(1, 4);
        System.out.println(i);    // Êä³ö5
    }

}
