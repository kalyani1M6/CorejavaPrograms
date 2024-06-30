package problems;

public class EvenOdd {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8};
		int sumEven=0;
		int sumOdd=0;
	
		for(int  i=0;i<arr.length;i++) {
			if(arr[i]%2 == 0)
				sumEven += arr[i];
			
			else
				sumOdd += arr[i];
			
			
		}
		
		System.out.println("sum of Even number ="+sumEven);
		System.out.println("sum of Odd number =" +sumOdd);
        
		
	}
}
