package stream_api_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Convert a list of integers to a list of their squares.
//I/P:List<Integer> list = Arrays.asList(1,2,3,4,5);
//O/P:[1,4,9,16,25]
public class Question25 {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		List<Integer> ans = list.stream().map(x->x*x).collect(Collectors.toList());
		
		System.out.println(ans);
	}
}
