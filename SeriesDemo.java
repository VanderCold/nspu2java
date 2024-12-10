class SeriesDemo {
	public static void main(String[] args) {
		ByTwos ob = new ByTwos();
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
	}
}
