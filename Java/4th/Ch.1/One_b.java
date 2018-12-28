import java.util.*;
public class One_b
{
	public static void main(String args[])
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
	static boolean Unique(String words)
	{
		boolean unique = true;
		One_b unsort = new One_b();
		char[] sorted = words.toCharArray();
		unsort.sort(sorted);
		for(int i = 0; i < sorted.length-1;i++)
		{
			if(sorted[i] == sorted[i+1])
				unique = false;
		}
		
		return unique;
	}
	void sort(char[] arr)
	{
		
		int right = arr.length-1;
		if(0 < right)
		{
			divide(arr,0,right);
		}
	}
	void divide(char arr[],int left, int right)
	{
		int mid;
		if(left<right)
		{
			mid = (left+right)/2;
			divide(arr,mid+1,right);
			divide(arr,left,mid);
			merge(arr,left,mid,right);
		}
	}
	void merge(char arr[],int left, int mid, int right)
	{
		int l = mid - left + 1;
		int r = right - mid;
		
		char[] lSide = new char[l];
		char[] rSide = new char[r];
		
		for(int i = 0; i < l; ++i)
		{
			lSide[i] = arr[left+i];
		}
		for(int j = 0; j < r; ++j)
		{
			rSide[j] = arr[mid+1+j];
		}
		
		int a = 0, b = 0, k = left;
	
		while(a < l && b < r)
		{
			if(lSide[a] <= rSide[b])
			{
				arr[k] = lSide[a];
				a++;
			}
			else
			{
				arr[k] = rSide[b];
				b++;
			}
			k++;
		}
		
	}
	
	
	
}