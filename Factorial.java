package datastructure;

import java.util.*;

public class Factorial {

	public static int factorial(int n) {
		
		if(n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("정수 하나를 입력해주세요: ");
		int number = scanner.nextInt();
		int result;
		if(number==0) {
			result = 1;
		}else if(number<0){
			result = -1;
		}else {
			result = factorial(number);
		}
		System.out.println(result);
	}
}
