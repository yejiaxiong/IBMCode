package ibm.com.instanceof1;
public class Main {
	public static void main(String[] args) {
		show(new Cat());
		show(new Cattle());
	}
	public static void show(Animal a) {
		// �����ж�
		if (a instanceof Cat) { // è��������
			Cat c = (Cat) a;
			c.work();
		} else if (a instanceof Cattle) { // ����������
			Cattle c = (Cattle) a;
			c.work();
		}
	}
}
