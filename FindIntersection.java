package Week3_Day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;


public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)*/
		
		int arr1[] = {3,2,11,4,6,7};	 
		int arr2[] = {1,2,8,4,9,7};
		List<Integer> list = new ArrayList<>();
		LinkedHashSet<Integer> set = new LinkedHashSet<>();// duplicate are not allowed & insertion order is maintained.
		for(int set1:arr1)
		{
			set.add(set1);
		}
		
		for(int set2:arr2)
		{
			if(set.contains(set2))
			{
				list.add(set2);
			
			}
		}	System.out.println("FindIntersection-------------- " + list);
		

	}

}
