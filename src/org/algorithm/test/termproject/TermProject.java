package org.algorithm.test.termproject;

import java.util.ArrayList;
import java.util.List;

public class TermProject {
	private static boolean[]  visits;
	private static List<Integer>  students;
	private static List<Integer>  finals;
	private static int count;
	public int onlyOne(int length, List<Integer> inputs) {
		int result = 0;
		int count = 0;
		students = new ArrayList<>();
		
		students.addAll(inputs);
		
		for(int i=0; i<length; i++) {
			visits = new boolean[length];
			dfs(i);
//			for(boolean b : visits) {
//				System.out.print(b + " ");
//			}
			System.out.println();
		}
		
		return result;
	}
	
	private void dfs(int x) {
		if(visits[x]) return;
		
		visits[x] = true;
		
		System.out.print(x + " ");
		
		for(int student:students) {
			if(visits[student-1]) {
				dfs(student-1);
			}
		}
	}
}
