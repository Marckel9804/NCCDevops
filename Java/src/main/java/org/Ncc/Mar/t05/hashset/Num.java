package org.Ncc.Mar.t05.hashset;

public class Num {
    int x;
    Num(int x) {
        this.x = x;
    }
    @Override
    public int hashCode() {
        return x;   // 1. 기준을 정해서 그룹핑
    }

    @Override
    public boolean equals(Object obj) {
        Num num = (Num) obj;    // 강제 형변환 - downcasting
        if (num.x == x) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return x+" "; //객체를 문자열로 변환해주는 매서드
    }
}
