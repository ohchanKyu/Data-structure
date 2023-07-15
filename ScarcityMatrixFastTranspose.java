package datastructure;

public class ScarcityMatrixFastTranspose {

	public static void main(String[] args) {
		
		int valueNum = 8;
		int matrix[][] = new int[9][3];
		matrix[0][0] = 6; //행의 값
		matrix[0][1] = 6; //열의 값
		matrix[0][2] = valueNum; //총 행렬에서 0이 아닌 값
		
		matrix[1][0] = 1;
		matrix[1][1] = 1;
		matrix[1][2] = 15;
		
		matrix[2][0] = 1;
		matrix[2][1] = 4;
		matrix[2][2] = 22;
		
		matrix[3][0] = 1;
		matrix[3][1] = 6;
		matrix[3][2] = -15;
		
		matrix[4][0] = 2;
		matrix[4][1] = 2;
		matrix[4][2] = 11;
		
		matrix[5][0] = 2;
		matrix[5][1] = 3;
		matrix[5][2] = 3;
		
		matrix[6][0] = 3;
		matrix[6][1] = 4;
		matrix[6][2] = -6;
		
		matrix[7][0] = 5;
		matrix[7][1] = 1;
		matrix[7][2] = 91;
		
		matrix[8][0] = 6;
		matrix[8][1] = 3;
		matrix[8][2] = 28;
		
		
		int m,n,t; 
		m = matrix[0][0];
		n = matrix[0][1];
		t = matrix[0][2];
		
		int transpose[][] = new int[9][3];
		transpose[0][0] = n;
		transpose[0][1] = m;
		transpose[0][2] = t;
		if(t<=0) {
			System.out.println("Zero Value값이 없습니다.");
		}
		
		int S[] = new int[n];
		int T[] = new int[n];
		for(int i=0;i<S.length;i++) {
			S[i] = 0;
		}
		for(int i=1;i<=t;i++) {
			S[matrix[i][1]-1] = S[matrix[i][1]-1]+1;
		}
		
		T[0] = 1;
		for(int i=1;i<n;i++) {
			T[i] = T[i-1]+S[i-1];
		}
		for(int i=1;i<=t;i++) {
			int j = matrix[i][1];
			transpose[T[j-1]][0] = matrix[i][1];
			transpose[T[j-1]][1] = matrix[i][0];
			transpose[T[j-1]][2] = matrix[i][2];
			T[j-1] = T[j-1]+1;
		}
		for(int i=0;i<=t;i++) {
			System.out.println(transpose[i][2]);
		}
	}

}
