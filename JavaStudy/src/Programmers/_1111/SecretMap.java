package Programmers._1111;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = arr1[i] | arr2[i];
        }
        for (int i = 0; i < n; i++) {
            String str="";
            for (int j = n - 1; j >= 0; j--) {
                if ((arr1[i] >> j & 1)==1)str += '#';
                else str += " ";
            }
            answer[i]=str;
        }
        return answer;
    }
}
