package datastructure;

import java.util.*;

public class HanoiTower {

	public static void hanoi(int n, char from, char tmp, char to) {
		
		if(n==1) {
			System.out.println("1번 원판이 "+from+"에서"+to+"로 이동합니다");
		}else {
			hanoi(n-1,from,to,tmp);
			System.out.println(n+"번 원판이 "+from+"에서"+to+"로 이동합니다");
			hanoi(n-1,tmp,from,to);
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		System.out.println("원판 수를 입력해주세요: ");
		int number = scanner.nextInt();
		hanoi(number,'A','B','C');
		
		
	}
}
