package DirMove;


import java.util.Arrays;
import java.util.HashSet;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RepeatedWordFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr = "Originating within astronomy as a technical term in the first half of the 18th century, the term \"personal equation\""
				+ "spread into a litany of other fields including medicine, where it was used widely and variously from the late 19th century"
				+ "to the middle of the 20th century.";		
		List<String> lstSampleOutput = Arrays.asList(inputStr.replaceAll("\\p{P}", "").split(" "));		
		Set<String>duplicateWords = new HashSet<String>();	
		lstSampleOutput.stream().filter(s->!duplicateWords.add(s) && !s.equals("a")).collect(Collectors.toSet()).forEach(System.out::println);
		
		
		
		

	}

}
