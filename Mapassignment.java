package week3assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String>mp=new HashMap<String, String>();
		String count="1";

		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String sentence = scan.nextLine();
		//		sentence.replaceAll("\\s", "");
		System.out.println(sentence);

		int sentencelength = sentence.length();


		for (int i = 0; i < sentencelength; i++) {			
			if (i==0) {
				String key = Character.toString(sentence.charAt(i));
				mp.put(key,count );
			}		
			else if (i>=1) {
				boolean check = mp.containsKey(Character.toString(sentence.charAt(i)));
				if (check==true) {
					String increment = mp.get(Character.toString(sentence.charAt(i)));
					int temp = Integer.parseInt(increment);
					temp=temp+1;
					mp.put(Character.toString(sentence.charAt(i)),Integer.toString(temp));

				}
				else if (check==false) {
					mp.put(Character.toString(sentence.charAt(i)), count);
				}


			}


		}
		System.out.println(mp);

		System.out.println("enter the character to fin its count");
		String indchar = scan.next();
		if (mp.containsKey(indchar)) {
			System.out.println(mp.get(indchar));

		}
		else {
			System.out.println("entered char not in sentence");
		}

	}
}
