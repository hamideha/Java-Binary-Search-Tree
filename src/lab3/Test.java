/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
package lab3;
public class Test {
    public static void main(String[] args){
            int[] d1 = {1, 0, 6, 3, 2, 7, 5, 8, 4}; //no repetitions
            int[] d2 = {5, 6, 5, 1, 2, 3, 2, 7, 9, 8, 10, 12, 4, 11};//with repetitions
            int v1 = 1; //value in set d1
            int v2 = 9; //value not in set d1
            int v3 = 0; //another value in set d1

            int[] d3 = {10, 2, 9, 8, 11}; //has elements in common with d1
            int[] d4 = {12, 16, 14, 13, 15}; //no common elements with d1

            int[] d6 = {3, 4, 5, 9, 10, 11, 15, 16, 17, 23, 23, 24, 12, 13}; //almost sorted array
            int[] d7 = {2, 3, 4, 11, 12, 13, 25, 26}; // sorted; has elements in common with d6		

            System.out.println("Test1---constructor1" );
            BSTSet a0 = new BSTSet();
            a0.printBSTSet();
            System.out.println("\n");

            System.out.println("Test2---constructor2---no repetitions" );
            BSTSet a1 = new BSTSet(d1);
            a1.printBSTSet();
            System.out.println("\n");

            System.out.println("Test3---constructor2---with repetitions" );
            BSTSet a2 = new BSTSet(d2);
            a2.printBSTSet();
            System.out.println("\n");

            System.out.println("Test4---isIn(v1)---true" );
            System.out.println("v1 is in set d1");
            System.out.println(a1.isIn(v1));
            System.out.println("\n");

            System.out.println("Test5---isIn(v2)---false" );
            System.out.println("v2 is in set d1");
            System.out.println(a1.isIn(v2));
            System.out.println("\n");

            System.out.println("Test6---add(v1)---v1 was in the set; no change" );
            a1 = new BSTSet(d1);
            a1.add(v1);
            a1.printBSTSet();
            System.out.println("\n");

            System.out.println("Test7---add(v2)---v2 was not in the set; it is added" );
            a1 = new BSTSet(d1);
            a1.add(v2);
            a1.printBSTSet();
            System.out.println("\n");			

            System.out.println("Test9---remove(v2)--v2 was not in the set; no change" );
            a1 = new BSTSet(d1);
            System.out.println(a1.remove(v2)); //false
            a1.printBSTSet();
            System.out.println("\n");

            System.out.println("Test10---remove(v1)--v1 was in the set; it is removed" );
            a1 = new BSTSet(d1);
            a1.printBSTSet();
            System.out.println(a1.remove(v1)); //true
            a1.printBSTSet();
            System.out.println("\n");

            System.out.println("Test11---remove(v3)--v3 was in the set; it is removed" );
            a1 = new BSTSet(d1);
            System.out.println(a1.remove(v3)); //true
            a1.printBSTSet();
            System.out.println("\n");

            System.out.println("Test12---union()---sets with common elements" );
            a1 = new BSTSet(d1);
            BSTSet a3 = new BSTSet(d3);
            BSTSet a5 = a1.union(a3); //union of d1 and d3
            a5.printBSTSet();
            System.out.println("\n");


            System.out.println("Test13---union()---sets without common elements" );
            a1 = new BSTSet(d1);
            BSTSet a4 = new BSTSet(d4);
            a5 = a4.union(a1); //union of d1 and d4
            a5.printBSTSet();
            System.out.println("\n");

            System.out.println("Test14---intersection()---sets with common elements" );
            a1 = new BSTSet(d1);
            a3 = new BSTSet(d3);
            a5 = a3.intersection(a1); //intersection of d1 and d3
            a5.printBSTSet();
            System.out.println("\n");

            System.out.println("Test15---intersection()---sets with no common elements" );
            a1 = new BSTSet(d1);
            a4 = new BSTSet(d4);
            a5 = a1.intersection(a4); //intersection of d1 and d4; should be empty
            a5.printBSTSet();
            System.out.println("\n");


            System.out.println("Test16---intersection()---with empty set" );
            a0 = new BSTSet(); //empty set
            a1 = new BSTSet(d1);
            a5 = a1.intersection(a0); //intersection of d1 and the empty set; should be empty
            a5.printBSTSet();
            System.out.println("\n");

            System.out.println("Test17---size() + height()" );
            a1 = new BSTSet(d1);
            System.out.println("The size of d1 is " + a1.size());
            System.out.println("The height d1 is " + a1.height()); //height should be minimum for bonus
            a1 = new BSTSet(d6);
            System.out.println("The size of d6 is " + a1.size());
            System.out.println("The height of d6 is " + a1.height()); 


            System.out.println("Test18---size() + height()---empty set" );
            a0 = new BSTSet(); //empty set
            System.out.println("The size of the empty set is " + a0.size()); // should be 0
            System.out.println("The height of the empty set is " + a0.height());//should be -1

            System.out.println("Test19---printNonRec()--elements should be in increasing order" );
            a1 = new BSTSet(d1);
            a1.printNonRec(); //set d1
            System.out.println("\n");
            a1 = new BSTSet(d6);
            a1.printNonRec(); //set d6


            //Test bonus
            System.out.println("Test21---bonus" );
            a1 = new BSTSet(d6);
            System.out.println("The height of d6 is " + a1.height());
            a2 = new BSTSet(d7);
            System.out.println("The height of d7 2 is " + a2.height());
            a3 = a1.union(a2); 
            a4 = a1.intersection(a2);
            System.out.println("Print union:");
            a3.printBSTSet(); 
            System.out.println("The height of the union is " + a3.height());
            System.out.println("Print intersection:");
            a4.printBSTSet(); 
            System.out.println("The height of the intersection is " + a4.height());
    }
}
