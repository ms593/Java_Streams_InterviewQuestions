package stream_api_questions;

import java.util.Arrays;
import java.util.List;

//Remove duplicates from the string and return in the same order
//I/P: String s = "dabcadefg"
//O/P: dabcefg
public class Question2 {
	public static void main(String[] args) {
		String s = "appleeee";
		Arrays.stream(s.split("")).distinct().forEach(System.out::print);
	}

}
