public class Main {
    public static void main(String[] args){
        Author authorOne = new Author("Лев" ,"Толстой");
        System.out.println("authorOne = " + authorOne);
        Book bookOne = new Book("Война и мир",authorOne,1886);
        bookOne.setAuthor(authorOne);
        bookOne.setPublicationYear(2000L);
        System.out.println("bookOne = " + bookOne);

        Author secondAuthor = new Author("Льюис", " Кэрролл");
        System.out.println("secondAuthor = " + secondAuthor);
        Book secondBook = new Book("Алиса в Стране чудес",secondAuthor, 1865);
        System.out.println("secondBook = " + secondBook);


    }
}