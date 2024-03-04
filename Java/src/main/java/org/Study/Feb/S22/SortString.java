package org.Study.Feb.S22;

import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String[] arr = new String[num];

        for(int i=0; i<num; i++){
            arr[i] = sc.next();
        }
        for(int i=0; i<num; i++){
            for (int j=i+1; j<num; j++){
                if(arr[i].length()>arr[j].length()){
                    String tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
                else if(arr[i].length() == arr[j].length()){
                    if(arr[i].compareTo(arr[j])>0){
                        String tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }

        for(int i=0; i<num; i++){
            if(i!=0){
                if(arr[i].equals(arr[i-1])){
                    continue;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
