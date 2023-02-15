public class Box {
    private String boxType;
    private double priceOfBox;
    private double boxWeight;
    private int bottleHoles;

    public Box(String boxType, double priceOfBox, double boxWeight, int bottleHoles) {
        this.boxType = boxType;
        this.priceOfBox = priceOfBox;
        this.boxWeight = boxWeight;
        this.bottleHoles = bottleHoles;
    }

    public double getTotalWeight(Bottle bottle, Drink drink) {
        if (bottleHoles != 0) {
            return bottleHoles * bottle.getBottleWeight() + bottleHoles * drink.weight;
        } else {
            return boxWeight;
        }
    }

    public void getPrice(int bottleNr, Bottle bottle, Drink drink) {
        double price;
        if (bottleNr == bottleHoles) {
            price = bottleHoles * drink.getPricePerLitre() * bottle.capacity + bottle.getRecyclePrice() + priceOfBox;
            System.out.printf("Total price is $%.2f $%n", price);
        } else if (bottleNr > bottleHoles) {
            price = bottleNr * drink.getPricePerLitre() * bottle.capacity + bottle.getRecyclePrice() + 2 * priceOfBox;
            System.out.printf("Total price is $%.2f , we have %d that can be filled%n", price, 2 * bottleHoles - bottleNr);
        } else {
            price = bottleNr * drink.getPricePerLitre() * bottle.capacity + bottle.getRecyclePrice() + priceOfBox;
            System.out.printf("Total price is $%.2f , we have %d that can be filled %n", price, bottleHoles - bottleNr);
        }


    }

    public int getBottleHoles() {
        return bottleHoles;
    }

    public void fillBoxOfBottles(int nrOfBottles,Barrel barrel, Bottle bottle, Drink drink) {
        double price;
        double weight;
            if (barrel.drinkInLitres >=nrOfBottles* bottle.capacity) {
                if(nrOfBottles == bottleHoles){
                    price = nrOfBottles * drink.getPricePerLitre() * bottle.capacity + bottle.getRecyclePrice() + priceOfBox;
                    weight = nrOfBottles * drink.getWeight() * bottle.getBottleWeight() + boxWeight;
                    System.out.printf("Total price will be: $%.2f %n" +
                            " Total weight will be %.2f kg %n", price, weight);
                }else{
                    System.out.println("Need a bigger box");
                }
            }else{
                System.out.println("Barrel needs refilling");
            }


    }
}
//    public void boxBarrel(int bottleNr,Barrel barrel, Bottle bottle, Drink drink){
//
//            double price;
//            double weight;
//            for( int i = 0; bottleNr <= bottleHoles; bottleNr--){
//                if(barrel.drinkInLitres > bottle.capacity){
//                    barrel.drinkInLitres -= bottle.capacity;
//                    //price = i * drink.getPricePerLitre() * bottle.capacity + bottle.getRecyclePrice() + priceOfBox;
//                    //weight = i *
//                }else{
//                    price = i * drink.getPricePerLitre() * bottle.capacity + bottle.getRecyclePrice() + priceOfBox;
//                    weight = i * drink.getWeight() + i*bottle.getBottleWeight() + boxWeight;
//                    System.out.printf(" We could fill %d slots in a box %n" +
//                            "Total price will be: $%.2f %n" +
//                            " Total weight will be %.2f kg %n",bottleHoles-i,price,weight);
//                    break;
//                }
//
//            }price = i * drink.getPricePerLitre() * bottle.capacity + bottle.getRecyclePrice() + priceOfBox;
//        weight = i * drink.getWeight() + i*bottle.getBottleWeight() + boxWeight;
//        System.out.printf(
//                "Total price will be: $%.2f %n" +
//                        " Total weight will be %.2f kg %n",price,weight);
//
//    }
//}
