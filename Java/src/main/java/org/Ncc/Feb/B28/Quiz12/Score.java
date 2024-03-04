package org.Ncc.Feb.B28.Quiz12;

public class Score {
    int math;
    int eng;
    int com;

    Score(int math, int eng, int com) {
        this.math = math;
        this.eng = eng;
        this.com = com;
    }

    double avg() {
        return (math + eng + com)/(3.0);
    }
}
