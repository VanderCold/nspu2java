class Avtomobil {
	int pass; //кол-во пассажиров
	int v; // объем
	double rash; //расход на 100 км
	
	Avtomobil(int p, int V, double r) {
		pass = p;
		v = V;
		rash = r;
	}
	void rasst() {
		System.out.println("Расстояние: " + ((int)(v/rash * 100)));
	}
	
	int rasst2() {
		return (int)(v/rash*100);
	}

	double fuelNeeded(int km) {
		return ((double)km/100)*rash;
	}
}

class prIV {
	public static void main(String args[]) {
		//Создание экземпляра класса
		Avtomobil lada = new Avtomobil(4, 40, 5.5);
		Avtomobil porshe = new Avtomobil(1, 100, 14.0);
		int rasst, rasst2;

		//Присваивание значений внутренним переменным экземпляра класса
		//lada.pass = 4;
		//lada.v = 40;
		//lada.rash = 5.5;

		//porshe.pass = 1;
		//porshe.v = 100;
		//porshe.rash = 14.0;

		System.out.println("Для расстояния в 10 км нужно: " + lada.fuelNeeded(10));
		rasst=10;
		System.out.println("Для расстояния в 10 км нужно: " + lada.fuelNeeded(rasst));


		//Определяем расстояние
		//rasst = (int)(lada.v/lada.rash * 100);
		//rasst2 = (int)(porshe.v/porshe.rash * 100);

		System.out.println("Для Lada: ");
		lada.rasst();
		rasst = lada.rasst2();
		System.out.println("Результ метода rasst2(): " + rasst);

		System.out.println("Для Porshe: ");
		porshe.rasst();
		System.out.println("Результ метода rasst2(): " + porshe.rasst2());
	}
}
