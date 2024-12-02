package org.example.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/*
 * Steps -
 * 1. implement comparator(imp-define generic) Interface using own comparator class
 * 2. implement its compare method
 * 3. create obj of your created comparator at required place
 * 4. pass the same as 2nd args of "Collection.sort" method
 */


public class ComparatorPractice {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(201,103,302);
		
		for(int i: nums) {
			System.out.println(i);
		}
		
		Comparator<Integer> mycomp = new MyComparator();
		
		Collections.sort(nums,mycomp);


		//Lambda
		Collections.sort(nums,(x,y) -> x%10 - y%10);

		

		for(int i: nums) {
			System.out.println(i);
		}
		
	}
	
}



class MyComparator implements Comparator<Integer>{

	public int compare(Integer o1, Integer o2) {
		
		if( o1%10 < o2%10) {
			return 1;
		}
		
		return -1;
	}

}
