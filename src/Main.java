public class Main {
    public static void main(String[] args) {
        Drink drink = new Drink("Beer",2.82,0.4);
        Bottle bottle = new Bottle(0.33,"glass",0.4,0.2);
        System.out.println(bottle.getBottleWeight(drink,false));
        System.out.printf("The price is %.2f € for a bottle %n",bottle.getPrice(drink,false));
        Barrel barrel = new Barrel(140,110,"Dark Beer");
      //  barrel.fillBottle(bottle);
        //barrel.fillingBottles(bottle);
        Box box = new Box("Wooden",20,16,10);
       box.getPrice(5,bottle,drink);
        box.fillBoxOfBottles(10,barrel,bottle,drink);

    }
}
