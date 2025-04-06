package co.controlstatements;

public class test14 {

	public static void main(String[] args) {
		int counter= 0;
		for(int i=10;i>20;i++) {
			counter++;
		}
		System.out.println("minimun no of executions -for loop :"+counter);
		
		int counter2=0;
		int i=10;
		while(i>20) {
			counter2++;
			i++;
		}
			System.out.println("minimun no of executions -while loop :"+counter2);
			
			int counter3=0;
			int j=10;
			do {
				counter3++;
			} while(j++ >20);
			System.out.println("minimun no of executions -while loop :"+counter3);
			
			
			
			int [] arr = {1,2,3,4,5};
			//for(int i1=0;i1<arr.length;i1++) {
				//System.out.println(arr[i1]);
			//}
			
			for (int ele:arr) { //enhanced for loop works with array like elements//
				System.out.println(ele);
			}
			}
		}
	


