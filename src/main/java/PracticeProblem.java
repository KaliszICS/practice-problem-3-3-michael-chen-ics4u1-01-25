import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(perms("null"));
	}

	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

	public static ArrayList<String> perms(String a) {
		ArrayList<String> permutations = new ArrayList<String>();

		permsHelper(a, permutations, "");
		return permutations;
	}

	public static void permsHelper(String unused, ArrayList<String> permutations, String used) {
		if (unused.strip() == "") {
			permutations.add(used);
		}

		for (int i = 0; i < unused.length(); i++) {
			String usedLetters = used + unused.charAt(i);
			String unusedLetters = unused.substring(0, i) + unused.substring(i + 1);
			permsHelper(unusedLetters, permutations, usedLetters);
		}
	}

	public static ArrayList<String> permsUnique(String a) {
		ArrayList<String> uniquePermutations = new ArrayList<String>();

		permsUniqueHelper(a, uniquePermutations, "");
		return uniquePermutations;
	}

	public static void permsUniqueHelper(String unused, ArrayList<String> uniquePermutations, String used) {
		if (unused.strip() == "" && !uniquePermutations.contains(used)) {
			uniquePermutations.add(used);
		}

		for (int i = 0; i < unused.length(); i++) {
			String usedLetters = used + unused.charAt(i);
			String unusedLetters = unused.substring(0, i) + unused.substring(i + 1);
			permsUniqueHelper(unusedLetters, uniquePermutations, usedLetters);
		}
	}
}
