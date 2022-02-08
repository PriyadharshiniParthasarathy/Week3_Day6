package Week3_Day2;


import java.util.Arrays;
import java.util.Collections;


public class Classroom_Assignment_SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		//sorts array in descending order  
		Arrays.sort(input, Collections.reverseOrder());   
		//prints the sorted string array in descending order  
		System.out.println(Arrays.toString(input));  
		}  
		}  