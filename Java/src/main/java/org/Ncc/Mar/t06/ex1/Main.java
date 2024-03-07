package org.Ncc.Mar.t06.ex1;

public class Main {
    public static void main(String[] args) {
        AA a = new AA();
        BB b = new BB();
        In i = new In();

        i.<AA>show(a);
        i.<BB>show(b);
    }
}
