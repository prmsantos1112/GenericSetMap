package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProgramStream {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7); 
		// Stream<Integer> stream = list.stream(); 		
		System.out.println(Arrays.toString(list.toArray()));
		
		Stream<String> stream_1 = Stream.of("Maria", "Alex", "Bob"); 		
		System.out.println(Arrays.toString(stream_1.toArray()));
		
		Stream<Integer> stream_2 = Stream.iterate(0, x -> x + 2);		
		System.out.println(Arrays.toString(stream_2.limit(10).toArray()));
		
		// Fibonacci
		Stream<Long> stream_3 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]); 
		System.out.println(Arrays.toString(stream_3.limit(20).toArray()));


	}

}
