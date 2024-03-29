package ie.atu;

import javax.management.monitor.StringMonitorMBean;

public class Pizza implements MenuItem{
    private String name;
    private double price;
    private String ingredients;

    public Pizza(String name, double price, String ingredients) {
        this.name = name;
        this.price = price;
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
    public String getName(){
        return name;
    }
}
