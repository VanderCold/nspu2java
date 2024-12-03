package BookPackExt;
class pr11 {
        public static void main(String[] args) {
                BookPack.Book[] books = new BookPack.Book[5];
                books[0] = new BookPack.Book("Иллиада","Гомер",1980);
                books[1] = new BookPack.Book("Унесенные ветром","Митчелл",2000);
                books[2] = new BookPack.Book("Наедине с собой","Аврелий",1950);
                books[3] = new BookPack.Book("Собор Парижской богоматери","Гюго",1970);
                books[4] = new BookPack.Book("Преступление и наказание","Достоевский",1950);
                for(int i=0; i < books.length; i++)
                        books[i].show();
        }
}

