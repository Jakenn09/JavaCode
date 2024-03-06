
/**
*i. An array of doubles called edges, which represent the edges/sides of the polygon: edges should be accessible to inheriting classes, but not public.
*ii. A constructor that takes in an array of doubles and uses it to initialize edges
*iii. A method double perimeter() that returns the polygon’s perimeter

**/


import java.util.ArrayList;
import java.util.Scanner;

public class Polygon {
    private ArrayList<Double> edges = new ArrayList <Double>();
    
    public void addEdges(double num){
        this.edges.add(num);
        System.out.println("Size of array: " + this.edges.size());
        
        for (double n: edges){
            System.out.println("Elements of the array: " + n);
        }
    }
    
}