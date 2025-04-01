package stream_api_questions;

import java.util.Arrays;
import java.util.Comparator;

//Given a sentence,find the word that has the highest length
//I/P: String s = "I am learning Streams API in Java"
//O/P:learning

public class Question1 {
	
	public static void main(String[] args) {
		String s = "I am learning Streams API in Java";
		String ans = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();
		System.out.println(ans);
	}

}
