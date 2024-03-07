package org.Ncc.Mar.t07.treeEx;

public class Pro implements Comparable<Pro>{
    String str;
    int x;
    Pro(String str, int x){
        this.str = str;
        this.x = x;
    }
    void show() {
        System.out.println(str + " " +x);
    }

    @Override
    public int compareTo(Pro o) {
        if(x<o.x) {return -1;}
        else if (x == o.x) { return 0;}
        else { return 1;}
    }
}
