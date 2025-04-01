package stream_api_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthOptionPaneUI;
//Find the kth smallest element in a list of integers
//k=3
//I/P:List<Integer> list = Arrays.asList(7,1,6,2,1,3,4,5);
//O/P:2
public class Question26 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(7,1,6,2,1,3,4,5);
		int k =3;
		
		List<Integer> streamInt = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(streamInt);
		
		Integer ans = list.stream().sorted().skip(k-1).findFirst().get();
		
		System.out.println(ans);
		
	}

}
