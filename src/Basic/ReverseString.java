package Basic;

import java.util.Scanner;

public class ReverseString {

	public String reverAnyString(String text) {
		String reverString = "";
		if(text==null) {
			reverString = "Input cannot be null";
			throw new IllegalArgumentException(reverString);
		}else {
			for(int index=text.length()-1;index>=0;index--) {
				char ch = text.charAt(index);
				reverString = reverString + ch;
			}
		}
		return reverString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String to reverse: ");
		String text = scanner.nextLine();
		System.out.println("Reverse of string "+text+" is "+new ReverseString().reverAnyString(text));
		scanner.close();
		System.out.println();

	}

}
