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
	}
}
