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
        ingredients="Beef Patty, lettuce, tomato, cheese";
        return ingredients;
    }

    @Override
    public double getPrice() {
        price=8.99;
        return price;
    }

    @Override
    public String getName() {
        name = "Classic Burger";
        return name;
    }
}
