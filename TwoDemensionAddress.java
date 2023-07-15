package datastructure;

import java.util.*;

public class TwoDemensionAddress {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("행값을 입력해주세요: ");
		int n = scanner.nextInt();
		System.out.println("열값을 입력해주세요: ");
		int m = scanner.nextInt();
		
		int array[][] = new int[n][m];
		System.out.println("Row Major(R입력) or Column Major(C입력) : ");
		String storePriority = scanner.next();
		System.out.println("찾고싶은 행과 열의 값을 입력해주세요: ");
		int searchRow = scanner.nextInt();
		int searchColumn = scanner.nextInt();
		
		int result;
		
		if(storePriority.equals("R")) {
			result = ((searchRow-1)*n+(searchColumn));
		}else {
			result = ((searchColumn-1)*m +(searchRow));
		}
		System.out.println("찾는 주소는 "+result+"번째에 있습니다.");
	}
}
