package StringAssignment;

public class ReverseTheWords {

	public static void main(String[] args) {
		String str = "I love Cars";
		String words[] = str.split(" "); // here " " is used to separate it by space
		String rev = "";
		for(int i=words.length-1;i>=0;i--) 
		 {
			 rev = rev+words[i]+" ";
		 }
		System.out.println(rev);
	}
}
