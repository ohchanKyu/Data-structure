package datastructure;

import java.util.*;

public class ArrayPolyAdd {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("다항식 A를 입력해주세요: ");
		String polyA = scanner.next();
		System.out.println("다항식 B를 입력해주세요: ");
		String polyB = scanner.next();
		
		
		StringTokenizer st = new StringTokenizer(polyA,"+");
		String arrayA[] = new String[st.countTokens()];
		int numA[] = new int[(st.countTokens()*2)+1];
		numA[0] = st.countTokens();
		int count = 0;
		int arrayCount = 1;
		while(st.hasMoreTokens()) {
			arrayA[count] = st.nextToken();
			if(arrayA[count].indexOf("x") == -1) {
				arrayA[count] = arrayA[count]+"x^0";
			}else if(arrayA[count].charAt(0) == 'x') {
				arrayA[count] = "1"+arrayA[count];
			}
			String arr1[] = arrayA[count].split("x");
			numA[arrayCount] = Integer.parseInt(arr1[1].substring(1,arr1[1].length()));
			arrayCount++;
			numA[arrayCount] = Integer.parseInt(arr1[0]);
			arrayCount++;
			count++;
		}
		
		st = new StringTokenizer(polyB,"+");
		String arrayB[] = new String[st.countTokens()];
		
		int numB[] = new int[st.countTokens()*2+1];
		numB[0] = st.countTokens();
		count = 0;
		arrayCount = 1;
		while(st.hasMoreTokens()) {
			arrayB[count] = st.nextToken();
			if(arrayB[count].indexOf("x") == -1) {
				arrayB[count] = arrayB[count]+"x^0";
			}else if(arrayB[count].charAt(0) == 'x') {
				arrayB[count] = "1"+arrayB[count];
			}
			String arr2[] = arrayB[count].split("x");
			numB[arrayCount] = Integer.parseInt(arr2[1].substring(1,arr2[1].length()));
			arrayCount++;
			numB[arrayCount] = Integer.parseInt(arr2[0]);
			arrayCount++;
			count++;
		}
		
		int p = 1;
		int q = 1;
		int r = 1;
		int maxLength;
		int check;
		if(numA[0]>numB[0]) {
			check = 1;
		}
		else if(numA[0]<numB[0]) {
			check = 2;
		}
		else {
			check = 0;
		}
		int numC[] = new int[(numA[0]*2+numB[0]*2)+1];

		while(p<=numA[0]*2 && q<=numB[0]*2) {
			if(numA[p] == numB[q]) {
				numC[r+1] = numA[p+1]+numB[q+1];
				if(numC[r+1]!=0) {
					numC[r] = numA[p];
					if(numC[r+1]==1) {
						System.out.print("x^"+numC[r]+"+");
					}else if(numC[r]==0) {
						System.out.print(numC[r+1]);
					}
					else {
						System.out.print(numC[r+1]+"x^"+numC[r]+"+");
					}
					r+=2;
					q+=2;
					p+=2;
				}
			}
			else if(numA[p]<numB[q]) {
				numC[r+1] = numB[q+1];
				numC[r] = numB[q];
				if(numC[r+1]==1) {
					System.out.print("x^"+numC[r]+"+");
				}else if(numC[r]==0) {
					System.out.print(numC[r+1]);
				}
				else {
					System.out.print(numC[r+1]+"x^"+numC[r]+"+");
				}
				r+=2;
				q+=2;
			}else {
				numC[r+1] = numA[p+1];
				numC[r] = numA[p];
				if(numC[r+1]==1) {
					System.out.print("x^"+numC[r]+"+");
				}else if(numC[r]==0) {
					System.out.print(numC[r+1]);
				}
				else {
					System.out.print(numC[r+1]+"x^"+numC[r]+"+");
				}
				p+=2;
				r+=2;
			}
			
		}
		
		if(check==1) {
			while(p<=numA[0]*2) {
				numC[r] = numA[p];
				numC[r+1] = numA[p+1];
				if(numC[r+1]==1) {
					System.out.print("x^"+numC[r]+"+");
				}else if(numC[r]==0) {
					System.out.print(numC[r+1]);
				}
				else {
					System.out.print(numC[r+1]+"x^"+numC[r]+"+");
				}
				p+=2;
				r+=2;
			}
		}else if(check==2){
			while(q<=numB[0]*2) {
				numC[r] = numB[q];
				numC[r+1] = numB[q+1];
				if(numC[r+1]==1) {
					System.out.print("x^"+numC[r]+"+");
				}else if(numC[r]==0) {
					System.out.print(numC[r+1]);
				}
				else {
					System.out.print(numC[r+1]+"x^"+numC[r]+"+");
				}
				q+=2;
				r+=2;
			}
		}
		
	}

}
