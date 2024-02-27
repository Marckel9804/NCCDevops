package org.example.Ncc.Feb.B27;

public class Quiz1 {
    static int same(int[] arr1,int[] arr2){
        int cnt = 0;
        for (int i=0; i<arr1.length;i++){
            for (int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int lotto[]={4,10,25,30,45,47};
        int[] my = {1,4,7,26,45,48};
        int r;

        r=same(lotto,my);
        System.out.printf("일치하는 번호의 개수:%d\n",r);
    }
}
