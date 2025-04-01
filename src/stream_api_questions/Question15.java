package stream_api_questions;

import java.util.Arrays;
import java.util.stream.Collectors;

//Find the product of the first two elements from an array
//I/P:int[] arr ={12,,5,6,9,2,4}
//O/P:60
public class Question15 {
	public static void main(String[] args) {
		
		
		int[] arr = {12,5,6,7,8};
		
		Integer ans = Arrays.stream(arr).boxed().collect(Collectors.toList()).stream().limit(2).reduce(1,(a,b)->a*b);
		
		System.out.println(ans);
	}

}
