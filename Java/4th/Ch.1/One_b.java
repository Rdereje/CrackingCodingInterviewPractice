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
			System.out.print(sorted[i]);
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
		int a = left;
		int b = mid+1;
		char[] temp = new char[right-left+1];
		for(int i = left; i < right; i++)
		{
			if(a == mid+1)
			{
				temp[i] = arr[b];
				b++;
			}
			else if(b == right)
			{
				temp[i] = arr[a];
				a++;
			}
			else if(arr[a] < arr[b])
			{
				temp[i] = arr[a];
				a++;
			}
			else
			{
				temp[i] = arr[b];
				b++;
			}
						
		}
		int j = left;
		for(int i = 0; i < temp.length;i++)
		{
			arr[j] = temp[i];
			j++;
		}
	}
	
	
	
}