package Programmers.hash;

public class phoneketmon {
    class Solution {
        public int solution(int[] nums) {
            int answer = 0, cnt = 0;
            int[] arr = new int[200005];
            for (int i = 0; i < nums.length; i++) {
                if (arr[nums[i]] == 0) answer++;
                arr[nums[i]]++;
            }
            if (answer >= nums.length / 2) answer = nums.length / 2;
            return answer;
        }
    }
}
