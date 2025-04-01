package stream_api_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question19 {
	public static void main(String[] args) {
		
		int arr[] = {1,0,0,5,0,1};
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(list);
		
		List<Integer> zeroes = list.stream().filter(x->x==0).collect(Collectors.toList());
		System.out.println(zeroes);
		
		List<Integer> notAZeroes = list.stream().filter(x->x!=0).collect(Collectors.toList());
		System.out.println(notAZeroes);
		
		ArrayList<Integer> resultList = new ArrayList<>();
		resultList.addAll(zeroes);
		resultList.addAll(notAZeroes);
		System.out.println(resultList);
		
		
	}

}
