package DirMove;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RegexEmailPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
		List<String> lstOfInEmails = Arrays.asList("vk@gmail.com","ram@.com","ravi@yahoo.com");
		List<String> validEmails = lstOfInEmails.stream().filter(emailPattern.asPredicate()).collect(Collectors.<String>toList());
		validEmails.forEach(System.out::println);
	    Pattern mobilePattern = Pattern.compile("^\\d{10}$");
	    List<String> listOfMobiles = Arrays.asList("998746","9843625667");
	    List<String> validMobileNumbers = listOfMobiles.stream().filter(mobilePattern.asPredicate()).collect(Collectors.toList());
	    validMobileNumbers.forEach(System.out::println);
	}
}
