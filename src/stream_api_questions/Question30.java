package stream_api_questions;

import java.util.stream.Stream;
//concatenate 2 streams

public class Question30 {
	
	public static void main(String[] args) {
		
		Stream<String> stream1 = Stream.of("java","python");
		Stream<String> stream2 = Stream.of("c","c++");
		
		Stream<String> ans = Stream.concat(stream1, stream2);
		ans.forEach(System.out::println);
		
	}

}
