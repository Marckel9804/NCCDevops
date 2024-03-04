package org.Ncc.Feb.B27;

class Song{
    private String title;

    Song(String title){
        this.title=title;
    }

    public String getSong() {
        return title;
    }
}
public class Quiz5 {
    public static void main(String[] args) {
        Song s1 = new Song("On");
        Song s2 = new Song("00:00");
        System.out.println("좋아하는 노래 " + s1.getSong());
        System.out.println("내 노래 " + s2.getSong());
    }
}
