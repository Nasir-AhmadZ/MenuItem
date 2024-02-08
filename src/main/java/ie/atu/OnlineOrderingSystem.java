package ie.atu;

public class OnlineOrderingSystem {
    public static void main(String[] args) {
        //create an array or list of menuItem objects
        MenuItem[] menuItems = new MenuItem[]{
                //add menu items
        };

        //Display details of each of menu item
        for (MenuItem menuItem : menuItems)
        {
            //Print out the Name, Description and price foe each item
        }

        //Calculate and display the total cost of the order
        double totalCost =0;
        for(MenuItem menuItem :menuItems){
            //total cost of all menuItem prices in an order
        }
        System.out.println(("Total cost: €"+ totalCost));
    }
}