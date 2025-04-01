package stream_api_questions;

import java.util.stream.IntStream;
//write a stream program to move all zeroes to beginning  of array int
//I/P:int arr[]={5,0,1,0,8,0};
//O/P:{0,0,0,5,1,8}

public class Question18 {
//write a stream program to multiply alternative numbers
//i/p:int arr[]= {4,5,1,7,2,9,2};
//o/p:16 	
	
	
	
	public static void main(String[] args) {
		int arr[]= {4,5,1,7,2,9,2};
		
		int ans = IntStream.range(0, arr.length).filter(x->x%2==0).map(x->arr[x]).reduce(1,(a,b)->a*b);
		
		System.out.println(ans);
	}

}
