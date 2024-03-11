import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {
        ArrayList<String> Bikes = new ArrayList<>();
        Bikes.add("Meteor 350");
        Bikes.add("Himalayan");
        Bikes.add("Intruder");

        //Write a Java program to retrieve an element (at a specified index) from a given array list
        String bike1 =Bikes.get(0);
        System.out.println(bike1);
    }
}
