package Programmers.hash;


import java.util.Arrays;
//hash 카테고리로 분류된 문제이지만 N이 100000만 이하라 정렬하여 풀어도 충분할 것 같다
//participant, completion 배열 정렬 후, 앞에서부터 검사하다 다른값 있으면 참가했으나 완주 못한 사람이므로 return
//끝까지 못찾으면 participant배열의 마지막에 위치한 사람이 완주 못한 것
//2개 다 정렬 후, 같은 인덱스로 접근하기 때문에 중복되는 이름이 있어도 상관 X
public class playerNoHash {
    public String solution(String[] participant, String[] completion){
        String answer="";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0;i< completion.length;i++){
            if(!(participant[i].equals(completion[i])))
                return participant[i];
        }
        return participant[participant.length-1];
    }
}
