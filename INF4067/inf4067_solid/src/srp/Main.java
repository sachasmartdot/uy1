package inf4067_solid.src.srp;

public class Main{
    public static void main(String[] args){
        System.out.println("#### AVANT ####");
        Book book = new Book("Les principes SOLID", "Etudiants de M1-GL", "Revision des principes SOLID");
        book.printToScreen();
        book.saveToDatabase();
        book.emprunter("Martial");

        System.out.println("#### APRES ####");
        BookSRP b = new BookSRP("Les principes SOLID", "Etudiants de M1-GL", "Revision des principes SOLID");
        new BookPrinter().printToHTML(b);
        new BookPrinter().printToScreen(b);
        new BookSaver().saveToDatabase(b);
        new BookBusinessLogic().emprunter(b, "Martial");
    }
}