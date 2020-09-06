import java.io.*;
import java.lang.*;
class Book{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String book_name;
    int isbn;
    String author;
    String publisher;

    Book(){
      book_name="jivan";
      isbn=1000;
      author="sarvajeet";
      publisher="nilabh books";
    }

    public void getbook_name()throws IOException{
        System.out.println("Enter book name");
        book_name = br.readLine();
    }
    public void getisbn()throws IOException{
        System.out.println("Enter isbn number ");
        isbn = Integer.parseInt(br.readLine());
    }
    public void getauthor()throws IOException {
        System.out.println("Enter author name");
        author = br.readLine();
    }
    public void getpublisher()throws IOException{
        System.out.println("Enter publisher name");
        publisher = br.readLine();
    }
     public void setbook_name(String book)
    {
        this.book_name=book;
    }
    public void setisbn(int isbn)
    {
       this.isbn=isbn;
    }
    public void setauthor(String author)
    {
        this.author=author;
    }
    public void setpublisher(String publisher)
    {
        this.publisher=publisher;
    }

    public void displayinfo()
    {
        System.out.println("\n Book name "+book_name);
        System.out.println("\n ISBN number "+isbn);
        System.out.println("\n Author name "+author);
        System.out.println("\n Publisher name "+publisher);
    }
}

public class Main
{
    public static void main(String [] args)
    throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Book [] book = new Book [30];
        int i=0;
        System.out.println(" How many books info you want to store ");
        int n = Integer.parseInt(br.readLine());
        System.out.printf("you want to give the values by get method or set method \nEnter 1 for get method \n 2 for set method");
        int ch = Integer.parseInt(br.readLine());
        try
        {
        if(ch==1)
        {
        for(i=0;i<n;i++)
        {
            System.out.printf("\n Enter %d book Details\n",i+1);
            book[i]=new Book();
            book[i].getbook_name();
            book[i].getisbn();
            book[i].getauthor();
            book[i].getpublisher();
        }
        }
        else
        {
            book[i]=new Book();
            book[i].setbook_name("seth");
            book[i].setisbn(100000);
            book[i].setauthor("sarvajeet");
            book[i].setpublisher("Nilabh");
        }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        for(i=0;i<n;i++)
        {
            book[i].displayinfo();
            System.out.println();
        }
    }
}
