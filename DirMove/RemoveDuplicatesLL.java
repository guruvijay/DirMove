package DirMove;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "12->11->12->21->41->43->21";
		List<String> temp_ll = (List<String>) Arrays.asList(input.split("->"));
		List<Integer> ll = temp_ll.stream().map(Integer::parseInt).collect(Collectors.toList());
		String val = ll.stream().distinct().map(Object::toString).collect(Collectors.joining("->"));
		System.out.println(val);
		
	}

}
