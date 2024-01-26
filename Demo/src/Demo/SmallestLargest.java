package Demo;

import java.util.Scanner;

public class SmallestLargest {

	public static void main(String[] args) {
		Integer min=Integer.MAX_VALUE;
		Integer max=Integer.MIN_VALUE;
		int[] numbers = new int[6];
		Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
      
            numbers[i] = scanner.nextInt();
        }
        for(int i=0;i<numbers.length;i++)
        {
        	if(numbers[i]<min)
        		min=numbers[i];
        	else if(numbers[i]>max)
        		max=numbers[i];
        	
        }
        System.out.println("The sum of Smallest and largest number is" +(min+max));

	}

}
