package ibm.com.type.conversion;

public class Main {
	public static void main(String[] args) {
		// ����ת��
		// ���õ��� Cat �� eat
		Animal a = new Cat();
		a.eat();
		// ����ת��
		// ���õ��� Cat �� work
		Cat c = (Cat) a;
		c.work();
	}
}
