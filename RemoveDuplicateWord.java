package Week3_Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split = text.split(" ");
		   Set<String> updatedarraylist = new LinkedHashSet<String>();//- Updated list
		   for(String Arraylist:split)
		    {
		    	updatedarraylist.add(Arraylist);
		    		
		    	}
		   
			System.out.println(updatedarraylist);
				
	}

}