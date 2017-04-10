package am.aca.countries.comman.model;

import java.util.Comparator;

/**
 * Created by Armen on 4/10/2017.
 */
public class CompareByFrenchName implements Comparator<Country> {

    @Override
    public int compare(Country o1, Country o2) {
        return o1.getFrenchName().compareTo(o2.getFrenchName());
    }
}
