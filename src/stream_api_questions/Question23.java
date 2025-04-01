package stream_api_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question23 {
	
	//Given a list of string,return a map of the String and its length
	//I/P: List<String> fruits = Arrays.asList("orange","banana","Kiwi");
	//O/P:{orange=6, banana=6, Kiwi=4}
	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("orange","banana","Kiwi");
		
		Map<String, Integer> ans = fruits.stream().collect(Collectors.toMap(fruit->fruit, String::length));
		
		System.out.println(ans);
		
	}

}
