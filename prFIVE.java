//Массивы и строки

class Arrays {
	public static void main(String args[]) {
		int[] sample = new int[10];
		int sample1[] = new int[10];
		int i;

		for(i = 0; i < 10; i++)
			sample[i] = 2*i;
		for(i = 0; i < 10; i++)
			System.out.println("Элемент массива с индексом " + i + ": " + sample[i]);

		System.out.println();
		sample1[0] = 99;
		sample1[1] = 20;
		sample1[2] = 90;
		sample1[3] = -242;
		sample1[4] = -20;
		sample1[5] = 3;
		sample1[6] = 53;
		sample1[7] = 51;
		sample1[8] = -67;
		sample1[9] = 22;
		
		int max, min;
		min = max = sample1[0];
		for (i = 1; i < 10; i++) {
			if (sample1[i] < min) min = sample1[i];
			if (sample1[i] > max) max = sample1[i];
		}
		System.out.println("Макс и мин значения: " + min + " / " + max);
		
		//Инциализация массива
		System.out.println();
		int[] sample2 = {87, 100, -42, 34, 25, -25, -424, 64, 74, 8};
                min = max = sample2[0];
                for (i = 1; i < 10; i++) {
                        if (sample2[i] < min) min = sample2[i];
                        if (sample2[i] > max) max = sample2[i];
                }
                System.out.println("Макс и мин значения: " + min + " / " + max);

		//Пузырькова сортировка
		System.out.println();
		int size = sample2.length;
		int a, b, t; 
		//Показываем ориг. массив
		System.out.print("Исходный массив:");
		for (i = 0; i < size; i++)
			System.out.print(" " + sample2[i]);
		System.out.println();

		//Сортировка
		for (a = 1; a < size; a++)
		       for (b = size - 1; b >= a; b--) {
				if (sample2[b-1] > sample2[b]) {
					t = sample2[b-1];
					sample2[b-1] = sample2[b];
					sample2[b] = t;
				}
			}
		//Вывод отсортированнго массива
		System.out.print("Отсортированный массив: ");
		for (i = 0; i < size; i++)
                        System.out.print(" " + sample2[i]);
                System.out.println();
	}
}
