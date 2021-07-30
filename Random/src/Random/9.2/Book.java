public class Book
{
    private String bookTitle;

    public Book()

    {
        System.out.println("called book constructor");
        bookTitle = "";
        
    }
    
    public Book(String title)
    
    {
        
        System.out.println("called book constructor2");
        bookTitle = title;

    }

}