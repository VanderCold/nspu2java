class Mod {
	private int alpha; //закрытая переменная
		public int beta; //открытая
		int sigma; //по умолчанию
		void setAlpha(int a) {
			alpha = a;
		}
		int getAlpha() {
			return alpha;
		}
}
//Передача объектов
class Block {
	int a, b, c;
	int V;
	
	Block(int i, int j, int k) {
		a = i;
		b = j;
		c = k;
		V = a * b * c;
	}

	//Проверка эквивалетности двух блоков
	boolean sameBlock(Block ob) {
		if ((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
		else return false;
	}
	//Проверка равенства V
	boolean sameV(Block ob) {
		if(ob.V == V) return true;
		else return false;
	}
}

class Farray { //F
	private int[] a;
	private int errorVal;
	public int length;

	public Farray(int size, int errV) {
		a = new int[size];
		errorVal = errV;
		length = size;
	}

	public int get(int index) {
		if(indexOK(index))
			return a[index];
		return errorVal;
	}

	public boolean put(int index, int val) {
		if (indexOK(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}

	private boolean indexOK(int index) {
		if (index >= 0 & index < length)
			return true;
		return false;
	}
}	
class CallByValue {
	void noChange(int i11, int j11) {
		i11 = i11 * j11;
		j11 = -j11;
	}
}
class CallByRef {
	int a12, b12;
	CallByRef (int i12, int j12) {
		a12 = i12;
		b12 = j12;
	}
        void change(CallByRef ob5) {
                ob5.a12 = ob5.a12 + ob5.b12;
                ob5.b12 = -ob5.b12;
        }
}

class ErrorMsg {
	String[] msgs = {
		"ERROR Вывод",
		"Error ввод",
		"Нет памяти",
		"Вне границ"
	};
	String getErrorMsg(int i13) {
		if (i13>=0 & i13<msgs.length) return msgs[i13];
		else return "Осутствует код для ошибки";
	}
}

class Err {
	String msg;
	int severity;
	Err(String m, int s) {
		msg = m;
		severity = s;
	}
}

class ErrorInfo {
        String[] msgs2 = {
                "ERROR Вывод",
                "Error ввод",
                "Нет памяти",
                "Вне границ"
        };
	int[] howBad = {3,3,2,4};
	Err getErrorInfo(int i14) {
		if (i14 >= 0 & i14 < msgs2.length)
			return new Err(msgs2[i14], howBad[i14]);
		else
			return new Err("Ошбка непонятна", 0);
	}
}

class OverLoad {
	void ovlDemo() {
		System.out.println("Без параметров");
	}
	void ovlDemo(int a15) {
		System.out.println("Один из параметров int: " + a15);
	}
	int ovlDemo(int a15, int b15) {
		System.out.println("Два из int: " + a15 + " " + b15);
		return a15+b15;
	}
	double ovlDemo(double a15, double b15) {
		System.out.println("Два из double: " + a15 + " " + b15);
		return a15-b15;
	}
}

class OverLoad2 {
	void f(int x) {
		System.out.println("Внутри int: " + x);
	}
	void f(double x) {
		System.out.println("Внутри double: " + x);
	}
	void f(byte x) {
                System.out.println("Внутри byte: " + x);
        }

}

class OverLoad3 {
	int x;

	OverLoad3() {
		System.out.println("Внутри OL3()");
		x = 0;
	}
	OverLoad3(int i19) {
		System.out.println("Внутри OL3(int)");
		x = i19;
	}

	OverLoad3(double d19) {
		System.out.println("Внутри OL3(double)");
		x = (int) d19;
	}

	OverLoad3(int i19, int j19) {
		System.out.println("Внутри OL3(int, int)");
		x = i19*j19;
	}
}

class Summation {
	int sum;

	Summation(int num) {
		sum = 0;
		for (int i20 = 1; i20 <= num; i20++)
			sum += i20;
	}
	Summation(Summation ob) {
		sum = ob.sum;
	}
}

class pr7evilExes {
	public static void main(String[] args) {
		Mod ob = new Mod();
		ob.setAlpha(77);
		System.out.println("Значение: " + ob.getAlpha());
		ob.beta = 242;
		ob.sigma = 34;

		System.out.println();
		Farray fs = new Farray(5, -999);
		
		int x;
		System.out.println("Скрытая обработка ошибок");
		for (int i=0; i < (fs.length * 2); i++)
			fs.put(i, i*10);
		for (int i=0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if (x != -999) System.out.print(x + " ");
		}
		System.out.println();
		
		for (int i=0; i < (fs.length * 2); i++) {
                        if(!fs.put(i, i*10))
				System.out.println("Индекс " + i + " выходит за границы");
		}

		for (int i=0; i < (fs.length * 2); i++) {
                        x = fs.get(i);
                        if (x != -999) System.out.print(x + " ");
			else
				System.out.println("Индекс " + i + " выходит за границы");
                }
		System.out.println();

		System.out.println();
		Block ob1 = new Block(10, 2, 5);
		Block ob2 = new Block(10, 2, 5);
		Block ob3 = new Block(4, 5, 5);
		System.out.println("ob2: " + ob1.sameBlock(ob2));
		System.out.println("ob3: " + ob1.sameBlock(ob3));
		System.out.println("ob3 V: " + ob1.sameV(ob3));
		
		System.out.println();
		CallByValue ob4 = new CallByValue();
		int a11 = 15, b11 = 20;

		System.out.println("a11 & b11 before: " + a11 + " " + b11);

		ob4.noChange(a11, b11);
		System.out.println("a11 & b11 after: " + a11 + " " + b11);
		
		System.out.println();
		CallByRef ob6 = new CallByRef(15, 20);

		System.out.println("a12 & b12 before: " + ob6.a12 + " " + ob6.b12);
		ob6.change(ob6);
		System.out.println("a12 & b12 after: " + ob6.a12 + " " + ob6.b12);
		
		ErrorMsg err = new ErrorMsg();

		System.out.println(err.getErrorMsg(2));
		System.out.println(err.getErrorMsg(20));
		
		System.out.println();

		//

		ErrorInfo err2 = new ErrorInfo();
		Err e;
		e = err2.getErrorInfo(2);
		System.out.println(e.msg + ", уровень: " + e.severity);
		e = err2.getErrorInfo(20);
                System.out.println(e.msg + ", уровень: " + e.severity);
		
		//

		System.out.println();
		OverLoad ob7 = new OverLoad();
		int resI;
		double resD;

		ob7.ovlDemo();
		System.out.println();
		ob7.ovlDemo(2);
		System.out.println();
		resI = ob7.ovlDemo(4, 6);
		System.out.println("Результат: " + resI);
                System.out.println();
                resD = ob7.ovlDemo(5.1, 3.5);
                System.out.println("Результат: " + resD);
                System.out.println();
		
		//
		
		OverLoad2 ob8 = new OverLoad2();
		int i18 = 10;
		double d18 = 10.1;
		byte b18 = 99;
		short s18 = 10;
		float f18 = 11.5F;
		ob8.f(i18);
		ob8.f(d18);
		ob8.f(b18);
		ob8.f(s18);
		ob8.f(f18);
		
		//

		System.out.println();
		OverLoad3 t1 = new OverLoad3();
		OverLoad3 t2 = new OverLoad3(88);
		OverLoad3 t3 = new OverLoad3(17.23);
		OverLoad3 t4 = new OverLoad3(2, 4);
		System.out.println("t1: " + t1.x);
		System.out.println("t2: " + t2.x);
		System.out.println("t3: " + t3.x);
		System.out.println("t4: " + t4.x);
		
		//

		System.out.println();
		Summation s1 = new Summation(5);
		Summation s2 = new Summation(s1);
		System.out.println("s1: " + s1.sum);
		System.out.println("s2: " + s2.sum);
	}
}
