package DirMove;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputVal = "aabccccddef";
		String outputVal = Arrays.asList(inputVal.split("")).stream().distinct().collect(Collectors.joining());
		System.out.println(" OutPut :"+outputVal);
	}

}
