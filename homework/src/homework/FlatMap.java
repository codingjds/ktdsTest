package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.add("Java");
		words.add("In");
		words.add("Action");
		System.out.println(words);
		List<String> a = words.stream()
										.map(w -> w.split(""))
										.peek(System.out::println)
										.flatMap(Arrays::stream)
										.collect(Collectors.toList());
			

	}
}
