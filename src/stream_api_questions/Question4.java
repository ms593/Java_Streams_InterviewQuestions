package stream_api_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

// Find the length of 2nd highest word in a sentence
//Input: String s ="I am learning streams api in java";
//Output:7;
public class Question4 {
	
	public static void main(String[] args) {
	 String s ="I am learning streams api in java";
	 Integer ans = Arrays.stream(s.split(" ")).map(x->x.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	 System.out.println(ans);
	}
}
