package _0923;

public class Song {
    private String title, artist, country;
    private int year;

    public Song() {
    }

    public Song(String title, String artist, String country, int year) {
        this.title = title;
        this.artist = artist;
        this.country = country;
        this.year = year;
    }

    public void show() {
        System.out.println("제목: " + title);
        System.out.println("가수: " + artist);
        System.out.println("국적: " + country);
        System.out.println("발표연도: " + year);
    }


}
