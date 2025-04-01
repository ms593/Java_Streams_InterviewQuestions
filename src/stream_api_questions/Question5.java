package stream_api_questions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Given a sentence,find  the occurence of each word :-
//I/P: String s =" I am learning Streams Api in Java Java ";
//O/P: Java=2,in=1,Api=1...
public class Question5 {
	
	public static void main(String[] args) {
		  String s ="I am learning Streams Api in Java Java";
	      Map<String, Long> ans = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(ans);

}
}
