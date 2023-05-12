package com.streamS;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		Integer numbers[] = {10,12,3,5,15,20};
		
		int count = (int)Arrays.stream(numbers).distinct().count();
		System.out.println("Count :"+count);
		
		Stream<Integer> streamOfArray = Stream.of(numbers);
		streamOfArray.forEach(s -> System.out.print(s+'\t'));
		
		//collection stream
		Collection<String> collection = Arrays.asList("Manojh","Master","Maadduuu");
		Stream<String> streamOfCollection = collection.stream();
		streamOfCollection.forEach(s -> System.out.print(s+"\t"));
		
	}

}
