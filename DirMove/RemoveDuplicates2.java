package DirMove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 1, 2, 2, 2, 5, 5, 2, 7, 1, 7, 9, 2, 9};
		List<Integer> lst = IntStream.of(a).boxed().collect(Collectors.toCollection(ArrayList ::new));
		lst.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

	}

}
