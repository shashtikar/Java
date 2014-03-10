/*
 * Author: Shashank Ashtikar
 * 
 *  This program matches different kinds of brackets and 
 */

package shashank.ashtikar.dataStructures;

import java.util.Stack;



public class delimiterParser {

	
	public static void main(String args[])
	{
	String braces="({[]})";
	int len= braces.length();
	
	if (len%2!=0)
	{
		System.out.println("Error in parsing the braces.");
		System.exit(1);
	}
	
	Stack<Character> myStack = new Stack<Character>();
	
	for (int i=0;i<len/2;i++)
	{
		myStack.push(braces.charAt(i));
	}
	
	for (int j=(len/2);j<len;j++)
	{
		if (!matchBraces(braces.charAt(j),myStack.peek()))
		{
			System.out.println("Delimiter mismatch");
			System.exit(1);
		}
		myStack.pop();
	}
	System.out.println("Braces match");
	
	
	}
	
	static boolean matchBraces(char b1, char b2)
	{
		if(b1==')'&&b2=='(')
		{
			return true;
		}
		else if(b1=='}'&&b2=='{')
		{
			return true;
		}
		else if(b1==']'&&b2=='[')
		{
			return true;
		}
		return false;
		
	}
	
	
	
	
}
