import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] ns = { 1,1,5,3,2,0,6,9 };
		
		sort(ns,0,ns.length-1);
		
		System.out.println(Arrays.toString(ns));
	}

	public static int[] sort(int[] a, int left, int right) {
		if (left <right)
		{
			System.out.printf("@start:%d;end:%d;key:%d\n", left,right,left);
			System.out.println(Arrays.toString(a));
			int partationIndex = partation(a,left,right);
			
			//System.out.printf("@@start:%d;end:%d;key:%d\n", left,partationIndex-1,left);
			if(left < partationIndex-1)sort(a,left,partationIndex-1);
			//System.out.printf("@@@start:%d;end:%d;key:%d\n", partationIndex+1,right,partationIndex+1);
			if (partationIndex+1<right)sort(a,partationIndex+1,right);
			
		}
		return a;
		//System.out.println(Arrays.toString(a));
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		System.out.println(Arrays.toString(a));
		

	}

	public static int partation(int[] a, int left, int right) {
		int pivot = left;
		// int start = i;
		// int end = j;
		int index = pivot + 1;

		int i = index;

		while (i <= right) {
			if (a[pivot] >= a[i]) {
				swap(a, i, index);
				index++;
			}
			i++;
		}

		swap(a, pivot, index-1);
		System.out.println(Arrays.toString(a));

		return index-1;

	}

}
