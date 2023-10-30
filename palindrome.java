package Maccess;
import java.util.*;
public class palendrome {
	public static void main(String[] args)  {
	  Scanner s= new Scanner(System.in);
	  System.out.println("Enter aString");
	  String input=s.nextLine();
	  int length=input.length();
	  boolean isPalindrome = true;
	  for(int i=0;i<length/2;i++)
	  {
		if(input.charAt(i)!=input.charAt(length-i-1))
		  isPalindrome =false;
	  }
	  System.out.println("Palindrome:"+isPalindrome);
	}
}
