package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
//import java.util.List;

public class Driver {
    public static void main(String[] args) {
        // Create sets
        IntegerSet setA = new IntegerSet();

        // Add elements to setA
        setA.add(1);
        setA.add(2);
        setA.add(3);
        
        System.out.println("Value of SetA is:" + setA.toString());
        System.out.println("Largest value in SetA is:" + setA.largest()); //returns largest value in set A
        System.out.println("Smallest value in SetA is:" + setA.smallest());//returns smallest value in Set A
        
        //Removes elements from setA
        setA.remove(2);
        System.out.println("\nValue of SetA is(after removing 2): " + setA.toString());
        setA.remove(4);
        System.out.println("Value of SetA is(after removing 4): " + setA.toString());
        
        //Add elements back
        setA.add(2);
        System.out.println("Value of SetA is(after adding 2 back): " + setA.toString()); 
        
        
        //Add elements to setB
        IntegerSet setB = new IntegerSet();
        setB.add(3);
        setB.add(4);
        setB.add(5);

        System.out.println("\nValue of SetB is: " + setB.toString());
        System.out.println("Largest value in SetB is: " + setB.largest()); //returns largest value in set B
        System.out.println("Smallest value in SetB is: " + setB.smallest());//returns smallest value in Set B

      //Removes elements from setB
        setB.remove(4);
        System.out.println("\nValue of SetB is(after removing 4): " + setB.toString());
        setB.remove(10);
        System.out.println("Value of SetB is(after removing 10): " + setB.toString());
        
        //Add elements back
        setB.add(4);
        System.out.println("Value of SetB is(after adding 4 back): " + setB.toString()); 
        
        
        IntegerSet setC;
        // Testing union
        System.out.println("\nUnion of SetA and SetB"); //prompt for union of setA and setB
        System.out.println("Value of SetA is: " + setA.toString()); // setA before Union 
        System.out.println("Value of SetB is: " + setB.toString()); // setB before Union 
        setC = new IntegerSet(new ArrayList<>(setA.set));
        setC.union(setB);
        System.out.println("Union of A and B: " + setC); //result of union of setA and setB

        // Testing intersection
        System.out.println("\nIntersection of SetA and SetB"); //prompt for union of setA and setB
        System.out.println("Value of SetA is: " + setA.toString()); // setA before intersection 
        System.out.println("Value of SetB is: " + setB.toString()); // setB before intersection
        setC = new IntegerSet(new ArrayList<>(setA.set));
        setC.intersect(setB);
        System.out.println("Intersection of A and B: " + setC); //result of intersection of Set A and Set B

        // Testing difference
        System.out.println("\nDifference of SetA and SetB"); //prompt for difference of setA and setB
        System.out.println("Value of SetA is: " + setA.toString()); // setA before difference
        System.out.println("Value of SetB is: " + setB.toString()); // setB before difference 
        setC = new IntegerSet(new ArrayList<>(setA.set));
        setC.diff(setB);
        System.out.println("Difference of A and B: " + setC); //result of difference of Set A and Set B

        // Testing complement
        System.out.println("\nComplement of SetA"); //prompt for complement of setA and setB
        System.out.println("Value of SetA is: " + setA.toString()); // setA before complement
        //System.out.println("Value of SetB is: " + setB.toString()); // setB before complement
        setC = new IntegerSet(new ArrayList<>(setA.set));
        setC.complement(setB);
        System.out.println("Complement of A with respect to B: " + setC); //result of complement of Set A and Set B

        
       
        
        // Testing other methods
        System.out.println("\nLength of A: " + setA.length()); 
        System.out.println("\nIs set A empty? " + setA.isEmpty());
        System.out.println("\nIs 3 present in set A? " + setA.contains(3));
    
        // Clear the set
        System.out.println("\nValue of SetA is: " + setA.toString()); // setA before Union 
        System.out.println("Value of SetB is: " + setB.toString()); // setB before Union 
        setA.clear();
        setB.clear();
        System.out.println("After clearing, set A: " + setA.toString());
        System.out.println("After clearing, set B: " + setB.toString());
   }
}

 

