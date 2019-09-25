package hello;

import java.util.Scanner;

public class GetMaxValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i=0; i<arr.length; i++) {
			System.out.println("Input");
			arr[i] = sc.nextInt();
			
			}
		for(int i=0; i<arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		int MaxValue = 0;
		for (int i=0; i<arr.length; i++) {
			if (MaxValue<arr[i])
				MaxValue=arr[i];
			//MaxValue = (MaxValue > arr[i] ? MaxValue : arr[i]);
			}
		System.out.println("최대값 " + MaxValue);          
		sc.close();
		}
	}


