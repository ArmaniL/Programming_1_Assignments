
import java.util.ArrayList;


public class Bowl {

    //-----------------------------------------------------
    private ArrayList<Fruit> fruits;
    private String color;
    private int size;
    //-----------------------------------------------------

    public Bowl(ArrayList<Fruit> fruits, String color, String size) {
        this.fruits = fruits;
        this.color = color;
        this.size = Integer.valueOf(size);
    }

    //-----------------------------------------------------
    public ArrayList<Fruit> getFruits() {
        return fruits;
    }

    //-----------------------------------------------------
    public void setFruits(ArrayList<Fruit> fruits) {
        this.fruits = fruits;
    }

    //-----------------------------------------------------
    public String getColor() {
        return color;
    }

    //-----------------------------------------------------
    public void setColor(String color) {
        this.color = color;
    }

    //-----------------------------------------------------
    public int getSize() {
        return size;
    }

    //-----------------------------------------------------
    public void setSize(int size) {
        this.size = size;
    }

    //-----------------------------------------------------
    public void displayInfo(){
        System.out.printf("Type->Bowl-> Color: %-10s\tsize:%-8d\n",color, size);
        if(fruits.size()>0){
            for(Fruit fruit: fruits){
                System.out.printf("\t\tType->Fruit-> Type: %-10s\tWeight:%-8.1f\n",fruit.getType(), fruit.getWeight());
            }//end for
        }//end if
    }
    //-----------------------------------------------------

}
