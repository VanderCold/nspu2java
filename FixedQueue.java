class FixedQueue implements ICharQ {
	private char[] q;
	private int putloc, getloc;

	public FixedQueue (int size) {
                q = new char[size];
                putloc = getloc = 0;

        }
	public void put(char ch) {
                if(putloc == q.length) {
                        System.out.println(" - очередь переполнена!");
                        return;
                }
                q[putloc++] = ch;
        }

        //Метод для извлечения символа из очереди
        public char get() {
                if(getloc == putloc) {
                        System.out.println(" - очередь пуста");
                        return (char) 0;
                }
                return q[getloc++];
        }
}
