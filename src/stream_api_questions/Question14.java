package stream_api_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings,create a list that contains only integers
//I/P: String[]  s = {"abc","123","456","xyz"};
//O/P: [123,456]
public class Question14 {
	public static void main(String[] args) {
		String[]  s = {"abc","123","456","xyz"};
		List<Integer> ans = Arrays.stream(s).filter(x->x.matches("[0-9]+")).map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(ans);
	}

}
