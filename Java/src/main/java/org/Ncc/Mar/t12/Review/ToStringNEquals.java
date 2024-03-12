package org.Ncc.Mar.t12.Review;


class Po {
    int x,y;
    Po(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Po p = (Po)obj;
        if(p.x == this.x && p.y == this.y) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
public class ToStringNEquals {
    public static void main(String[] args) {
        Po p = new Po(1,2);
        //클래스 이름 알아내기
        System.out.println(p.getClass().getName());
        //클래스 해시코드 출력
        System.out.println(p.hashCode());
        System.out.println();
    }
}
