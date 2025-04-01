package stream_api_questions;

import java.util.Arrays;
import java.util.List;

public class Question21 {
//Find the sum of all the elements in a list.
//I/P:List<Integer> num = Arrays.asList(1,2,3,4,5);
//O/P:15	
	
	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1,2,3,4,5);
		int sum = num.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
	}

}
