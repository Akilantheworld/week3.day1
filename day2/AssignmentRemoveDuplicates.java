package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class AssignmentRemoveDuplicates {

	public static void main(String[] args) {

	String str = "We learn java basics as part of java sessions in java week1";
		
		char[] charArray = str.toCharArray();
		
		Set<Character> ch = new LinkedHashSet<Character>();
		
		for (Character eachChar : charArray) {
			
			ch.add(eachChar);
			
		}
		
		System.out.println(ch);
		
		
	}

}
