package DirMove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import javax.swing.event.ListSelectionEvent;

public class SecondNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Vijayakumar";
		char[] ch = inputString.toCharArray();
		ArrayList<Character> lstCharacter = new ArrayList<Character>();
		for(char c : ch) {lstCharacter.add(c);}
		String output = lstCharacter.stream().filter(s->lstCharacter.indexOf(s) == lstCharacter.lastIndexOf(s)).skip(1).collect(Collectors.toList()).get(0).toString();
		
		System.out.println(output);

	}

}
