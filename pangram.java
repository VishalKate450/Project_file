import java.util.*;
public class Pangram {
	public static boolean isPangram(String string)  
	{   
		boolean[] m = new boolean[26];  
		int index = 0;  
		for (int i = 0; i < string.length(); i++)   
		{  
		if ('A' <= string.charAt(i) && string.charAt(i) <= 'Z')   
			index = string.charAt(i) - 'A';  
		else if ('a' <= string.charAt(i) && string.charAt(i) <= 'z')  
			index = string.charAt(i) - 'a';  
		else  
			continue;  
		m[index] = true;  
		}  
		for (int i = 0; i <= 25; i++)  
		if (m[i] == false)  
			return (false);  
		return (true);  
	}  
	public static void main(String[] args) {
		String string = "Fix problem quickly with galvanized jets";  
		if (isPangram(string) == true)  
		System.out.print(string + " is a pangram string.");  
		else  
		System.out.print(string + " is not a pangram string."); 
	}

}
