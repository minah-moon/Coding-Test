package coadingTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class coadingTest1 {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] survey = {"TR", "RT", "TR"};
		int[] choices = {7, 1, 3};
		solution.solution(survey, choices);
		System.out.println(solution.solution(survey, choices));
	}
}


class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < survey.length; i++) {
        	if(choices[i] > 4) {
        		char a = survey[i].charAt(1);
        		map.put(a, map.getOrDefault(a, 0) + choices[i] - 4);
        	} else if(choices[i] < 4) {
        		char a = survey[i].charAt(0);
        		map.put(a, map.getOrDefault(a, 0) - choices[i] + 4);
        	}
		}
        
        char mbti[] = new char[4];
        mbti[0] = ((map.getOrDefault('R', 0)>=map.getOrDefault('T', 0))?'R':'T');
        mbti[1] = ((map.getOrDefault('C', 0)>=map.getOrDefault('F', 0))?'C':'F');
        mbti[2] = ((map.getOrDefault('J', 0)>=map.getOrDefault('M', 0))?'J':'M');
        mbti[3] = ((map.getOrDefault('A', 0)>=map.getOrDefault('N', 0))?'A':'N');
        
        String str = new String(mbti);
        answer = str;
        return answer;
    }
}