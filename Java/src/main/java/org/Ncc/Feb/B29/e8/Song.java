package org.Ncc.Feb.B29.e8;

public class Song {
    private String singer;
    private String song;

    Song(String singer, String song) {
        this.singer = singer;
        this.song = song;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
