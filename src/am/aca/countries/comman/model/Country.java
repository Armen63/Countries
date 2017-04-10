package am.aca.countries.comman.model;

/**
 * Created by Armen on 4/10/2017.
 */
public class Country {
    private Integer id;
    private String countryCode;
    private String englishName;
    private String frenchName;

    public Country(Integer id, String countryCode, String englishName, String frenchName) {
        this.id = id;
        this.countryCode = countryCode;
        this.englishName = englishName;
        this.frenchName = frenchName;
    }

    public Country(){}
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getFrenchName() {
        return frenchName;
    }

    public void setFrenchName(String frenchName) {
        this.frenchName = frenchName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countryCode=" + countryCode +
                ", englishName='" + englishName + '\'' +
                ", frenchName='" + frenchName + '\'' +
                '}';
    }

}
