package week1assignment;

public class NextCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String txt="A1B2C3";
		char[] charArray = txt.toCharArray();
		int length = charArray.length;
		System.out.println(length);
		String newtxt="";
		for (int i = 0; i < length; i++) {
		
			int temp=charArray[i];
			temp=temp+1;
			newtxt=newtxt+(char)temp;
			
		}
		System.out.println(newtxt);
	}

}
