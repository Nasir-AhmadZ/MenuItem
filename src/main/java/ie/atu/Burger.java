package ie.atu;

public class Burger implements MenuItem{
    private double price;
    private String name;
    private String ingredients;

    public Burger(double price, String name, String ingredients) {
        this.price = price;
        this.name = name;
        this.ingredients = ingredients;
    }

    @Override
    public String getDescription() {
        return ingredients;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
