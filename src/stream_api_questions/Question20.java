package stream_api_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//In a given array of integers,return true if it conatins distinct values
//false otherwise
//I/P:int[] arr = {5,4,1,0,8,2};
//O/P:true


public class Question20 {
	public static void main(String[] args) {
		int[] arr = {5,4,1,0,8,2};
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		 
		 boolean ans = list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())).values().stream().noneMatch(x->x > 1);
		
		System.out.println(ans);
	}

}
