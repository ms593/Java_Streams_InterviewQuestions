package stream_api_questions;

import java.util.Arrays;

//Given an array find the sum of unique elements
//I/P:int[] arr = {1,6,7,8,1,1,8,8,7}
//O/P:22

public class Question10 {
	public static void main(String[] args) {
		int[] arr = {1,6,7,8,1,1,8,8,7};
		int sum = Arrays.stream(arr).distinct().sum();
		System.out.println(sum);
	}

}
