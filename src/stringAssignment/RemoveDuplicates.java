package stringAssignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str = "ABCABCABC";
		String result = "";
        for(int i=0;i<str.length();i++) {
       	 String ch = ""+str.charAt(i);
       	 if(result.contains(ch)) {
       		 continue;
       	 }
       	 result= result+ ch; // we can also write as result += ch
        }
System.out.println(result);


	}

}
