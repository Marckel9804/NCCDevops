package org.example.Ncc.Feb.B29.q6;

public class Point implements Po{
    @Override
    public void pr(int x, String string) {
        System.out.println(string + "책은"+ x +"원");
    }

    @Override
    public void pr(String string) {
        System.out.println(string);
    }
}
