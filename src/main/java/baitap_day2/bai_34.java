package baitap_day2;

import java.util.Scanner;

public class bai_34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;  float S = 0;
        System.out.println("nhap vao n:");
        n = in.nextInt();
        for(int i = 1; i < n; i++){
            S += Math.sqrt(i + S);
        }
        System.out.println(S);
    }
}
