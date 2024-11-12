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

class Outer {
	int[] nums;
	Outer(int[] n) {
		nums = n;
	}

	void analyze() {
		Inner inOb = new Inner();
		System.out.println("Минимальное значение: " + inOb.min());
		System.out.println("Максимальное значение: " + inOb.max());
		System.out.println("Среднее значение: " + inOb.avg());
	}

	class Inner {
		int min() {
			int m = nums[0];
			for (int i = 1; i < nums.length; i++)
				if (nums[i] < m) m = nums[i];
			return m;
		}
		int max() {
                        int m = nums[0];
                        for (int i = 1; i < nums.length; i++)
                                if (nums[i] > m) m = nums[i];
                        return m;
                }
		int avg() {
                        int a = 0;
                        for (int i = 0; i < nums.length; i++)
                                a +=  nums[i];
                        return a/nums.length;
                }
	}
}

class StaticBlock {
	static double rootOf2;
	static double rootOf3;
	static {
		System.out.println("Внутри статического блока");
		rootOf2 = Math.sqrt(2.0);
		rootOf3 = Math.sqrt(3.0);
	}
	StaticBlock(String msg) {
		System.out.println(msg);
	}
}

class VarArgs {
	static void vaTest(int ... v) {
		System.out.println("Кол-во аргументов: " + v.length);
		System.out.println("Содержимое: ");
		for (int i = 0; i < v.length; i++)
			System.out.println(" аргумент " + i + ": " + v[i]);
		System.out.println();
	}
	static void vaTest2(String msg, int ... v) {
		System.out.println(msg + v.length);
		for (int i = 0; i < v.length; i++)
                        System.out.println(" аргумент " + i + ": " + v[i]);
                System.out.println();
	}
	static void vaTest3( int ... v) {
                System.out.println("vaTest3(int ...)" + " Кол-во аргументов: " + v.length);
		System.out.println("Содержимое: ");
                for (int i = 0; i < v.length; i++)
                        System.out.println(" аргумент " + i + ": " + v[i]);
                System.out.println();
        }
	static void vaTest3( boolean ... v) {
                System.out.println("vaTest3(boolean ...)" + " Кол-во аргументов: " + v.length);
                System.out.println("Содержимое: ");
                for (int i = 0; i < v.length; i++)
                        System.out.println(" аргумент " + i + ": " + v[i]);
                System.out.println();
        }
	static void vaTest3(String msg, int ... v) {
                System.out.println("vaTest3(String, int  ...)" + " Кол-во аргументов: " + v.length);
                System.out.println("Содержимое: ");
                for (int i = 0; i < v.length; i++)
                        System.out.println(" аргумент " + i + ": " + v[i]);
                System.out.println();
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
	
		//
		
		System.out.println();
		StaticBlock ob = new StaticBlock("Внутри конструктора");

		System.out.println("Корень из 2: " + StaticBlock.rootOf2);
		System.out.println("Корень из 3: " + StaticBlock.rootOf3);
		
		System.out.println();

		//

		int[] x = {3, 2, 1, 5, 6, 9, 7, 2};
		Outer outOb = new Outer(x);

		outOb.analyze();
		
		class ShowBt {
			int numbits;
			ShowBt(int n) {
				numbits = n;
			}
			void show(long val) {
				long mask = 1;
				mask <<= numbits-1;

				int spacer = 0;
				for(;mask!=0; mask>>=1) {
					if((val & mask) != 0)
						System.out.print("1");
					else
						System.out.print("0");
					spacer++;
					if((spacer%8) == 0) {
						System.out.print(" ");
						spacer = 0;
					}
				}
			System.out.println();
			}
		}
		System.out.println();
		for (byte b = 0; b < 10; b++) {
			ShowBt byteval = new ShowBt(8);
			System.out.print(b + " в десятичном виде: ");
			byteval.show(b);
		}
		
		System.out.println();

		//

		VarArgs.vaTest(10);
		VarArgs.vaTest(1, 2, 3);
		VarArgs.vaTest();

		System.out.println();

		VarArgs.vaTest2("1 аргумент: ", 10);
                VarArgs.vaTest2("2 аргумента: ", 1, 2, 3);
                VarArgs.vaTest2("Без аргументов");
		
		System.out.println();

		//

		VarArgs.vaTest3(10, 20);
                VarArgs.vaTest3("2 аргумента: ", 1, 2, 3);
                VarArgs.vaTest3(true, false, false);
	}
}
