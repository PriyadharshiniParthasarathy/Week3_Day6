package Week3_Day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		   Set<Integer> updatedarraylist = new HashSet<Integer>();//- Updated list
		   for(Integer Arraylist:arr)
		   {
			   if(updatedarraylist.add(Arraylist)==false)
			   {
				   System.out.println("Duplicate elements is -------------- " + Arraylist);
			   }
		   }
		

}

	}