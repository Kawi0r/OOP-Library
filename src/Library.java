public class Library {
    public static void main(String[] args) {
        Author author01 = new Author("Herbert Schildt", "herbert@gmail.com", 'm');

        Book book1 = new Book("Java - the complete Reference twelfth edition", author01, 60, 1);

        System.out.println(book1.toString());
    }
}
