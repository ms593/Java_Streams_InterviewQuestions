package stream_api_questions;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group/Pair anagrams from a list of Strings.For 1 word consider 1 anagram.
//I/P: String s = {'pat','tap,'pan','nap','team','tree','meat'};
//0/P: [[pan,nap],[pat,tap],[Team,meat],[tree]]
public class Question16 {
	
	public static void main(String[] args) {
		
		String [] s = {"pat","tap","pan","nap","Team","tree","meat"};
		
		List<String> list = Arrays.asList(s);
		
		Collection<List<String>> ans = list.stream().collect(Collectors.groupingBy(x->Arrays.stream(x.toLowerCase().split("")).sorted().collect(Collectors.toList()))).values();
		
		System.out.println(ans);
		
		
		
	}

}
