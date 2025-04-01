package stream_api_questions;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Given a string,find the first repeated character
//I/P: String s = 'Hello world'
//O/P: l

public class Question12 {
	public static void main(String[] args) {
		
		String s = "Hello World";
		
	    Map<Character, Long> collect = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
	    
	    System.out.println(collect);
	    
	    Character ans = collect.entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).findFirst().get();
		
		System.out.println(ans);
	}
	

}
