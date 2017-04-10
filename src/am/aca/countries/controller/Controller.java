package am.aca.countries.controller;

import am.aca.countries.comman.model.CompareByCountryCode;
import am.aca.countries.comman.model.CompareByEnglishName;
import am.aca.countries.comman.model.CompareByFrenchName;
import am.aca.countries.comman.model.Country;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by Armen on 4/10/2017.
 */
public class Controller {
    public void execute() throws IOException {
        FileReader countriesFromFile = new FileReader("C:\\Users\\Armen\\Countries\\src\\am\\aca\\countries\\resource\\countries.csv");
        BufferedReader fileReader = new BufferedReader(countriesFromFile);
        String myLine;
        Country[] countries = new Country[249];
        int i = 0;
        while ((myLine = fileReader.readLine()) != null) {
            String [] celiTox = myLine.split(",");
            countries[i] = new Country();

            countries[i].setId(i+1);
            countries[i].setCountryCode(celiTox[0]);
            countries[i].setEnglishName(celiTox[1]);
            countries[i].setFrenchName(celiTox[2]);

            i += 1;
        }
        countriesFromFile.close();

        System.out.println("@st inchi sortavrel " +
                "\n 1: By Country code " +
                "\n 2: By English name" +
                "\n 3: By French name");
        Scanner input = new Scanner(System.in);
        int inputByUser = input.nextInt();
        switch (inputByUser) {
            case 1:
                Arrays.sort(countries, new CompareByCountryCode());
                printSortedCountries(countries);
                break;
            case 2:
                Arrays.sort(countries, new CompareByEnglishName());
                printSortedCountries(countries);
                break;
            case 3:
                Arrays.sort(countries, new CompareByFrenchName());
                printSortedCountries(countries);
                break;
        }
    }
    public void printSortedCountries(Country[] countries){
        for (Country country : countries) {
            System.out.println( "ID [" +country.getId()+"] " + " " + country.getCountryCode() + " " + country.getEnglishName() + " " + country.getFrenchName());
        }
    }
}
