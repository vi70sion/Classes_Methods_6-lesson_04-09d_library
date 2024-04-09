import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
//        Bibliotekos aplikacija:

//        Klasėje su main metodu pridėkite naujų knygų į biblioteką ir atspausdinkite
//        knygų sąrašą ekrane. (Darome prielaidą, kad vieną konkrečią knygą parašė vienas autorius).
//
//
//        Jei susipažinote su klasėmis Paths ir Files atliekame sekančią užduotį:
//        Ašsaugoti visą knygų sąrašą projekto šakninėje direktorijoje pavadinimu knygos.txt

        Autorius author1 = new Autorius("Stephen", "King", 1947);
        Knyga book1 = new Knyga(1970, author1, "Carrie to The Dead Zone");
        Biblioteka library = new Biblioteka();
        library.addToBooksList(book1);
        for(Knyga book : library.getLibraryList()){
            System.out.println(book.getBookInfo());
        }
    }
}