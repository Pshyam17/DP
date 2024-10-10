import java.util.ArrayList;
import java.util.Arrays;
public class knap10 {
    public static void main(String [] args){
        //Initialize array of profits
        ArrayList <Integer> p = new ArrayList<>();
       //Initialize array of weights
       ArrayList <Integer> w = new ArrayList<>();
        Integer [] profits = {1,2,5,6};
        p.addAll(Arrays.asList(profits));
        System.out.println("profits " + p);
        Integer [] weights = {2,3,4,5};
        w.addAll(Arrays.asList(weights));
        System.out.println("weights " + w);

    }
    
}
