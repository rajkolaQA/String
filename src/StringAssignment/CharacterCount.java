package StringAssignment;

public class CharacterCount {

	public static void main(String[] args) {
		String str= "RangeRoveR";
		 int count =0;
		 for(char ch:str.toCharArray()) { // Here used for each loop
			 if(ch=='R') {                // Syntax: for(dataType varableName:ArrayName)
				count++;
			 }
		 }
		System.out.println(count);
        

	}
}





