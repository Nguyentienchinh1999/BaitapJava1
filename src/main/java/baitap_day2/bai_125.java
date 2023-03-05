package baitap_day2;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

public class bai_125 {
    int a[];
    public boolean KiemTraNguyenTo(int n){

        if(n<2)
        {
            return false;
        }

        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public void nhapMang(){
        Random random = new Random();
        Scanner  scan = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n=scan.nextInt();
        a = new int[n];
        for (int i=0; i<a.length;i++)
        {
            a[i] = random.nextInt(100);
        }
    }
    public void xuatMang()
    {
        for (int i=0; i<a.length;i++){
            System.out.print(a[i]+ "\t");
        }
        System.out.println();
    }
    public void xuatSoNguyenTo(){
        for (int i=0; i<a.length;i++){
            if(KiemTraNguyenTo (a[i])){
                System.out.print(a[i]+ "\t");
            }
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        bai_125 kt = new bai_125();
        kt.nhapMang();
        System.out.println("Mảng đã nhập là:");
        kt.xuatMang();
        System.out.println("Các số nguyên tố trong mảng đã nhập: ");
        kt.xuatSoNguyenTo();
    }
}
