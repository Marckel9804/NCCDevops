package org.Ncc.Feb.B28.Quiz567;

public class Grade {
    static int get(int[][] arr){
        int max=-1;
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if(max<arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] grade = {{55, 60, 65}, {85, 90, 95}};
        int high;

        high= get(grade);
        System.out.println("가장 높은 점수는 " + high + "점 입니다.");
    }
}
