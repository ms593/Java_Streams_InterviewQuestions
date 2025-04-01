package stream_api_questions;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

//Given a list of integers,divide it into the lists one having an
//even number and the other having an odd number
//I/P:int[] arr = {1,2,3,4,5,6,7,8}
//O/P:[[1,3,5,7],[2,4,6,8]]

public class Question7 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8};
		
	   List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
	   
	   List<List<Integer>> ans = list.stream().collect(Collectors.partitioningBy(x->x%2==0,Collectors.toList())).entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
	   
	   System.out.println(ans);
	   
	  
		
	}
}
