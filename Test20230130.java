package coadingTest;

import java.util.*;

public class Test20230130 {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] n = {-10, 30, -20, 10, 40, -50, 20, 70};
		System.out.println(solution.solution(n));
		
	}
}


class Solution {
    public int solution(int[] number) {
        int answer = 0;
       
        for (int i = 0; i < number.length-2; i++) {
			for (int j = i+1; j < number.length-1; j++) {
				for (int k = j+1; k < number.length; k++) {
					if(number[i]+number[j]+number[k] == 0) answer++; 
					
				}
				
			}
		}
        return answer;
    }
}