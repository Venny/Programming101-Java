package Week05.Monday.ShopInventory;

import Week05.Monday.VatTaxCalculator.Country;
import Week05.Monday.VatTaxCalculator.NotSupportedCountryException;
import Week05.Monday.VatTaxCalculator.VatTaxCalculator;

/**
 * Created by inspired on 05.01.16.
 */
public class Product {
    private int productId;
    private String productName;
    private Country country;
    private int quantity;
    private double price;
    private double priceWithoutTax;

    public Product(int productId, String productName, Country country, int quantity, double priceWithoutTax) throws NotSupportedCountryException {
        this.productId = productId;
        this.productName = productName;
        this.country = country;
        this.quantity = quantity;
        this.priceWithoutTax = priceWithoutTax;
        this.price = VatTaxCalculator.CalculateTax(priceWithoutTax, country.getCountryId());
    }
}
