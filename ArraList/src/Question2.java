import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a Java program to iterate through all elements in an array list.
public class Question2 {

    //Write a Java program to insert an element into the array list at the first position
    public static void addElementOnTop(List lis,int val){
        lis.add(0,val);
    }
    public static void main(String args[]){
        List<Integer> numericals = new ArrayList<>();
        numericals.add(1);

        int[] numarray = {2,3,4,5};
        for(int i : numarray){
            numericals.add(i);
        }
        //to iterate through all the arraylist
        for(int i : numericals){
            System.out.println(i);
        }

        addElementOnTop(numericals,999);
        System.out.println(numericals);
    }
}
