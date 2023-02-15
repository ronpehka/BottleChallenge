public class Bottle {
    protected double capacity;
    private String bottleType;
    private double bottleWeight;
    private double recyclePrice;


    public Bottle(double capacity, String bottleType, double bottleWeight, double recyclePrice) {
        this.capacity = capacity;
        this.bottleType = bottleType;
        this.bottleWeight = bottleWeight;
        this.recyclePrice = recyclePrice;
    }


    public double getBottleWeight(Drink drink, boolean isFilled) {
       if(isFilled){
           return bottleWeight + drink.getWeight();
       }else{
           return bottleWeight;
       }

    }

    public double getBottleWeight() {
        return bottleWeight;
    }

    public double getPrice(Drink drink, boolean isFilled){
        return  (isFilled) ? (capacity * drink.getPricePerLitre() + recyclePrice) : recyclePrice;
    }

    public double getRecyclePrice() {
        return recyclePrice;
    }
}
