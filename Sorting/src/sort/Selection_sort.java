package sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3,5,7,9,1,15};
		for (int i=0; i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i:arr) {   //                                                                                                                               Arrays.sort(arr);
			System.out.print(i+" ");
			
		}

	}

}
