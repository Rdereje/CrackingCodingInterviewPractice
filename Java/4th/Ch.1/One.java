import java.util.*;
public class One
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String sentence;
		System.out.print("Type in a string then press enter: ");
		sentence = kb.nextLine();
		if(Unique(sentence))
		{
			System.out.println("All characters are unique");
		}
		else
		{
			System.out.println("There are repeated characters");
		}
	}
	static boolean Unique(String word)//checks for any repeated characters including spaces
	{
		boolean unique = true;
		char[] letters = word.toCharArray();//converts entered String to a char array
		int max = letters.length;
		HashSet<Character> checks = new HashSet<Character>(max);
		
		int i = 0;
		while(i < max && unique)//if array is done or repeated character found end loop. O(n) for i
		{
			if(checks.contains(letters[i]))//O(1) method
				unique = false;
			checks.add(letters[i]);//O(1) method
			i++;
		}
		return unique;
	}
}