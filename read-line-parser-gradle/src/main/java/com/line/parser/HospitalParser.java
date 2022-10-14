package com.line.parser;

import com.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital>{
    private String replaceAllQuot(String str){
        return str.replaceAll("\"","");
    }
    @Override
    public Hospital parse(String str) {
        String[] splitted = str.split(",");
        return new Hospital(splitted[0],splitted[1],splitted[2],Integer.parseInt(replaceAllQuot(splitted[6])), splitted[10],getSubdivision(splitted[10]));
    }
    private String getSubdivision(String name) {
        String[] subdibisions = {"소아과", "피부과", "성형외과", "정형외과", "산부인과", "관절", "안과", "가정의학과", "비뇨기과", "치과", "내과", "외과"};

        for (String subdivision : subdibisions) {
            if (name.contains(subdivision)) {
                return subdivision;
            }else if (name.contains("마디")) {
                return "정형외과";
            }

        }
        return "";
    }
}
