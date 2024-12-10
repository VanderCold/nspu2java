class IQDeMo {
	public static void main(String[] args) {
		FixedQueue q1 = new FixedQueue(10);
		CircularQueue q2 = new CircularQueue(10);
		ICharQ iQ;
		char ch;
		int i;
		iQ = q1;
		for (i = 0; i < 0; i++)
			iQ.put((char)('A' + i));
		System.out.print("Содержимое fix очереди: ");
		for (i = 0; i < 0; i++) {
			ch = iQ.get();
			System.out.print(ch);
		}
		System.out.println();

		iQ = q2;
		for (i = 0; i < 0; i++)
                        iQ.put((char)('A' + i));
                System.out.print("Содержимое circ очереди: ");
                for (i = 0; i < 0; i++) {
                        ch = iQ.get();
                        System.out.print(ch);
                }
                System.out.println();
	}
}
