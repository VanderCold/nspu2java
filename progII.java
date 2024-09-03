class progII {
	public static void main(String args[]) {
		byte b, bb, bbb; //8 bits
		short s, ss, sss; //16 bits
		int i, ii, I; //32 bits
		long l, ll, L; //64 bits
		b = 127;
		bb = (byte)130;
		s = 32000;
		ss = (short)33000;
		System.out.println("bb = " + bb + "\nss = " + ss);
		sss = 100;
		///bbb = sss; Автопреобразования нету, пишем byte, short, int - ручками
		bbb = (byte)sss;
		System.out.println("bbb = " + bbb + "\nsss = " + sss);
		System.out.println();
				
		//Пример использования разных целых типов :
		ii = 700000; // длина в миллиметрах
		int V = ii * ii * ii; // находим объем
		System.out.println("Объем куба: " + V);
		long VV = (long)ii*ii*ii;
		System.out.println("Объем куба, правильный: " + VV);

		double d, dd;
		d = b/2;
		System.out.println("d + " + d);
		dd = (double)b/2;
		System.out.println("dd = " + dd);
	}
}
