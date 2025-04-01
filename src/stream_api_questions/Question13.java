package stream_api_questions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//Given an array of integers,group the numbers by the range in which they belong
//I/P: arr[]={2,3,10,14,20,24}
//O/P:{0=[2,3],10=[10,14],20=[20,24]}

public class Question13 {
	public static void main(String[] args) {
		int arr[]= {2,3,10,14,20,24,30,34,40,44};
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(list);
		Map<Integer, List<Integer>> ans = list.stream().collect(Collectors.groupingBy(x->x/10 * 10,LinkedHashMap::new,Collectors.toList()));
		System.out.println(ans);
	}

}
