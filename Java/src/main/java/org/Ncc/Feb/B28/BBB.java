package org.Ncc.Feb.B28;

public class BBB extends AAA{
    @Override
    void ride() {   //재정의
        System.out.println("오버 라이딩 BBB");
    }
    void load(int n) {  //오버로딩
        System.out.println("오버로딩 BBB");
    }
}
