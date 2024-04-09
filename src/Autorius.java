//        Sukurti klasę Autorius. Autorius turi vardą, pavardę, gimimo metus.
public class Autorius {
    private String vardas, pavarde;
    private int birthYear;

    public Autorius(String vardas, String pavarde, int birthYear) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.birthYear = birthYear;
    }
    public String getAuthor(){
        return vardas + " " + pavarde + " " + birthYear;
    }
}
