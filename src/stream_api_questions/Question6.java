package stream_api_questions;

import java.util.Arrays;

//Given a sentence,find the words with a specified number of vowels
//No of vowels:2
//I/P: String s = "I am learning Streams API in Java"
//O/P:Streams,API,Java
public class Question6 {
	
	public static void main(String[] args) {
		String s = "I am learning Streams API in Java";
		Arrays.stream(s.split(" ")).filter(x->x.replaceAll("[^AEIOUaeiou]","").length()==2).forEach(System.out::println);
	}

}
 