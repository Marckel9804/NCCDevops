package org.Ncc.Feb.B27;

class Shape2{
    int x,y;
    String str;

    Shape2(){
        this(1,3);
    }
    Shape2(int x, int y){
        this.x = x;
        this.y = y;
    }
    void pr(String str){
        this.str = str;
    }

    void show(){
        for (int i=0; i<this.x; i++){
            for (int j=0; j<this.y; j++){
                System.out.print(this.str);
            }
            System.out.println();
        }
    }
}
public class Quiz1_2 {
    public static void main(String[] args) {
        Shape2 s = new Shape2();
        Shape2 s1 = new Shape2(2,5);
        s.pr("@");
        s1.pr("#");
        s.show();
        s1.show();
    }
}
