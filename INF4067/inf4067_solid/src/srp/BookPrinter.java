package inf4067_solid.src.srp;

public class BookPrinter{
    public void printToScreen(BookSRP book){
        System.out.println("=== Print to Screen === ");
        System.out.println("Titre: " +book.getTitle());
        System.out.println("Titre: " +book.getAuthor());
        System.out.println("Titre: " +book.getContent());
    }

    public void printToHTML(BookSRP book){
        System.out.println("=== Print to HTML === ");
        System.out.println("<h1> " +book.getTitle() + "</h1>");
        System.out.println("<h2>Par " +book.getAuthor() + "</h2>");
        System.out.println("<p> " +book.getContent() + "</p>");
    }

}