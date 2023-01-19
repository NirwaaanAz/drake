package example;

import java.util.Scanner;


	public class Main {
		public static void main(String[] args)
		 {
		Scanner input = new Scanner (System.in);
		final String C = "-1";
		String user = input.nextLine();
		String target = "Balls";
		
		Scanner word = new Scanner (user);
		while (word.hasNext()) {
			String next = word.next();
			if (!next.equals(C))
			System.out.println(next);
		}
		
		 }
	}

	
