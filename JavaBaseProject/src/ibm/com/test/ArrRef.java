package ibm.com.test;

public class ArrRef {
	public static void changeReferValue(int a,int[]myArr) {
		a+=1;      //������a��1
	    myArr[0]=0; //�����������Ԫ��ȫ����0
	    myArr[1]=0;
	    myArr[2]=0;
	}
	
	//��ӡ����Ԫ��
	public static void printArr(int[]arr) {
		for(int i:arr) {
	      System.out.print(i+"");
	    }
	    System.out.println();   //���һ�����з�
	}
	
	//��ӡ���
	public static void print(int in,int[]arr) {
	    System.out.println("in:"+in);
	    System.out.print("arr:");
	    printArr(arr);
	}
	
	public static void main(String[] args) {
	    int in=10;
	    int arr[]={1,2,3,4,5};
	
	    System.out.println("----����changeReferValue����֮ǰ:");
	    print(in,arr);
	
	    changeReferValue(in,arr);
	    System.out.println("----����changeReferValue����֮��:");
	    print(in,arr);   

	}
}
