package org.Ncc.Feb.B26;

class Music{
    String title,singer;

    Music(String title){
        this(title,"방탄");
    }
    Music(String title, String singer){
        this.title = title;
        this.singer = singer;
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Music m = new Music("On", "BTS");
        System.out.println(m.title + " " + m.singer); // On , BTS 출력

        Music m1 = new Music("Butter");
        System.out.println(m1.title + " " + m1.singer); // Butter, 방탄 출력
    }
}
