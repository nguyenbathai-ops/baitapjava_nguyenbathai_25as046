package ex21;

public class book {
    private String name;
    private Author author;
    private int qty = 0;
    private double price;

    public book(String name, Author author, double price) {
        this.name=name;
        this.author=author;
        this.price=price;
    }
    public book(String name, Author author, double price,int qty) {
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "ex21.book{" + "name='" + name + '\'' + ", author=" + author + ", qty=" + qty + ", price=" + price + '}';
    }
}
