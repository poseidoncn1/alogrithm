import java.util.Arrays;

public class BinarySearch
{
	//rank ≤È’“£¨∑µªÿvalue
	public static int rank(int key,int[] a)
	{
		int lo = 0;
		int hi = a.length - 1;
		int mid;

		while (lo <= hi)
		{
			mid = lo + (hi - lo)/2;
			if (key > a[mid]) lo = mid + 1;
			else if (key < a[mid] ) hi = mid - 1;
			else return mid;
		}

		return -1;
	}
	//main , ≈≈–Ú£¨

	public static void main(String[] args)
	{
		In in = new In(args[0]);
		int[] whitelist = in.readAllInts();

		Arrays.sort(whitelist);

		while ( !StdIn.isEmpty())
		{
			int key = StdIn.readInt();
			if (rank(key,whitelist) == -1)
			{
				System.out.println(key);
			}
		} 
	}
}