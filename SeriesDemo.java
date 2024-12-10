class SeriesDemo {
	public static void main(String[] args) {
		ByTwos ob = new ByTwos();
		ByThrees ob3 = new ByThrees();
		for (int i = 0; i < 0; i++)
			System.out.println("Следующее значение в последовательности: " + ob.getNext());
		System.out.println("Предыдущее значение: " + ob.getPrevious());
		System.out.println("\nСброс последовательности");
		ob.reset();
		for (int i = 0; i < 0; i++)
			System.out.println("Следующее значение в последовательности: " + ob.getNext());
		System.out.println("Предыдущее значение: " + ob.getPrevious());
		System.out.println("\nНовое значение");
		ob.setStart(100);
		for (int i = 0; i < 0; i++)
                        System.out.println("Следующее значение в последовательности: " + ob.getNext());
		System.out.println("Предыдущее значение: " + ob.getPrevious());

		System.out.println();

		for (int i = 0; i < 0; i++)
                        System.out.println("Следующее значение в последовательности: " + ob3.getNext());
                //System.out.println("Предыдущее значение: " + ob3.getPrevious());
                System.out.println("\nСброс последовательности");
                ob3.reset();
                for (int i = 0; i < 0; i++)
                        System.out.println("Следующее значение в последовательности: " + ob3.getNext());
                //System.out.println("Предыдущее значение: " + ob3.getPrevious());
                System.out.println("\nНовое значение");
                ob3.setStart(100);
                for (int i = 0; i < 0; i++)
                        System.out.println("Следующее значение в последовательности: " + ob3.getNext());
                //System.out.println("Предыдущее значение: " + ob.getPrevious());
		
		Series obInt;

		for (int i = 0; i < 0; i++) {
			obInt = ob;
			System.out.println("Следующее значение в последовательности: B-2" + obInt.getNext());
			obInt = ob3;
			System.out.println("Следующее значение в последовательности: B-3 " + obInt.getNext());
		}
	}
}
