public class Drink  {
    private String name;
    private double pricePerLitre;
    protected double weight;

    public Drink(String name, double pricePerLitre, double weight) {
        this.name = name;
        this.pricePerLitre = pricePerLitre;
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }
}
