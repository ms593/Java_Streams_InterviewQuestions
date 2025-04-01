package stream_api_questions;
//Given a sentence,find the word  that has the 2nd highest length
//Input: String s ="I am learning streams api in java"
//Output : streams
import java.util.Arrays;
import java.util.Comparator;

public class Question3 {
	
	public static void main(String[] args) {
		
		String s ="I am learning streams api in java";
		String ans = Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
		System.out.println(ans);
	}

	

}
