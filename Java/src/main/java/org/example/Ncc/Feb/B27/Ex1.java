package org.example.Ncc.Feb.B27;

class Score{
    int sum =0;
    void show(int[][] arr){
        int cnt=0;
        int sum2=0;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                sum+=arr[i][j];
                sum2+=arr[i][j];
                System.out.print(arr[i][j]+ " ");
                cnt++;
            }
            System.out.println(" "+(double)sum2/arr[i].length +"\b");
        }
        System.out.println(sum);
        System.out.println(sum/(double)cnt);
    }
}
public class Ex1 {
    public static void main(String[] args) {
        int [][] grade = {
                {90,100,80},
                {70,95,87},
                {80, 90, 70},
                {90,100,100}
        };
        Score s = new Score();
        s.show(grade);

    }
}
