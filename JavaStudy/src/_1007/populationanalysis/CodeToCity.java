package _1007.populationanalysis;

public class CodeToCity {
    public CodeToCity() {
    }

    public String getCity(int num) {
        String city = null;
        switch (num) {
            case 11:
                city = "서울";
                break;
            case 21:
                city = "부산";
                break;
            case 22:
                city = "대구";
                break;
            case 23:
                city = "인천";
                break;
            case 24:
                city = "광주";
                break;
            case 25:
                city = "대전";
                break;
            case 26:
                city = "울산";
                break;
            case 29:
                city = "세종";
                break;
            case 31:
                city = "경기";
                break;
            case 32:
                city = "강원";
                break;
            case 33:
                city = "충북";
                break;
            case 34:
                city = "충남";
                break;
            case 35:
                city = "전북";
                break;
            case 36:
                city = "전남";
                break;
            case 37:
                city = "경북";
                break;
            case 38:
                city = "경남";
                break;
            case 39:
                city = "제주";
                break;
        }
        return city;
    }
}
