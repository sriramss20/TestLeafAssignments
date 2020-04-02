package week1assignment;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String txt="Welcome";	
		
		char[] charArray = txt.toCharArray();
		
		int length=charArray.length;
		System.out.println(length);
		String reversetext="";
		
		for (int i = length-1; i >=0 ; i--) {
		
		reversetext=reversetext+Character.toString(charArray[i]);
			
		}
		System.out.println(reversetext);
		}
	}


