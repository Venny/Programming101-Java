package Week05.Monday.VatTaxCalculator;

/**
 * Created by inspired on 03.01.16.
 */
public class Country {
    private final String countryId;
    private final String name;
    private final boolean isDefault;
    private final double vatTax; // from 0 to 1

    public Country(String countryId, String name, boolean isDefault, double vatTax) {
        if(vatTax < 0 || vatTax > 1){
            throw new IllegalArgumentException("Invalid Vat Tax");
        }

        this.countryId = countryId;
        this.name = name;
        this.vatTax = vatTax;
        this.isDefault = isDefault;
    }

    public String getCountryId(){
        return countryId;
    }

    public String getName(){
        return name;
    }

    public boolean isDefault(){
        return isDefault;
    }

    public double getVatTax(){
        return vatTax;
    }
}
