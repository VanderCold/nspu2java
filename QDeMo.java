//Очередь
class Queue {
	private char[] q;
	private int putloc, getloc; //указатели

	public Queue (int size) {
		q = new char[size];
		putloc = getloc = 0;
		
	}

	Queue(Queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];
		for (int i = getloc; i < putloc; i++)
			q[i] = ob.q[i];
	}

	Queue(char[] a) {
		putloc = 0;
		getloc = 0;
		q = new char[a.length];

		for (int i = 0; i < a.length; i++)
			put(a[i]);
	}

	//Метод для помещения символа в очередь
	public void put(char ch) {
		if(putloc == q.length) {
			System.out.println(" - очередь переполнена!");
			return;
		}
		q[putloc++] = ch;
	}

	//Метод для извлечения символа из очереди
	public char get() {
		if(getloc == putloc) {
			System.out.println(" - очередь пуста");
			return (char) 0;
		}
		return q[getloc++];
	}
}

class QDeMo {
	public static void main(String[] args) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;

		System.out.println();

		System.out.println("Использование очереди bigQ для сохранения символов");
		for (i = 0; i < 26; i++)
			bigQ.put((char) ('A' + i));
		//Извлекаем элементы из bigQ
		System.out.print("Содержимое bigQ: ");
		for (i = 0; i < 25; i++) {
			ch = bigQ.get();
			if (ch != (char) 0)
				System.out.print(ch);
		}
		System.out.println("\n");

		//smallQ
		for (i = 0; i < 5; i++) {
			System.out.print("Попытка сохранить " + (char) ('Z' - i));
			smallQ.put((char) ('Z' - i));
			System.out.println();
		}
		System.out.println();
		System.out.print("Вывод: ");
		for (i = 0; i < 5; i++) {
			ch = smallQ.get();
			if (ch != (char) 0) System.out.print(ch);
		}

		//

		Queue q1 = new Queue(10);
		char[] name = {'I', 'v', 'a', 'n'};

		Queue q2 = new Queue(name);
		int i2;
		for (i2 = 0; i2 < 10; i2++)
			q1.put((char) ('A' + i2));
		Queue q3 = new Queue(q1);
		
		System.out.println("Внутри q1: ");
		for (i2 = 0; i2 < 10; i2++) {
                        ch = q1.get();
                	System.out.print(ch);
		}
		System.out.println("\n");
		
		System.out.println("Внутри q2: ");
		for (i2 = 0; i2 < 4; i2++) {
                        ch = q2.get();
                        System.out.print(ch);
                }
                System.out.println("\n");

                System.out.println("Внутри q3: ");
		for (i2 = 0; i2 < 10; i2++) {
                        ch = q3.get();
                        System.out.print(ch);
                }
                System.out.println("\n");
	}
}
