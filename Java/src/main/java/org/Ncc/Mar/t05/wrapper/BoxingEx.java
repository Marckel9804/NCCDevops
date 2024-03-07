package org.Ncc.Mar.t05.wrapper;

public class BoxingEx {
    public static void main(String[] args) {
        //Integer i = new Integer(10);
        Integer i =10;  //auto boxing
        int k = i.intValue();   //unboxing


        //Character c = new Character('a');
        Character c = 'A';
        char c1 = c.charValue();

        //Boolean b = new Boolean(true);
        Boolean b = true;
        boolean b1 = b.booleanValue();
    }
}
