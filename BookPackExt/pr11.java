package BookPackExt;
import BookPack.Book;
//import BookPack.*
class pr11 {
        public static void main(String[] args) {
                Book[] books = new Book[5];
                books[0] = new Book("Иллиада","Гомер",1980);
                books[1] = new Book("Унесенные ветром","Митчелл",2000);
                books[2] = new Book("Наедине с собой","Аврелий",1950);
                books[3] = new Book("Собор Парижской богоматери","Гюго",1970);
                books[4] = new Book("Преступление и наказание","Достоевский",1950);
                for(int i=0; i < books.length; i++)
                        books[i].show();
        }
}

