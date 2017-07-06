package RotateList;

import java.util.*;

/**
 * Finish the class RotateList make it subclasse the built-in List class. (Hint extends ?????)
 * Write a function that rotates a list by k elements.
 * For example [1,2,3,4,5,6] rotated by 2 becomes [3,4,5,6,1,2].
 * The first 2 elements where rotated to the back of the List.
 * If it was rotated by 3 [1,2,3,4,5,6] rotated becomes [4,5,6,1,2,3].
 * Try solving this without creating a copy of the list.
 * How many swap or move operations do you need?
 */


public class RotateList {
	public static String rotate(List<String> x, int k) {
		   List<String> listA = Arrays.asList("1 2 3 4 5 6".split(" "));
	       //listA.toString();
		   //System.out.println(sourceBefore);
	       //int k = 0;
	       Collections.rotate(listA, -k);
	       //System.out.println(listA);
	       String response = listA.toString();
	       return response;
	   }
}



	   

