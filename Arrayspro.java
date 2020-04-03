package week1.day4;

import java.util.Arrays;

import org.apache.poi.util.SystemOutLogger;

public class Arrayspro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {200,500,10,3000};
		int length = a.length;
Arrays.sort(a);
System.out.println("min=" +a[0]);
System.out.println("max="+a[a.length-1]);
		

	}

}
