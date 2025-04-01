package stream_api_questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Given a word,find the occurence of each character
//I/P: String s = "Mississippi"
//O/P:
public class Question8 {
	
	public static void main(String[] args) {
		
		String s = "Mississippi";
		
		Map<String, Long> ans = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(ans);
		
	}

}
