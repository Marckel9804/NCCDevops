package org.Ncc.Feb.B22;

public class ReferenExample {
    public static void main(String[] args) {
        ReferenExample rfe = new ReferenExample();
        //rfe.garbageObject();
        rfe.equalEx();
    }
    public void garbageObject(){
        String hobby = "여행";
        hobby = null;
        String kind1="자동차";
        String kind2 = kind1;

        kind1= null;
        System.out.println("kind2 = " + kind2);
    }

    public void equalEx(){
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if(strVar1 ==strVar2){
            System.out.println("strVar1 과 strVar2는 참조가 같음");
        }
        else {
            System.out.println("strVar1 과 strVar2는 참조가 다름");
        }

        if(strVar1.equals(strVar2)){
            System.out.println("strVar2 과 strVar2는 문자열이 같음");
        }

        String strVar3 = new String ("홍길동");
        String strVar4 = new String ("홍길동");

        if(strVar3 == strVar4){
            System.out.println("strVar1 과 strVar2는 참조가 같음");
        }
        else {
            System.out.println("strVar1 과 strVar2는 참조가 다름");
        }

        if(strVar3.equals(strVar4)){
            System.out.println("strVar2 과 strVar2는 문자열이 같음");
        }

    }
}
