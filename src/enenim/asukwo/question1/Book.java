package enenim.asukwo.question1;
public class Book {  

    private int id;  

    private String bookName;  

    public Book() {System.out.println("Java");}  

    public Book(int id) {this.id = id;}  

    public Book(String bookName) {  this.bookName = bookName;}  

    public Book(int id, String bookName) {  

        this.id = id;  

        this.bookName = bookName;  

    }  

    void display(){  

        System.out.println(id+" "+bookName);  

    }  
}