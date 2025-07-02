public class Book {
    private String title;
    private String author;
    private double price;


    void displayInfo() {
        System.out.println("Enter the title: "+title);
        System.out.println("Enter the author name: "+author);
        System.out.println("Enter the price of the book: "+price);
    }

    public Book(String title,String author,double price) {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public static void main(String[] args) {
                Book b=new Book("you cant win","Michael Porrel", 230.0);

                b.displayInfo();



            }

        }

