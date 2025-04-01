package stream_api_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question22 {
	
	//Sort a list of strings in alphabetical order.
	//I/P:List<String> str= Arrays.asList("Zudio","Puma","NareshIT","MohitIT","AshokIT")
	//O/P:
	public static void main(String[] args) {
		List<String> str= Arrays.asList("Zudio","Puma","NareshIT","MohitIT","AshokIT");
		List<String> ans = str.stream().sorted().collect(Collectors.toList());
		System.out.println(ans);
	}

}
