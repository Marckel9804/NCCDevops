package org.Ncc.Feb.B28.Quiz567;

public class PrintPyramid {
    public static void main(String[] args) {
        for (int i=0; i<4; i++){
            for (int j=0; j<3-i; j++){
                System.out.print(" ");
            }
            for (int j=0; j<(i*2)+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
