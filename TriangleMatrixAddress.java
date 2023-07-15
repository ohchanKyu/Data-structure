package datastructure;

import java.util.*;

public class TriangleMatrixAddress {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정방행렬 N값을 입력해주세요(N*N 행렬 생성): ");
		
		int number = scanner.nextInt();
		int array[][] = new int[number][number];
		
		System.out.println("찾고싶은 행과 열의 값을 입력해주세요: ");
		int searchRow = scanner.nextInt();
		int searchColumn = scanner.nextInt();
		
		System.out.println("하삼각행렬(1) / 상삼각행렬(2) / tridianal행렬(3) 중 고르시오: ");
		int matrixNumber = scanner.nextInt();
		int result;
		switch(matrixNumber) {
			case 1:{
				System.out.println("Row Major(R입력) or Column Major(C입력) : ");
				String storePriority = scanner.next();
				if(storePriority.equals("R")) {
					result = ((searchRow*(searchRow-1)/2)+searchColumn);
				}else {
					result = ((number*(searchColumn-1))-((searchColumn-1)*(searchColumn-2)/2)+searchRow-searchColumn+1);
				}
				System.out.println(result);
				break;
			}
			case 2:{
				System.out.println("Row Major(R입력) or Column Major(C입력) : ");
				String storePriority = scanner.next();
				if(storePriority.equals("R")) {
					result = ((number*(searchRow-1))-((searchRow-1)*(searchRow-2)/2)+searchColumn-searchRow+1);
				}else {
					result = ((searchColumn)*(searchColumn-1)/2)+searchRow;
				}
				System.out.println(result);
				break;
			}
			case 3:{
				result = (3*(searchRow-1))-1+searchColumn-searchRow+2;
				System.out.println(result);
				break;
			}
		}
		
	}
}
