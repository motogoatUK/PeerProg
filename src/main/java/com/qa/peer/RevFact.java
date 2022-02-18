package com.qa.peer;

public class RevFact {
	
	public void factor() {
	
	System.out.println(revFact(120f));
	System.out.println(revFact(150f));
	System.out.println(revFact(-12f));
	System.out.println(revFact(3628800f));
	System.out.println(revFact(479001600f));
	System.out.println(revFact(6f));
	System.out.println(revFact(18f));
	}
	public String revFact(float num) {
		int count = 0;
		while (num > 1) {
			count++;
			num /= count;
			
		}
		if (num == 1)
			return count + "!";
		else
			return "NONE";
	}
	
}
