package StringAssignment;

public class ReverseString {

	public static void main(String[] args) {
		String word = "Marolix";
		String reverse = "";
		for(int i=word.length()-1;i>=0;i--) {
			reverse =reverse + word.charAt(i);
		}
		System.out.println("The Reverse String of "+" Marolix "+"is : "+reverse);
		//System.out.println(reverse);

	}

}
