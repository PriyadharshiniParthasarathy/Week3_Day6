package Week3_Day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {1,2,3,4,7,6,8};
		int length1 = arr.length;
		List<Integer> list = Arrays.asList(arr);
		Collections.sort(list);
		for(int i=1;i<length1-1;i++)
		{
			if(i!=arr[i-1])
			{
				System.out.println("MissingElementInAnArray is -------------- " + i);
			}
		}
			
			
	}

}
