package Java_day4_baitap_Encapsulation.HinhChuNhat;

public class HinhChuNhat {
    private double chieuDai = 1.0;
    private double chieuRong = 1.0;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        if (chieuDai <= 0 || chieuRong <= 0) {
            System.out.println("Cạnh phải là số dương");
            System.out.println("Kích thước mặc định 1x1");
        } else {
            this.chieuDai = chieuDai;
            this.chieuRong = chieuRong;
        }

    }

    public double chuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public double dienTich() {
        return chieuRong * chieuDai;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        if (chieuDai > 0) {
            this.chieuDai = chieuDai;
        } else {
            System.out.println("Cạnh phải là số dương");
        }
    }

    public void setChieuRong(double chieuRong) {
        if (chieuRong > 0) {
            this.chieuRong = chieuRong;
        } else {
            System.out.println("Cạnh phải là số dương");
        }
    }


    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                "chuVi=" + chuVi() +
                "dienTich" + dienTich() +

                '}';
    }
}

