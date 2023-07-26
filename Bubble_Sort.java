package sort;

public class Bubble_Sort {

	 
	public static int Bubble_Sort(int[] arr){
		int i,j,temp;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {20,56,14,78,32,9,6,3};
		
		System.out.println("array before sorting");
	     for(int num:arr) {
	    	 System.out.println(num+" ");
	     }
	     System.out.println("fz");
	     System.out.println("array after sorting..");
	     Bubble_Sort(arr);
	     for(int num:arr) {
	    	 System.out.println(num+" ");
	     }

	}

}
