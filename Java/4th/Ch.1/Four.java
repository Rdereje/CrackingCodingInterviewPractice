import java.util.*;
class Four
{
	static boolean Anagram(String a, String b)
	{
		char key;
		int v;
		Hashtable<Character, Integer> one = new Hashtable<Character, Integer>();
		Hashtable<Character, Integer> two = new Hashtable<Character, Integer>();
		for(int i = 0; i < a.length(); i++)
		{
			key = a.charAt(i);
			if(one.contains(key))
			{
				one.put(key,one.get(key)+1);
			}
			else if(key != ' ')
			{
				one.put(key,1);
			}
		}
		for(int j = 0; j < b.length(); j++)
		{
			key = b.charAt(j);
			if(two.contains(key))
			{
				two.put(key,two.get(key)+1);
			}
			else if(key != ' ')
			{
				two.put(key,1);
			}
		}
		if(one.toString().equals(two.toString()))
			return true;
		return false;
	}
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String stringA = kb.nextLine();
		System.out.println("Please enter another string that may or may not be an anagram: ");
		String stringB = kb.nextLine();
		if(Anagram(stringA, stringB))
			System.out.println("The strings are anagrams");
		else
			System.out.println("the strings are not anagrams");
		
	}
}