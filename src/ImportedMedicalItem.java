
public class ImportedMedicalItem implements NonTaxableGoods, ImportedGoods{
    double price = 0;
    double salesTax = 0;
    double importDutyTax = 0;

    public ImportedMedicalItem(double price) {
        this.price = price;
    }

    @Override
    public double importDuty() {
        return 0;
    }

    @Override
    public double salesTax() {
        return 0;
    }
}