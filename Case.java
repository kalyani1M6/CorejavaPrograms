package problems;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner ( System.in);
		System.out.println("enter input");
		String st= src.next();
		char ch = st.charAt(1);
		
		if(ch>=65&&ch<=90)
		{
			System.out.println("input alphabet is Capital");
		}
		else if (ch>=97&&ch<=122)
		{
			System.out.println("input apphabet is Small");
		}
		else
			System.out.println("input invalid please entered Alphabet");
	}
	
	}


