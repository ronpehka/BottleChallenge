public class Barrel {
    private double capacity;
    protected double drinkInLitres;
    private String drinkType;

    public Barrel(double capacity, double drinkInLitres, String drinkType) {
        this.capacity = capacity;
        if (drinkInLitres > capacity){
            System.out.println("CANNOT do that, adjust parameters, capacity has to be" +
                    " >= with drink inside");

        } else{
            this.drinkInLitres = drinkInLitres;
        }

        this.drinkType = drinkType;
    }

    public void fillBottle(Bottle bottle){
        if(drinkInLitres > bottle.capacity){
            drinkInLitres = drinkInLitres - bottle.capacity;
            System.out.println("Bottle is filled");
            System.out.printf("There is left %f l of drink left in %s barrel %n",drinkInLitres,drinkType);
        }else{
            System.out.println("Cannot do that, barrel need refilling");
        }
    }
    public void fillingBottles(Bottle bottle){
        if(drinkInLitres < bottle.capacity)System.out.println("Cannot fill a bottle");
        int numOfBottles = 0;
        while(bottle.capacity < drinkInLitres){
            drinkInLitres = drinkInLitres -bottle.capacity;
            numOfBottles++;

        }
        System.out.printf("We could fill %d number of bottles %n",numOfBottles);
    }
}
