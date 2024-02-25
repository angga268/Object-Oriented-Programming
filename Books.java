public class Books {
    String author;
    String title;
    double price;
    double num;

    public Books (String author, String title, double price, double num){
        this.author = author;
        this.title = title;
        this.price = price;
        this.num = num;

    }
    public double getPrice(){
        return price;
    }
}
