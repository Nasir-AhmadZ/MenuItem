package ie.atu;

public class OnlineOrderingSystem {
    public static void main(String[] args) {
        //create an array or list of menuItem objects
        MenuItem[] menuItems = new MenuItem[]{
                //add menu items
                new Burger(8.99,"Classic Burger","Beef patty, lettuce, tomato,cheese"),
                new Pizza("Margherita Pizza",12.99,"Tomato sauce, mozzarella, basil"),
                new Salad("Caeser Salad",6.99,"Romaine lettuce, croutons, Caeser dressing")
        };

        //Display details of each of menu item
        for (MenuItem menuItem : menuItems)
        {
            //Print out the Name, Description and price for each item
            System.out.println("Name: "+menuItem.getName()+"\nDescription: "+ menuItem.getDescription()+"\nPrice: €"+menuItem.getPrice()+"\n");
        }

        //Calculate and display the total cost of the order
        double totalCost =0;
        for(MenuItem menuItem :menuItems){
            //total cost of all menuItem prices in an order
            totalCost+=menuItem.getPrice();
        }
        System.out.println(("Total cost: €"+ totalCost));
    }
}