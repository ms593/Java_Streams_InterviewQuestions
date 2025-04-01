package stream_api_questions;
//find the intersection of two list
//i/p:list1 = Arrays.asList(1,2,3,4,5);list2 = Arrays.asList(4,5,6,7);
//o/p:[4,5];
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question28 {
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
	    List<Integer> list2 = Arrays.asList(4,5,6,7);
	    List<Integer> ans = list1.stream().filter(list2::contains).collect(Collectors.toList());
	    System.out.println(ans);
	}

}
