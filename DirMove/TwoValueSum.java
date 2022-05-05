package DirMove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoValueSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputArray[] = {3,5,2,6,3,-8,-16};
		int targetSum = 8;
		Predicate<Integer> p = f->(f == targetSum);
		Set<String> returnArr = new HashSet<String>();
		for(int i = 0; i < inputArray.length;i++) {
			for(int j = 0; j< inputArray.length; j++) {
				if(p.test(inputArray[i]+inputArray[j])) {
					returnArr.add(inputArray[i]+","+inputArray[j]);
				}
			}
		}
		System.out.println( returnArr);		
	}
}
