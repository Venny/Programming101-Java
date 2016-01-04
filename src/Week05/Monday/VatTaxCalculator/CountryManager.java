package Week05.Monday.VatTaxCalculator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by inspired on 03.01.16.
 */
public class CountryManager {
    private static CountryManager countryManager;
    private HashMap<String, Country> countries = new HashMap<>();
    private String defaultCountryKey;

    private CountryManager(){
    }

    private void initDefaultCountry(){
        Iterator<Map.Entry<String, Country>> iterator = countries.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Country> entry = iterator.next();
            String key = entry.getKey();
            Country country = entry.getValue();
            if(country.isDefault()){
                defaultCountryKey = key;
            }
        }
    }

    public static CountryManager getInstance(){
        if(countryManager == null){
            countryManager = new CountryManager();
        }
        return countryManager;
    }

    public Country getCountry(String countryCode) throws NotSupportedCountryException {
        if(!countries.containsKey(countryCode)){
            throw new NotSupportedCountryException(("Country not supported"));
        }
        return countries.get(countryCode);
    }

    public void changeDefaultCountry(Country newDefault) throws NotSupportedCountryException {
        String newDefaultId = newDefault.getCountryId();

        Country country = getCountry(defaultCountryKey);
        countries.put(defaultCountryKey,
                new Country(defaultCountryKey, country.getName(), false, country.getVatTax()));
        countries.put(newDefaultId,
                new Country(newDefaultId, newDefault.getName(), true, newDefault.getVatTax()));
        defaultCountryKey = newDefaultId;
    }

    public void add(Country country){
        countries.put(country.getCountryId(), country);
        initDefaultCountry();
    }

    public void add(Country[] countries){
        for(Country country: countries){
            this.countries.put(country.getCountryId(), country);
        }
    }

    public void remove(Country country){
        countries.remove(country.getCountryId());
    }

    public void remove(Country[] countries){
        for(Country country: countries){
            this.countries.remove(country.getCountryId());
        }
    }

    public String getDefaultCountryCode(){
        return defaultCountryKey;
    }
}
