package org.algorithm.test.termproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TermProjectMain {
	
	// 테스트 실행 메인 클래스
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TermProject termProject = new TermProject();
		
		/**
		 * 테스트 케이스
		 */
		int t = scanner.nextInt();
		
		int[] output = new int[t];
		
		for(int i=0; i<t; i++) {
			/**
			 * 학생 수
			 */
			int n = scanner.nextInt();
			
			/**
			 * 선택한 학생
			 */
			List<Integer> students = new ArrayList<>();
			
			for(int j=0; j<n; j++) {
				students.add(scanner.nextInt());
			}
			
			output[i] = termProject.onlyOne(n, students);
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(output[i]);
		}

	}

}
