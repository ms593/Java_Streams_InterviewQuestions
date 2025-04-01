package stream_api_questions;

import java.util.Arrays;
import java.util.List;

public class Question24 {
//Given a list of Strings convert all strings to uppercase and then concatenate
//them  into a single string
//I/P:List<String> alphabets = Arrays.asList("a","b","c","d")
//O/P:A B C D	
	public static void main(String[] args) {
		
		List<String> alphabets = Arrays.asList("a","b","c","d");	
		String ans = alphabets.stream().map(String::toUpperCase).reduce((s1,s2)->s1+" "+s2).orElse("");
		System.out.println(ans);
		
		
	}

}
