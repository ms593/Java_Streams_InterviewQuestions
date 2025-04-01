package stream_api_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question29 {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("123","abc","456","def");
		
		List<String> ans = list.stream().filter(x->x.matches("[0-9]+")).collect(Collectors.toList());
		
		System.out.println(ans);
		
	}

}
