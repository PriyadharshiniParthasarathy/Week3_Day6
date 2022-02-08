package Week3_Day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class Classroom_Assignment_RemoveDuplicatesletter{

	public static void main(String[] args) {


			String Input = "PayPal India"  ;
			Input = Input.replaceAll("\\s", "");
			char[] ch = Input.toCharArray();  
			
			Set<Character> updatedarraylist = new LinkedHashSet<Character>();//- Updated list
			   for(Character Arraylist:ch)
			    {
			    	updatedarraylist.add(Arraylist);
			    		
			    	}
			   
				System.out.println(updatedarraylist);
					
			
			
		}

	}
