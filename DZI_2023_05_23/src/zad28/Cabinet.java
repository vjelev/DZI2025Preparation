package zad28;

public class Cabinet extends Furniture{
    int numberOfHinges;

    public Cabinet(String typeProduct, double productionPrice,int numberOfHinges){
        super(typeProduct,productionPrice);
        this.numberOfHinges = numberOfHinges;
    }
    double PriceClient(){
        return  ((double) 15/100) * getProductionPrice() + getProductionPrice() + numberOfHinges * 4.50;
    }

    public String toString() {
        return "The cabinet costs <" + String.format("%.2f",PriceClient()) +"> lv.";
    }
}
