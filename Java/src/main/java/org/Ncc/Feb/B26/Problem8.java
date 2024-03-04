package org.Ncc.Feb.B26;

public class Problem8 {
    static String show(char c, int n){
        String res="";
        for (int i =0; i<n; i++){
            res=res+c;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(show('$',10));
    }
}
