package Basic;

public class StringContainsVowels {

	public static void main(String[] args) {
		System.out.println(stringContainsVowels("Hello")); // true
		System.out.println(stringContainsVowels("TV")); // false
		System.out.println(isStringContainsVowels("ExtraVaganza"));
	}

	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}
	
	public static boolean isStringContainsVowels(String input) {
		boolean isTrue = false;
		for(int index = 0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' ) {
				isTrue = true;
			}else {
				isTrue = false;
			}
		}
		return isTrue;
	}

}
