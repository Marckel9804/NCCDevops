package org.Study.Mar.s11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SecurityDongn {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());

        int cnt = 0, dt = 0;
        int[] map = new int[k];

        for (int i = 0; i < k + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int dir = Integer.parseInt(st.nextToken());
            int loc = Integer.parseInt(st.nextToken());
            int tmp = 0;
            if (dir==1){
                tmp = loc;
            } else if(dir==2){
                tmp = n + m + n - loc;
            } else if(dir==3){
                tmp = n + m + n + m - loc;
            } else {
                tmp = n + loc;
            }
            if (i < k) map[i] = tmp;
            else dt = tmp;
        }
        for (int i = 0; i < k; i++) {
            int path1 = Math.abs(dt - map[i]);
            int path2 = 2 * n + 2 * m - path1;
            cnt += Math.min(path1, path2);
        }
        System.out.println(cnt);
    }
}
