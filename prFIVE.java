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

		//2D массивы
		System.out.println();
		int [][] arr2D = new int [10][20];
		int t2, i2;
		for (t2 = 0; t2 < 10; t2++) {
			for (i2 = 10; i2 < 30; i2++) {
				arr2D[t2][i2-10] = (t2*100) + i2 + 1;
				if (t2==0)
					System.out.print(arr2D[t2][i2-10] + "  ");
				else
					System.out.print(arr2D[t2][i2-10] + " ");
			}
			System.out.println();
		}
		//2D массив с разным кол-вом элементов
		System.out.println();
		int [][] riders = new int[7][];
		riders[0] = new int[10];
		riders[1] = new int[10];
		riders[2] = new int[10];
		riders[3] = new int[10];
		riders[4] = new int[10];
		riders[5] = new int[2];
		riders[6] = new int[2];
		
		for(int i3 = 0; i3 < 7; i3++)
			for (int j3 = 0; j3 < riders[i3].length; j3++)
				riders[i3][j3] = i3 + j3 + 10;
		System.out.println("Кол-во пассажиров: ");
		for(int i3 = 0; i3 < 5; i3++) {
                        for (int j3 = 0; j3 < riders[i3].length; j3++)
                                System.out.print(riders[i3][j3] + " ");
			System.out.println();
		}
		System.out.println("Кол-во пассажиров в выходные: ");
                for(int i3 = 5; i3 < 7; i3++) {
                        for (int j3 = 0; j3 < 2; j3++)
                                System.out.print(riders[i3][j3] + " ");
                        System.out.println();
		}		
		//Ссылки на массивы
		System.out.println();
		for (int i3 = 0; i3 < 10; i3++)
			sample[i3] = i3;
		for (int i3 = 0; i3 < 10; i3++)
			sample1[i3] = -i3;
		System.out.println("Массив sample[]:");
		for (int i3 = 0; i3 < 10; i3++)
			System.out.print(sample[i3] + " ");
		System.out.println();
		System.out.println("Массив sample1[]:");
		for (int i3 = 0; i3 < 10; i3++)
			System.out.print(sample1[i3] + " ");
		System.out.println();
		System.out.println("sample[]: " + sample + " sample1[]: " + sample1);
		sample1 = sample;
		sample1[4] = 1111;
		System.out.println("Массив sample1[4]:");
		for (int i3 = 0; i3 < 10; i3++)
                        System.out.print(sample[i3] + " ");
                System.out.println();
		System.out.println("sample[]: " + sample + " sample1[]: " + sample1);

		//Копирование массива
		System.out.println();
		int[] sample3 = new int[10];
		for (int i3 = 0; i3 < 10; i3++)
			sample3[i3] = -i3;
		if (sample1.length >= sample3.length)
			for (int i3 = 0; i3 < sample3.length; i3++)
				sample1[i3] = sample3[i3];
		//Вывод
		System.out.println("Массив sample1[] после копирования: ");
		for (int i3 = 0; i3 < sample1.length; i3++)
			System.out.print(sample1[i3] + " ");
		System.out.println();
		
		//for-each
		System.out.println();
		int summ = 0;
		for (int i3 = 0; i3 < 10; i3++)
			summ += sample3[i3];
		System.out.println(summ);

		summ = 0;
		for(int x: sample3) {
			System.out.println("Очередное значение: " + x);
			summ += x;
		}
		System.out.println(summ);

		//for-each для двумерного массива
		summ = 0;
		int val = 22;
		boolean found = false;
		for(int [] x : riders) {
			for(int y : x) {
				if(y == val) {
					found = true;
					break;
				}
				System.out.println("Значение: " + y);
				summ += y;
			}
			System.out.println("Новая строка массива: ");
		}
		System.out.println("Сумма: " + summ);
		if(found)
			System.out.println("Значение найдено!!!!");

		//Самост.
		System.out.println();
		summ = 0;
		val = 8;
		found = false;
                for(int x: sample2) {
			if(x == val) {
				found = true;
				break;
			}
			System.out.println("Значение: " + x);
			summ += x;
		}
		System.out.println("Сумма: " + summ);
		if(found)
			System.out.println("Значение найдено!");
		//Работа со строками
		System.out.println();
		String str1 = new String("Строка 1");
		String str2 = "Строка 2";
		String str3 = new String(str2);
		String str4 = new String(str2);
		//Эксперементы с ссылочными переменными str2 и str3
		str3 = str2;
		System.out.println(str3 + " " + str2);
		str2 = "Новая строка 2, взамен str2";
		System.out.print(str3 + " " + str2);
		if(str1 == str2)
                        System.out.println("Ссылки указывают на один и тот же объект");
                else
                        System.out.println("Ссылки указывают на разные об-ты");
		
		System.out.println();
		if (str1.equals(str2))
			System.out.println("Строки str 1 и 2 равны");
		else
			System.out.println("Строки str 1 и 2 не равны");
		if (str3.equals(str4))
                        System.out.println("Строки str 3 и 4 равны");
                else
                        System.out.println("Строки str 3 и 4 не равны");
		
		if (str1 == str2)
			System.out.println();
		
		int result;
		result = str1.compareTo(str3);
		System.out.println("Результат сравнения строк: " + result);
		//Определение длины строки
		System.out.println("Длина str1: " + str1.length());

		//Возврат символа по номеру индекса
		System.out.println("Первый символ в srt1: " + str1.charAt(0) + "\n" + ((int)str1.charAt(1)));
		char ch;
		for (int i3 = 0; i3 < str1.length(); i3++)
			System.out.print(str1.charAt(i3));
		System.out.println();

		//Возврат индекса подстроки
		System.out.println("Первый \"рок\" в str2: " + str2.indexOf("рок"));
		System.out.println("Последний \"рок\" в str2: " + str2.lastIndexOf("рок"));

		System.out.println();
		String[] strs = {"Эл-ты", "строк.", "массива", "для", "примера"};
		System.out.println("Исходный массив: ");
		for (String s : strs)
			System.out.print(s + " ");
		System.out.println("\n");

		strs[1] = "измененного стр.";
		strs[3] = "для ещё одного";
		System.out.println("Измененный массив: ");
		for (String s : strs)
                        System.out.print(" " + s);
                System.out.println("\n");

		str2 = "";
		for (String s : strs)
			str2 += " " + s;
		System.out.println("Строка str2: " + str2);
		String substr = str2.substring(10, 25);
		System.out.println("Строка str2: " + str2 + "\nПодстрока substr: " + substr);
		
		//Оператор switch, управляемый строками
		String command = "";
		switch(command) {
			case "connect":
				System.out.println("Подключение");
				break;
			case "cancel":
				System.out.println("Отмена");
                                break;
			case "disconnect":
                                System.out.println("Отключение");
                                break;
			default:
                                System.out.println("Неверная команда");
                                break;
		}
		System.out.println("Программе передано " + args.length + " агрументов");
		System.out.println("Список агрументов: ");
		for (String s : args)
			System.out.println(s);

		System.out.println();
		//Поиск строки в справочнике
		String[][] numbers = {
			{"Поликлиника", "148-82-28"},
			{"Энергосбыт", "137-78-93"},
			{"Управляющая компания", "342-23-12"},
			{"Энергетическая компания", "432-89-25"}
		};
		int i12;

		if (args.length != 1)
			System.out.println("Задайте 1 аргумент при запуске программы: ");
		else {
			for (i12=0; i12 < numbers.length; i12++) {
				if (numbers[i12][0].equals(args[0])) {
					System.out.println(numbers[i12][0] + ": " + numbers[i12][1]);
				break;
				}

			}
			if (i12 == numbers.length)
				System.out.println("Строка не найдена");
		}
	}
}

