package domain;
/** * (Use Javadoc tags to document your code too. *
 *  * @author 6187002 *
 *  *  Title:            Challenge 2*
 *  * Semester:         COP3804 - Fall 2022*
 *  Professor's Name: Prof. Charters*
 *  Description of Program’s Functionality: Simulates a shopping cart with an item to purchase class *
 *  */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Armani L. Weise
 * PID: 6187002
 */
public class ItemToPurchase {
    private String itemName,itemDescription;
    private double itemPrice;
    private int itemQuantity;

    public ItemToPurchase(String itemName, String itemDescription, double itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public ItemToPurchase()
    {
        this.itemName = "";
        this.itemPrice = 0.00;
        this.itemQuantity = 0;
        this.itemDescription = "";
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void printItemCost(){
        System.out.printf("%s %d @ $%f = $%.2f\n",itemName,itemQuantity,itemPrice,itemPrice*itemQuantity);
    }
    public void printItemDescription(){
        System.out.printf("%s: %s\n",itemName,itemDescription);
    }
}

