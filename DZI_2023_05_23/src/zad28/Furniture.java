package zad28;

public abstract class Furniture {
protected String typeProduct;
protected double productionPrice;

    Furniture(String typeProduct, double productionPrice){
        setTypeProduct(typeProduct);
        setProductionPrice(productionPrice);
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        if(typeProduct.isEmpty())throw new IllegalArgumentException("The product type must be a non-empty string.");
        this.typeProduct = typeProduct;
    }

    public double getProductionPrice() {
        return productionPrice;
    }

    public void setProductionPrice(double productionPrice){
        if(productionPrice <= 0)throw new IllegalArgumentException("The product price must be a number over 0.");
            else this.productionPrice = productionPrice;
    }

    abstract double PriceClient();
}
