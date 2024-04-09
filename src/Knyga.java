//                Sukurti klasę Knyga, kuri turi išleidimo metus, autorių bei pavadinimą.
public class Knyga {
    private int releaceYear;
    Autorius author;
    private String bookTitle;

    public Knyga(int releaceYear, Autorius author, String bookTitle) {
        this.releaceYear = releaceYear;
        this.author = author;
        this.bookTitle = bookTitle;
    }
    public String getBookInfo(){
        return releaceYear + " " + author.getAuthor() + " " + bookTitle;
    }
}
