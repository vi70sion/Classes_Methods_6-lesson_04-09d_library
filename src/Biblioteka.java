//Sukurti klasę Biblioteka, kuri turi knygų sąrašą. Klasėje turi būti pridėjimo
//į sąrašą metodas ir gražaus knygos iš sąrašo spausdinimo metodas.

import java.util.ArrayList;

public class Biblioteka {
    ArrayList<Knyga> booksList = new ArrayList<Knyga>();

    public void addToBooksList(Knyga book){
        booksList.add(book);
    }


}
