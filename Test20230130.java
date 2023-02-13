package coadingTest;

import java.util.*;

public class Test20230130 {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] numbers = {2,1,3,4,1};
		System.out.println(solution.solution(numbers));
		
	}
}

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				int a = numbers[i] + numbers[j];
				System.out.print(a);
			}
		}
       return answer;
    }
}