package pl.coderslab.tdd;

public class TaxesOperation {
    public double calculateVat(int price, int vat) {
        return price * ((double)vat/100);
    }
}
