package ibm.com.obj;

public class Leaf {
	int i=0;
	 
    public Leaf(int i) {
        this.i = i;
    }
    public Leaf increament(){
        i++;
        return  this;
    }
    void print(){
        System.out.println("i="+i);
    }
 
    public static void main(String[] args) {
    	Leaf leaf=new Leaf(100);
        leaf.increament().increament().print();
    }
}
