package DirMove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Largest3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] =  {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
		List<Integer> lstInput = Arrays.stream(input).boxed().collect(Collectors.toList());
		List<Integer> outputLst = new ArrayList<Integer>();
		outputLst = lstInput.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		outputLst.forEach(System.out::println);
		
	}

}
