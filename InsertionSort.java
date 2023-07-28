package sort;

import java.util.Arrays;

public class InsertionSort {

	public static void insertion(int[] a,int b) {
		for(int i=1;i<=b;i++) {
			int key=a[i];
			int j =i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
				
			}
			a[j+1]=key;
		}
	}
	
	public static void main(String[] args) {
		int a[]= {4,8,12,87,25,3,1,2};
		System.out.println(Arrays.toString(a));
		insertion(a, a.length-1);
		System.out.println(Arrays.toString(a));
		

	}

}
