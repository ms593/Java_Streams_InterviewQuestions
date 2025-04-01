package stream_api_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question27 {
	
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5};
		
		List<Integer> asList = Arrays.asList(arr);
		
	    Optional<Integer> ans = asList.stream().reduce((a,b)->a*b);
	    
	    if(ans.isPresent()) {
	    	System.out.println(ans.get());
	    }
	}

}
