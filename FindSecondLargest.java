package Week3_Day2;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		Integer[] data = {3,2,11,4,6,7};
		int length1 = data.length;
		List<Integer> list = Arrays.asList(data);
		Collections.sort(list);
		System.out.println("SecondLargest number is -------------- " + list.get(length1 -2));
				
		        }
	
	
}
