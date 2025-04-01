package stream_api_questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//Given an int[] array,re-arrange the elements to form the
//highest/lowest possible value
//I/P: int[]arr={1,2,3,4,5}
//O/P:54321/12345

public class Question9 {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
	Arrays.stream(arr).mapToObj(x->x).sorted(Collections.reverseOrder()).forEach(System.out::print);
	}

}
