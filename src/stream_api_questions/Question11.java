package stream_api_questions;

import java.util.Arrays;
import java.util.stream.Stream;

//Given a String, find the first non-repeated character
//I/P: String s = "Hello World"
//O/P: H
public class Question11 {
	public static void main(String[] args) {
		String s = "Hello world";
	    String ans = Arrays.stream(s.split("")).filter(x->s.indexOf(x)==s.lastIndexOf(x)).findFirst().get();
	    System.out.println(ans);
		
	}

}
  