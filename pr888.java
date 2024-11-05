//Рекурсия
class Factorial {
	int factR(int n) {
		int result;

		if (n==1) return 1;
		result = factR (n-1) * n;
		return result;
	}

	int factI(int n) {
		int t, result;
		result = 1;
		for (t=1; t<=n; t++)
			result *= t;
		return result;
	}
}

class StaticDemo {
	int x;
	static int y;

	int sum() {
		return x + y;
	}
}

class pr888 {
	public static void main(String[] args) {

		Factorial f = new Factorial();

		System.out.println("Вычисление факториала через рекурсию");
		System.out.println("Факториал 3 = " + f.factR(3));
		System.out.println("Факториал 4 = " + f.factR(4));
		System.out.println("Факториал 5 = " + f.factR(5));
		
		System.out.println();
		System.out.println("Вычисление факториала через итерацию");
                System.out.println("Факториал 3 = " + f.factI(3));
                System.out.println("Факториал 4 = " + f.factI(4));
                System.out.println("Факториал 5 = " + f.factI(5));
	
		//

		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();

		ob1.x = 10;
		ob2.x = 20;

		System.out.println("ob1 & ob2 независимы");
		System.out.println("ob1: " + ob1.x + "\nob2: " + ob2.x);

		System.out.println();

		System.out.println("y - общая переменная");
		StaticDemo.y = 19;
		System.out.println("Для y = 19");

		System.out.println("ob1: " + ob1.sum());
		System.out.println("ob2: " + ob2.sum());

		StaticDemo.y = 100;
                System.out.println("Для y = 100");

		System.out.println("ob1: " + ob1.sum());
                System.out.println("ob2: " + ob2.sum());
	}	
}
