package DirMove;

import java.util.stream.IntStream;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("", "impiger");

	}
	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			System.out.print('\n'+""+prefix + " ");
		} else {
			IntStream.range(0, n).parallel().forEach(
					i -> permutation(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i)));
		}
	}
}
