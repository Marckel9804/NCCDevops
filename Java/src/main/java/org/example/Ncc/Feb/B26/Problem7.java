package org.example.Ncc.Feb.B26;

public class Problem7 {
    public static void pr(int[] score, int n){
        for (int i=0; i<score.length; i++){
            for(int j=0; j<(score[i]/5);j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] score = new int[] {58,60,86,90,84};
        pr(score,5);
        //pr(score,5);
    }
}
