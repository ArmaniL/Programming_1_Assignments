/** * (Use Javadoc tags to document your code too. *
 *  * @author 6187002 *
 *  *  Title:            ChalShopping Cart*
 *  * Semester:         COP3804 - Fall 2022*
 *  Professor's Name: Prof. Charters*
 *  Description of Program’s Functionality: Simulates the lottery *
 *  */



package domain;

import java.util.ArrayList;

public class ShoppingCart {
    private String customerName,currentDate;
    private ArrayList<ItemToPurchase> cartItems;

    public ShoppingCart(){
        this.customerName = "none";
        this.currentDate =  "January 1, 2022";
        cartItems = new ArrayList<>();
    }

    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
        cartItems = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDate() {
        return currentDate;
    }

    public void addItem(ItemToPurchase item){
        cartItems.add(item);
    }

    public void removeItem(String name){
        boolean foundMatch = false;
        ItemToPurchase toremove=null;
        for (ItemToPurchase item : cartItems){
            if( name.equals(item.getItemName())){
                toremove = item;
                foundMatch = true;

            };
        }
        if(!foundMatch){
            System.out.println("Item not found in cart. Nothing removed.");
        }else {

            cartItems.remove(toremove);
        }
    }

    public void modifyItem(ItemToPurchase item){
        boolean foundMatch = false;
        for (ItemToPurchase cartItem : cartItems){
             if(cartItem.getItemName().equals(item.getItemName())){
                 cartItem.setItemQuantity(item.getItemQuantity());
                 foundMatch = true;
             };

        }
        if(!foundMatch){
            System.out.println("Item not found in cart. Nothing modified.");
        }
    }

    public int getNumItemsInCart(){
        int count =0;
        for (ItemToPurchase item : cartItems){
            count+=item.getItemQuantity();
        }
        return count;
    }
    public double getCostCart(){
        double cost = 0.0;
        for (ItemToPurchase item : cartItems){
            cost+=item.getItemPrice()*item.getItemQuantity();
        }
        return cost;
    }
    public void printTotal(){


                if(getNumItemsInCart()>0){
                    System.out.printf("%s`s Shopping Cart - %s\n",customerName,currentDate);
                    System.out.printf("Number of Items:%d\n\n",getNumItemsInCart());
                    for (ItemToPurchase item : cartItems){
                        item.printItemCost();
                    }
                }
                    else{
            System.out.println("SHOPPING CART IS EMPTY");}

        }


     public void printDescriptions(){
         System.out.printf("%s`s Shopping Cart - %s\n",customerName,currentDate);
         System.out.printf("Number of Items:%d\n\n",getNumItemsInCart());
         System.out.print("Item Descriptions\n");
         for (ItemToPurchase item : cartItems){
             item.printItemDescription();
         }
     }

}
