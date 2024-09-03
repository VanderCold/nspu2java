class proga001 {
	public static void main(String args[]) {
		System.out.println("Я такой proga001, блин, class.");
		//а-ля hello world, вывод текста
		int Var1 = 1024;
		int VarRezerv;
		//System.out.println(VarRezerv); Ничего ещё не присвоено, всё ломается
		VarRezerv = 411;
		System.out.println(Var1/2);
		System.out.println("Целочисленное деление: " + VarRezerv/2);
		System.out.println("Деление типом данных: " + (double)VarRezerv/2);
		double Var3 = (double)VarRezerv/2;
		//Пример того как работать с if :

		//if(Var1=0) ГОВНО, ОТРАВА!!!!!!!!!!!!!!!!!!!!!
		//	System.out.println("Условние Var1=0 выполнено!");
		if(Var1/2 == 512)
                        System.out.println("Условние Var1/2 == 512 выполнено!");
		if(true)
                        System.out.println("Условние true выполнено!");
		System.out.println("Проверяем");
		System.out.println();
		//Пример for
		for (int i=0; i<10; i++)
			System.out.println("Номер" + i);
		System.out.println();
		int j;
		for (j=0; j<10; j++)
                        System.out.print(j + " ");
		//i = 10; Локальная переменная, присутствует чисто в цикле, всё ломает
		System.out.println();
	}		
}
