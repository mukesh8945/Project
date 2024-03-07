package Project;

import java.util.*;

class BookDetails {
    // Instance Variables
    public String bCode, bName, bAuthor;
    public float bPrice;
    public int bQty;

    // instance method
    public void getBookDetails() {

        System.out.println("****BookDetails********");
        System.out.println("BookDetails:" + bCode);
        System.out.println("BookName:" + bName);
        System.out.println("BookAuthor:" + bAuthor);
        System.out.println("BookPrice:" + bPrice);
        System.out.println("BookQty:" + bQty);

    }
}

class WriteData {
    // Instance variable
    public BookDetails bd = null;

    // constructure to initialize instance variables
    public WriteData(BookDetails bd) {
        this.bd = bd;
    }

    public void readBookDetails(Scanner s) {
        System.out.println("Enter the BookCode");
        bd.bCode = s.nextLine();
        System.out.println("Enter The BookAuthor:");
        bd.bAuthor = s.nextLine();
        System.out.println("Enter BookName:");
        bd.bName = s.nextLine();
        System.out.println("Enter BookPrice:");
        bd.bPrice = s.nextFloat();
        System.out.println("Enter BookQty:");
        bd.bQty = s.nextInt();

    }

}

class ReadData {
    // Instance variables
    public BookDetails bd = null;

    // constructor to initilize to instance variable
    public ReadData(BookDetails bd) {
        this.bd = bd;
    }

    // Instance method
    public void disBookDetails() {
        bd.getBookDetails();
    }
}

public class References_App3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BookDetails bd = new BookDetails();
        WriteData wd = new WriteData(bd);
        ReadData rd = new ReadData(bd);

        wd.readBookDetails(s); // Scanner Object as parameter
        rd.disBookDetails();
        s.close();

    }

}