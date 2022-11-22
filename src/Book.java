public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String name, Author author, double price, int qty) {
        setName(name);
        setAuthor(author);
        setPrice(price);
        setQty(qty);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public String toString() {
        String fullString = "Book " + this.getName() +
                ", Author: " + this.author.getName() +
                ", " + this.author.getEmail() +
                ", " + this.author.getGender() +
                ", price: " + this.getPrice() +
                ", qty: " + this.getQty();
        return fullString;
    }
}
