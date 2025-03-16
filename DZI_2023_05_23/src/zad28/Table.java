package zad28;

public class Table extends Furniture{
    Table(String typeProduct,double productionPrice){
        super(typeProduct,productionPrice);

    }

    @Override
    double PriceClient() {
        return 0.2 * getProductionPrice() + getProductionPrice();
    }

    @Override
    public String toString() {
        return "The table costs <" + String.format("%.2f",PriceClient()) +"> lv.";
    }
}
